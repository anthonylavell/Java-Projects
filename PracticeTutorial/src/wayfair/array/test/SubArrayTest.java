package wayfair.array.test;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import wayfair.array.SubArray;

class SubArrayTest {
    @Test
    public void testFindLength(){
        int [] nums1 = {1,2,3,2,1};
        int [] nums2 = {3,2,1,4,7};
        int result = 3;
        Assertions.assertEquals(result, SubArray.findLength(nums1,nums2));

        int [] nums3 = {0,0,0,0,0};
        int [] nums4 = {0,0,0,0,0};
        int result2 = 5;
        Assertions.assertEquals(result2, SubArray.findLength(nums3,nums4));

        int [] nums5 = {1,4,7,3,2};
        int [] nums6 = {3,2,1,4,7};
        int result3 = 3;
        Assertions.assertEquals(result3, SubArray.findLength(nums5,nums6));

        int [] nums7 = {70,39,25,40,7};
        int [] nums8 = {52,20,67,5,31};
        int result4 = 0;
       Assertions.assertEquals(result4, SubArray.findLength(nums7,nums8));

        int [] nums9 = {0,0,0,0,0,0,1,0,0,0};
        int [] nums10 ={0,0,0,0,0,0,0,1,0,0};
        int result5 = 9;
        Assertions.assertEquals(result5, SubArray.findLength(nums9,nums10));
    }

}