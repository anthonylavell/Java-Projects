package grinder.dp.zero_one_knapsack;

import org.junit.Assert;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PartitionEqualSubsetSumTest {

    @Test
    void testCanPartition_true() {
        int [] nums = new int[]{1,2,3,5};
        Assert.assertTrue(PartitionEqualSubsetSum.canPartition(nums));

    }

    @Test
    void testCanPartition_false() {
        int [] nums = {1,2,3,5};
        Assert.assertFalse(PartitionEqualSubsetSum.canPartition(nums));

    }
}