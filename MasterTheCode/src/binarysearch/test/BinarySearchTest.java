package binarysearch.test;

import binarysearch.Binary;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class BinarySearchTest {

    @Test
    public void findTargetNine(){
        int [] nums = new int [] {-1,0,1,2,3,4,5,9,12,14,16};
        int target = 9;
        Assertions.assertEquals(7, Binary.search(nums,target));
    }

    @Test
    public void findTargetElven(){
        int [] nums = new int [] {1,2,5,7,9,11,12};
        int target = 11;
        Assertions.assertEquals(5, Binary.search(nums,target));
    }

    @Test
    public void findTargetFive(){
        int [] nums = new int [] {-3,-1,0,1,2,4,5,7,9,11,12};
        int target = 5;
        Assertions.assertEquals(6, Binary.search(nums,target));
    }

    @Test
    public void findTargetTwo(){
        int [] nums = new int [] {-2,-1,0,1,2,4,5,7,9};
        int target = 2;
        Assertions.assertEquals(4, Binary.search(nums,target));
    }

    @Test
    public void findTargetNegOne(){
        int [] nums = new int [] {-1,0,3,5,9,12};
        int target = 2;
        Assertions.assertEquals(-1, Binary.search(nums,target));
    }

    @Test
    public void findTargetThree(){
        int [] nums = new int [] {3};
        int target = 3;
        Assertions.assertEquals(0, Binary.search(nums,target));
    }

}