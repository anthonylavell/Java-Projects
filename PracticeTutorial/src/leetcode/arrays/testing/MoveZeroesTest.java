package leetcode.arrays.testing;

import leetcode.arrays.Zeroes;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

class MoveZeroesTest {
    @Test
    public void moveAllZeroesToTheEndOfTheArray() {
        int [] nums = {1,0,0,1,2};
        int [] result = {1,1,2,0,0};
        Zeroes.moveZeroes(nums);
        Assertions.assertEquals(Arrays.toString(result), Arrays.toString(nums));

        int [] nums2 = {0,0,0,0,2};
        int [] result2 = {2,0,0,0,0};
        Zeroes.moveZeroes(nums2);
        Assertions.assertEquals(Arrays.toString(result2), Arrays.toString(nums2));

        int [] nums3 = {1,1,1,1,2};
        int [] result3 = {1,1,1,1,2};
        Zeroes.moveZeroes(nums3);
        Assertions.assertEquals(Arrays.toString(result3), Arrays.toString(nums3));

        int [] nums4 = {1,0,0,0,2};
        int [] result4 = {1,2,0,0,0};
        Zeroes.moveZeroes(nums4);
        Assertions.assertEquals(Arrays.toString(result4), Arrays.toString(nums4));

        int [] nums5 = {0,0,0,0,0};
        int [] result5 = {0,0,0,0,0};
        Zeroes.moveZeroes(nums5);
        Assertions.assertEquals(Arrays.toString(result5), Arrays.toString(nums5));

        int [] nums6 = {0,1,0,3,12};
        int [] result6 = {1,3,12,0,0};
        Zeroes.moveZeroes(nums6);
        Assertions.assertEquals(Arrays.toString(result6), Arrays.toString(nums6));
    }

}