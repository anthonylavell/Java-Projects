package leetcode.arrays.testing;

import leetcode.arrays.SumTwo;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

class SumTwoTest {
    @Test
    public void testForIndices(){
        int [] nums = {2,7,11,15};
        int target = 9;
        int [] result = {1,2};
        Assertions.assertEquals(Arrays.toString(result),Arrays.toString(SumTwo.twoSum(nums,target)));

        int [] nums2 = {2,3,4};
        int target2 = 6;
        int [] result2 = {1,3};
        Assertions.assertEquals(Arrays.toString(result2),Arrays.toString(SumTwo.twoSum(nums2,target2)));

        int [] nums3 = {-1,0};
        int target3 = -1;
        int [] result3 = {1,2};
        Assertions.assertEquals(Arrays.toString(result3),Arrays.toString(SumTwo.twoSum(nums3,target3)));
    }

}