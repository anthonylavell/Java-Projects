package leetcode.arrays.testing;

import leetcode.arrays.TwoArrays;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

class IntersectionOfTwoArraysTest {

    @Test
    public void returnValuesArray() {
        int[] nums1 = {2, 2};
        int[] nums2 = {1, 2, 2, 1};
        int[] resultArray = {2, 2};
        Assertions.assertEquals(Arrays.toString(resultArray), Arrays.toString(TwoArrays.intersect(nums1, nums2)));

        int[] nums3 = new int[]{9, 4, 9, 8, 4};
        int[] nums4 = new int[]{4, 9};
        int[] resultArray2 = {4, 9};
        Assertions.assertEquals(Arrays.toString(resultArray2), Arrays.toString(TwoArrays.intersect(nums3, nums4)));

        int [] nums5 = {4,9,5};
        int [] nums6 = {9,4,9,8,4};
        int[] resultArray3 = {9,4};
        Assertions.assertEquals(Arrays.toString(resultArray3), Arrays.toString(TwoArrays.intersect(nums5, nums6)));

    }

    @Test
    public void returnEmptyArray(){
        int [] nums1 = {4,3,9,3,1,9,7,6,9,7}; //[4,3,9,3,1,9,7,6,9,7]
        int [] nums2 = {5,0,8};//[5,0,8]
        int [] resultArray = new int[0];
        Assertions.assertEquals(Arrays.toString(resultArray), Arrays.toString(TwoArrays.intersect(nums1,nums2)));
    }


}