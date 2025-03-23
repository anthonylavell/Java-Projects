package leetcode.arrays.testing;

import leetcode.arrays.Sorted;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

class SortedSquaresTest {
    @Test
    public void arraySquareInSortedOrder(){
        int [] array = {-4,-1,2,3,10};
        int [] tempArray = {1,4,9,16,100};
        Assertions.assertEquals(Arrays.toString(tempArray), Arrays.toString(Sorted.sortedSquares(array)));
        int [] array2 = {-5,-3,-2,-1};
        int [] tempArray2 = {1,4,9,25};
        Assertions.assertEquals(Arrays.toString(tempArray2), Arrays.toString(Sorted.sortedSquares(array2)));
    }
}