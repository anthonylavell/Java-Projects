/**
 * A simple thread-safe token-bucket rate limiter.
 */
package rate_limiting;

import java.util.concurrent.TimeUnit;

/**
 * A simple thread-safe token-bucket rate limiter.
 */
public class TokenBucketRateLimiter {

    private final long capacity;
    private final long refillTokens;
    private final long refillPeriodMillis;

    private double availableTokens;
    private long lastRefillTimestamp;

    /**
     * @param capacity         maximum number of tokens in the bucket (burst size)
     * @param refillTokens     number of tokens to add each interval
     * @param refillPeriod     length of the interval
     * @param refillPeriodUnit unit of time for the interval
     */
    public TokenBucketRateLimiter(long capacity,
                                  long refillTokens,
                                  long refillPeriod,
                                  TimeUnit refillPeriodUnit) {
        if (capacity <= 0 || refillTokens <= 0 || refillPeriod <= 0) {
            throw new IllegalArgumentException("All parameters must be positive");
        }
        this.capacity = capacity;
        this.refillTokens = refillTokens;
        this.refillPeriodMillis = refillPeriodUnit.toMillis(refillPeriod);

        this.availableTokens = capacity;
        this.lastRefillTimestamp = System.currentTimeMillis();
    }

    // Example of usage
    public static void main(String[] args) throws InterruptedException {
        // capacity=5, refill 5 tokens every 1 second => steady rate of 5 req/s
        TokenBucketRateLimiter limiter = new TokenBucketRateLimiter(5, 5, 1, TimeUnit.SECONDS);

        // Try making 10 requests immediately
        for (int i = 1; i <= 10; i++) {
            boolean allowed = limiter.tryAcquire();
            System.out.printf("Request %2d: %s (tokens left=%.2f)%n",
                    i, allowed ? "allowed" : "blocked", limiter.getAvailableTokens());
            // sleep 200ms between requests
            Thread.sleep(200);
        }
    }

    /**
     * Attempts to acquire a single token. Returns {@code true} if successful,
     * or {@code false} if no tokens are available.
     */
    public synchronized boolean tryAcquire() {
        refill();
        if (availableTokens >= 1) {
            availableTokens -= 1;
            return true;
        }
        return false;
    }

    /**
     * Refills the bucket with tokens based on how much time has passed
     * since the last refill.
     */
    private void refill() {
        long now = System.currentTimeMillis();
        long delta = now - lastRefillTimestamp;
        if (delta <= 0) {
            return;
        }

        // How many intervals have passed?
        long intervals = delta / refillPeriodMillis;
        if (intervals > 0) {
            double tokensToAdd = intervals * refillTokens;
            availableTokens = Math.min(capacity, availableTokens + tokensToAdd);
            // Advance the timestamp by the number of intervals
            lastRefillTimestamp += intervals * refillPeriodMillis;
        }
    }

    /**
     * Returns the current number of available tokens (for monitoring / testing).
     */
    public synchronized double getAvailableTokens() {
        refill();
        return availableTokens;
    }
}
