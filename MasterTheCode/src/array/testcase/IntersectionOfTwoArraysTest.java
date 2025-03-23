package array.testcase;

import array.IntersectionOfTwoArrays;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

class IntersectionOfTwoArraysTest {

    @Test
    public void returnValuesArray(){
        int [] nums1 = {2,2};
        int [] nums2 = {1,2,2,1};
        int [] resultArray = {2,2};
        Assertions.assertEquals(Arrays.toString(resultArray), Arrays.toString(IntersectionOfTwoArrays.intersect(nums1,nums2)));

        int [] nums3 = new int [] {9,4,9,8,4};
        int [] nums4 = new int [] {4,9};
        int [] resultArray2 = {9,4};
        Assertions.assertEquals(Arrays.toString(resultArray2), Arrays.toString(IntersectionOfTwoArrays.intersect(nums3,nums4)));

        /*int [] nums5 = {4,3,9,3,1,9,7,6,9,7}; //[4,3,9,3,1,9,7,6,9,7]
        int [] nums6 = new int [] {5,0,8};//[5,0,8]
        int [] resultArray3 = new int[0];
        Assertions.assertEquals(Arrays.toString(resultArray), Arrays.toString(IntersectionOfTwoArrays.intersect(nums5,nums6)));*/
    }

    @Test
    public void returnEmptyArray(){
        int [] nums1 = {4,3,9,3,1,9,7,6,9,7}; //[4,3,9,3,1,9,7,6,9,7]
        int [] nums2 = new int [] {5,0,8};//[5,0,8]
        int [] resultArray = new int[0];
        Assertions.assertEquals(Arrays.toString(resultArray), Arrays.toString(IntersectionOfTwoArrays.intersect(nums1,nums2)));
    }


}