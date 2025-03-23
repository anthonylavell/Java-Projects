package leetcode.string.test;

import leetcode.arrays.MaxSubArray;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class SubArrayTest {
    @Test
    public void findSubArrayTotal(){
        int [] arrOfNum = {-2,1,-3,4,-1,2,1,-5,4};
        int result = 6;
        Assertions.assertEquals(result, MaxSubArray.maxSubArray(arrOfNum));
        int [] arrOfNum2 = {-2,1,-3,4,-1,2,1,-5,6};
        result = 7;
        Assertions.assertEquals(result, MaxSubArray.maxSubArray(arrOfNum2));
        int [] arrOfNum3 = {1};
        result = 1;
        Assertions.assertEquals(result, MaxSubArray.maxSubArray(arrOfNum3));
        int [] arrOfNum4 = {-2,-1,-4,-5};
        result = -1;
        Assertions.assertEquals(result, MaxSubArray.maxSubArray(arrOfNum4));
    }

}