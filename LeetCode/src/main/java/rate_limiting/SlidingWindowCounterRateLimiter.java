package rate_limiting;

import java.util.concurrent.TimeUnit;

/**
 * A thread‑safe “sliding‑window counter” rate limiter.
 *
 * Divides the total window into N buckets. On each request, it:
 * 1) Advances the “current” bucket based on the timestamp,
 *    zeroing buckets that have fallen out of the window.
 * 2) Sums counts across all buckets to get the current window total.
 * 3) If below maxRequests, increments the current bucket and allows;
 *    otherwise rejects.
 */
public class SlidingWindowCounterRateLimiter {

    private final int maxRequests;
    private final long windowSizeInMillis;
    private final int bucketCount;
    private final long bucketSizeInMillis;

    private final long[] buckets;
    private long windowStartTimestamp;

    /**
     * @param maxRequests     maximum number of requests allowed per window
     * @param windowSize      total size of the rolling window
     * @param windowUnit      time unit for the windowSize
     * @param bucketCount     number of sub‑windows (buckets) to split the window into
     */
    public SlidingWindowCounterRateLimiter(int maxRequests,
                                           long windowSize,
                                           TimeUnit windowUnit,
                                           int bucketCount) {
        if (maxRequests <= 0 || windowSize <= 0 || bucketCount <= 0) {
            throw new IllegalArgumentException("All parameters must be positive");
        }
        this.maxRequests = maxRequests;
        this.windowSizeInMillis = windowUnit.toMillis(windowSize);
        this.bucketCount = bucketCount;
        this.bucketSizeInMillis = windowSizeInMillis / bucketCount;

        this.buckets = new long[bucketCount];
        this.windowStartTimestamp = System.currentTimeMillis();
    }

    // Example usage
    public static void main(String[] args) throws InterruptedException {
        // allow 10 requests per 10-second window, split into 5 buckets of 2s each
        SlidingWindowCounterRateLimiter limiter =
                new SlidingWindowCounterRateLimiter(10, 10, TimeUnit.SECONDS, 5);

        for (int i = 1; i <= 15; i++) {
            boolean ok = limiter.tryAcquire();
            System.out.printf("Req %2d: %s (in-window=%d)%n",
                    i, ok ? "ALLOWED" : "BLOCKED",
                    limiter.getCurrentWindowCount());
            Thread.sleep(1000);
        }
    }

    /**
     * Attempts to acquire permission for a single request.
     *
     * @return true if allowed; false if rate limit exceeded.
     */
    public synchronized boolean tryAcquire() {
        long now = System.currentTimeMillis();
        advanceWindow(now);

        long totalInWindow = 0;
        for (long count : buckets) {
            totalInWindow += count;
        }

        if (totalInWindow < maxRequests) {
            int currentBucket = getBucketIndex(now);
            buckets[currentBucket]++;
            return true;
        } else {
            return false;
        }
    }

    /**
     * Advances the sliding window: zeroes out buckets that have moved
     * out of the window.
     */
    private void advanceWindow(long now) {
        long elapsed = now - windowStartTimestamp;
        if (elapsed <= 0) {
            return;
        }

        long bucketsToAdvance = Math.min(bucketCount, elapsed / bucketSizeInMillis);
        for (int i = 1; i <= bucketsToAdvance; i++) {
            int idx = (getBucketIndex(windowStartTimestamp) + i) % bucketCount;
            buckets[idx] = 0;
        }

        if (elapsed >= windowSizeInMillis) {
            // we've moved at least one full window; reset start to now-windowSize
            windowStartTimestamp = now - (now % bucketSizeInMillis);
        } else {
            windowStartTimestamp += bucketsToAdvance * bucketSizeInMillis;
        }
    }

    /**
     * Computes which bucket index corresponds to the given timestamp.
     */
    private int getBucketIndex(long timestamp) {
        long bucketNumber = (timestamp / bucketSizeInMillis);
        return (int)(bucketNumber % bucketCount);
    }

    // For testing or monitoring:
    public synchronized long getCurrentWindowCount() {
        long now = System.currentTimeMillis();
        advanceWindow(now);
        long total = 0;
        for (long c : buckets) total += c;
        return total;
    }
}

