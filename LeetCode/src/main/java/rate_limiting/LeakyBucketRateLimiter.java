package rate_limiting;

import java.util.concurrent.TimeUnit;

/**
 * A thread‑safe “leaky‑bucket” rate limiter.
 *
 * The bucket leaks at a constant rate (leakRate tokens per unit time).
 * Incoming requests add a token (if the bucket isn’t full) or are rejected.
 */
public class LeakyBucketRateLimiter {

    private final double capacity;
    private final double leakRatePerMillis; // tokens leaked per millisecond

    private double waterLevel;
    private long lastLeakTimestamp;

    /**
     * @param capacity      maximum number of tokens the bucket can hold (burst size)
     * @param leakRate      number of tokens to leak each timeUnit
     * @param timeUnit      unit for the leakRate (e.g., TimeUnit.SECONDS)
     */
    public LeakyBucketRateLimiter(double capacity,
                                  double leakRate,
                                  TimeUnit timeUnit) {
        if (capacity <= 0 || leakRate <= 0) {
            throw new IllegalArgumentException("capacity and leakRate must be positive");
        }
        this.capacity = capacity;
        // convert leakRate per timeUnit into tokens per millisecond
        this.leakRatePerMillis = leakRate / timeUnit.toMillis(1);
        this.waterLevel = 0.0;
        this.lastLeakTimestamp = System.currentTimeMillis();
    }

    // Example usage
    public static void main(String[] args) throws InterruptedException {
        // capacity=5 tokens, leaks at 5 tokens per 1 second => steady drain of 5 tokens/sec
        LeakyBucketRateLimiter limiter = new LeakyBucketRateLimiter(5, 5, TimeUnit.SECONDS);

        // Simulate 10 requests arriving 200ms apart
        for (int i = 1; i <= 10; i++) {
            boolean allowed = limiter.tryAcquire();
            System.out.printf(
                    "Request %2d: %s (waterLevel=%.2f)%n",
                    i,
                    allowed ? "ALLOWED" : "REJECTED",
                    limiter.getWaterLevel()
            );
            Thread.sleep(200);
        }
    }

    /**
     * Attempts to acquire permission for a single request.
     *
     * @return true if the request is allowed (and adds one token), false if the bucket is full.
     */
    public synchronized boolean tryAcquire() {
        leak();
        if (waterLevel < capacity) {
            waterLevel += 1.0;
            return true;
        } else {
            return false;
        }
    }

    /**
     * Calculates how much water has leaked since the last check,
     * and reduces the water level accordingly.
     */
    private void leak() {
        long now = System.currentTimeMillis();
        long delta = now - lastLeakTimestamp;
        if (delta <= 0) {
            return;
        }

        double leaked = delta * leakRatePerMillis;
        waterLevel = Math.max(0.0, waterLevel - leaked);
        lastLeakTimestamp = now;
    }

    /**
     * For monitoring or testing: returns the current water level (approximate queue length).
     */
    public synchronized double getWaterLevel() {
        leak();
        return waterLevel;
    }
}

