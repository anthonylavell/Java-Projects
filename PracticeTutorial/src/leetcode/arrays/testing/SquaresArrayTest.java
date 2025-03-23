package leetcode.arrays.testing;

import leetcode.arrays.SquaresArray;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

class SquaresArrayTest {
    @Test
    public void sortedSquaresTest(){
        int [] nums = {-4,-1,0,3,10};
        int [] result = {0, 1, 9, 16, 100};
        Assertions.assertEquals(Arrays.toString(result),Arrays.toString(SquaresArray.sortedSquares(nums)));

        int [] nums2 = {-7,-3,2,3,11};
        int [] result2 = {4,9,9,49,121};
        Assertions.assertEquals(Arrays.toString(result2),Arrays.toString(SquaresArray.sortedSquares(nums2)));

    }

}