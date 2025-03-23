package wayfair.dp.test;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import wayfair.dp.MinSizeSubArraySum;

import static org.junit.jupiter.api.Assertions.*;

class MinSizeSubArraySumTest {
    @Test
    public void testMinSubArrayLen(){
        int target = 7;
        int[] nums = {2,3,1,2,4,3};
        int total = 2;
        Assertions.assertEquals(total, MinSizeSubArraySum.minSubArrayLen(target,nums));

        int target2 = 4;
        int[] nums2 = {1,4,4};
        int total2 = 1;
        Assertions.assertEquals(total2, MinSizeSubArraySum.minSubArrayLen(target2,nums2));

        int target3 = 11;
        int[] nums3 = {1,1,1,1,1,1,1,1};
        int total3 = 0;
        Assertions.assertEquals(total3, MinSizeSubArraySum.minSubArrayLen(target3,nums3));
    }

}