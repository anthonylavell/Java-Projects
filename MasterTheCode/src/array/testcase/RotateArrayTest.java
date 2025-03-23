package array.testcase;

import array.RotateArray;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

class RotateArrayTest {

    @Test
    public void testRotateArray(){
        int [] nums = new int [] {1,2,3,4,5,6,7};
        int k = 3;
        int [] tempArray = new int [] {5,6,7,1,2,3,4};
        Assertions.assertEquals(Arrays.toString(tempArray), Arrays.toString(RotateArray.rotate(nums,k)));
        int [] nums2 = new int [] {-1,-100,3,99};//[-11,-7,-3,2,3]
        k=2;
        int [] tempArray2 = new int [] {3,99,-1,-100};
        Assertions.assertEquals(Arrays.toString(tempArray2), Arrays.toString(RotateArray.rotate(nums2,k)));

        int [] nums3 = new int [] {3,4,5,6,99,-10,-9,-8,1,2};//[-11,-7,-3,2,3]
        k=5;
        int [] tempArray3 = new int [] {-10,-9,-8,1,2,3,4,5,6,99};
        Assertions.assertEquals(Arrays.toString(tempArray3), Arrays.toString(RotateArray.rotate(nums3,k)));
        int [] nums4 = new int [] {1,99};//[-11,-7,-3,2,3]
        k=5;
        int [] tempArray4 = new int [] {99,1};
        Assertions.assertEquals(Arrays.toString(tempArray4), Arrays.toString(RotateArray.rotate(nums4,k)));


    }

}