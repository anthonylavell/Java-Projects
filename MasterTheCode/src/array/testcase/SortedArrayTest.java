package array.testcase;

import array.MostWater;
import array.SortedArray;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

class SortedArrayTest {

    @Test
    public void returnSortedArray(){
        int [] array = {-4,-1,2,3,10};
        int [] tempArray = {1,4,9,16,100};
        Assertions.assertEquals(Arrays.toString(tempArray), Arrays.toString(SortedArray.sortedSquares(array)));
        int [] array2 = {-5,-3,-2,-1};
        int [] tempArray2 = {1,4,9,25};
        Assertions.assertEquals(Arrays.toString(tempArray2), Arrays.toString(SortedArray.sortedSquares(array2)));
        /*int [] array3 = {4,3,2,1,4};
        assertEquals(16, MostWater.getContain(array3));
        int [] array4 = {1,2};
        assertEquals(1, MostWater.getContain(array4));*/

    }

}