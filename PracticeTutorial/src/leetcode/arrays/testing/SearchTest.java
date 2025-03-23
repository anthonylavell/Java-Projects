package leetcode.arrays.testing;

import leetcode.arrays.Search;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SearchTest {
    @Test
    public void findTargetTest(){
        int [] nums = {-1,0,3,5,9,12};
        int target = 9;
        int result = 4;
        Assertions.assertEquals(result, Search.binarySearch(nums,target));

        int [] nums2 = {2,6,8,10,14};
        int target2 = 2;
        int result2 = 0;
        Assertions.assertEquals(result2, Search.binarySearch(nums2,target2));

        int [] nums3 = {0,3,7,9,11};
        int target3 = 7;
        int result3 = 2;
        Assertions.assertEquals(result3, Search.binarySearch(nums3,target3));

        int [] nums4 = {0,2,12,18,36,42};
        int target4 = 18;
        int result4 = 3;
        Assertions.assertEquals(result4, Search.binarySearch(nums4,target4));

    }

    @Test
    public void findTargetTestWithReturnNegOne(){
        int [] nums = {-1,0,3,5,9,12};
        int target = -2;
        int result = -1;
        Assertions.assertEquals(result, Search.binarySearch(nums,target));

        int [] nums2 = {2,6,8,10,14};
        int target2 = 16;
        int result2 = -1;
        Assertions.assertEquals(result2, Search.binarySearch(nums2,target2));

        int [] nums3 = {0,3,7,9,11};
        int target3 = 2;
        int result3 = -1;
        Assertions.assertEquals(result3, Search.binarySearch(nums3,target3));

        int [] nums4 = {0,2,12,18,36,42};
        int target4 = 19;
        int result4 = -1;
        Assertions.assertEquals(result4, Search.binarySearch(nums4,target4));

    }

}