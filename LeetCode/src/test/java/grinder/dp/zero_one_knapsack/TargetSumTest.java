package grinder.dp.zero_one_knapsack;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class TargetSumTest {

    @Test
    void testFindTargetSumWays() {
        int[] nums = {1,1,1,1,1};
        int target = 3;
        int result = 5;
        assertEquals(result, TargetSum.findTargetSumWays(nums,target));

        int[] nums2 = {1};
        int target2 = 1;
        int result2 = 1;
        assertEquals(result2, TargetSum.findTargetSumWays(nums2,target2));

        int[] nums3 = {2,1,3,5};
        int target3 = 9;
        int result3 = 1;
        assertEquals(result3, TargetSum.findTargetSumWays(nums3,target3));
    }
}