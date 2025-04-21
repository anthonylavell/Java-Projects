package rate_limiting;

import java.util.concurrent.TimeUnit;

/**
 * A thread‑safe fixed‑window counter rate limiter.
 *
 * Allows up to {@code maxRequests} per fixed window of {@code windowSize}.
 */
public class FixedWindowRateLimiter {

    private final int maxRequests;
    private final long windowSizeInMillis;

    // The index of the current window (e.g., epochMillis / windowSize)
    private long currentWindow;
    // Number of requests seen in the current window
    private int requestCount;

    /**
     * @param maxRequests     maximum number of requests allowed per window
     * @param windowSize      size of each window
     * @param windowSizeUnit  unit for the window size
     */
    public FixedWindowRateLimiter(int maxRequests, long windowSize, TimeUnit windowSizeUnit) {
        if (maxRequests <= 0 || windowSize <= 0) {
            throw new IllegalArgumentException("maxRequests and windowSize must be positive");
        }
        this.maxRequests = maxRequests;
        this.windowSizeInMillis = windowSizeUnit.toMillis(windowSize);
        // Initialize to an impossible window index so first request resets it
        this.currentWindow = -1;
        this.requestCount = 0;
    }

    // Example usage
    public static void main(String[] args) throws InterruptedException {
        // Allow 10 requests per 5‑second window
        FixedWindowRateLimiter limiter = new FixedWindowRateLimiter(10, 5, TimeUnit.SECONDS);

        // Simulate 15 requests arriving at 500ms intervals
        for (int i = 1; i <= 15; i++) {
            boolean allowed = limiter.tryAcquire();
            System.out.printf("Request %2d: %s (count this window=%d)%n",
                    i,
                    allowed ? "ALLOWED" : "BLOCKED",
                    limiter.getCurrentCount());
            Thread.sleep(500);
        }
    }

    /**
     * Attempts to acquire permission for a single request.
     *
     * @return true if the request is allowed; false if rate limit is exceeded.
     */
    public synchronized boolean tryAcquire() {
        long now = System.currentTimeMillis();
        long window = now / windowSizeInMillis;

        // If we've moved into a new window, reset the counter
        if (window != currentWindow) {
            currentWindow = window;
            requestCount = 0;
        }

        if (requestCount < maxRequests) {
            requestCount++;
            return true;
        } else {
            return false;
        }
    }

    /**
     * For monitoring: returns how many requests have been seen
     * in the current fixed window so far.
     */
    public synchronized int getCurrentCount() {
        // Optionally advance the window before reporting
        long now = System.currentTimeMillis();
        long window = now / windowSizeInMillis;
        if (window != currentWindow) {
            currentWindow = window;
            requestCount = 0;
        }
        return requestCount;
    }
}

