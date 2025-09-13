package grinder.dp.zero_one_knapsack;

import org.junit.Assert;
import org.junit.jupiter.api.Test;

class PartitionEqualSubsetSumTest {

    @Test
    void testCanPartition_true() {
        int [] nums = {1,5,11,5};
        Assert.assertTrue(PartitionEqualSubsetSum.canPartition(nums));

    }

    @Test
    void testCanPartition_false() {
        int [] nums = {1,2,3,5};
        Assert.assertFalse(PartitionEqualSubsetSum.canPartition(nums));

        int [] nums2 = {2,2,3,5};
        Assert.assertFalse(PartitionEqualSubsetSum.canPartition(nums2));

        int [] nums4 = {100,4,6};
        Assert.assertFalse(PartitionEqualSubsetSum.canPartition(nums4));

        int [] nums5 = {1,2,5};
        Assert.assertFalse(PartitionEqualSubsetSum.canPartition(nums5));

    }
}