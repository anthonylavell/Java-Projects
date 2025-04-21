package rate_limiting;

import java.util.Deque;
import java.util.LinkedList;
import java.util.concurrent.TimeUnit;

/**
 * A thread‑safe “sliding‑window log” rate limiter.
 *
 * Allows up to {@code maxRequests} in any rolling window of {@code windowSize}.
 */
public class SlidingWindowLogRateLimiter {

    private final int maxRequests;
    private final long windowSizeInMillis;
    private final Deque<Long> timestamps = new LinkedList<>();

    /**
     * @param maxRequests     maximum number of requests allowed in each rolling window
     * @param windowSize      the size of the rolling window
     * @param windowSizeUnit  unit of time for the window size
     */
    public SlidingWindowLogRateLimiter(int maxRequests, long windowSize, TimeUnit windowSizeUnit) {
        if (maxRequests <= 0 || windowSize <= 0) {
            throw new IllegalArgumentException("maxRequests and windowSize must be positive");
        }
        this.maxRequests = maxRequests;
        this.windowSizeInMillis = windowSizeUnit.toMillis(windowSize);
    }

    // Example usage
    public static void main(String[] args) throws InterruptedException {
        // Allow up to 5 requests per 1 second sliding window
        SlidingWindowLogRateLimiter limiter = new SlidingWindowLogRateLimiter(5, 1, TimeUnit.SECONDS);

        // Simulate 10 incoming requests at ~100ms intervals
        for (int i = 1; i <= 10; i++) {
            boolean allowed = limiter.tryAcquire();
            System.out.printf("Request %2d: %s (in-window=%d)%n",
                    i,
                    allowed ? "ALLOWED" : "BLOCKED",
                    limiter.getCurrentWindowCount());
            Thread.sleep(100);
        }
    }

    /**
     * Attempts to acquire permission for a single request.
     *
     * @return true if the request is allowed; false if rate limit is exceeded.
     */
    public synchronized boolean tryAcquire() {
        long now = System.currentTimeMillis();
        pruneOldEntries(now);
        if (timestamps.size() < maxRequests) {
            timestamps.addLast(now);
            return true;
        } else {
            return false;
        }
    }

    /**
     * Removes timestamps older than the start of the current sliding window.
     */
    private void pruneOldEntries(long now) {
        long windowStart = now - windowSizeInMillis;
        while (!timestamps.isEmpty() && timestamps.peekFirst() < windowStart) {
            timestamps.removeFirst();
        }
    }

    /**
     * For monitoring or testing: returns the number of requests
     * in the current rolling window.
     */
    public synchronized int getCurrentWindowCount() {
        pruneOldEntries(System.currentTimeMillis());
        return timestamps.size();
    }
}

