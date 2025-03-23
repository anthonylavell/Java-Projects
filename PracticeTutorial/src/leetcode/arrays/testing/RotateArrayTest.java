package leetcode.arrays.testing;

import leetcode.arrays.RotateArray;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

class RotateArrayTest {

    @Test
    public void testRotateArray(){
        int [] nums = new int [] {1,2,3,4,5,6,7};
        int k = 3;
        RotateArray.rotate(nums,k);
        int [] tempArray = new int [] {5,6,7,1,2,3,4};
        Assertions.assertEquals(Arrays.toString(tempArray), Arrays.toString(nums));
        int [] nums2 = new int [] {-1,-100,3,99};//[-11,-7,-3,2,3]
        k=2;
        RotateArray.rotate(nums2,k);
        int [] tempArray2 = new int [] {3,99,-1,-100};
        Assertions.assertEquals(Arrays.toString(tempArray2), Arrays.toString(nums2));

        int [] nums3 = new int [] {3,4,5,6,99,-10,-9,-8,1,2};//[-11,-7,-3,2,3]
        k=5;
        RotateArray.rotate(nums3,k);
        int [] tempArray3 = new int [] {-10,-9,-8,1,2,3,4,5,6,99};
        Assertions.assertEquals(Arrays.toString(tempArray3), Arrays.toString(nums3));

        int [] nums4 = new int [] {1,99};//[-11,-7,-3,2,3]
        k=5;
        int [] tempArray4 = new int [] {99,1};
        RotateArray.rotate(nums4,k);
        Assertions.assertEquals(Arrays.toString(tempArray4), Arrays.toString(nums4));

        int [] nums5 = new int [] {1};//[-11,-7,-3,2,3]
        k=5;
        int [] tempArray5 = new int [] {1};
        RotateArray.rotate(nums5,k);
        Assertions.assertEquals(Arrays.toString(tempArray5), Arrays.toString(nums5));


    }
}