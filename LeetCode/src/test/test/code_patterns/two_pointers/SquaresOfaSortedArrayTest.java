package code_patterns.two_pointers;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SquaresOfaSortedArrayTest {

    @Test
    void sortedSquares() {
        int [] numbers = {-4,-1,0,3,10};
        int [] testResults = {0,1,9,16,100};
        assertArrayEquals(testResults , SquaresOfASortedArray.sortedSquares(numbers));

        int [] numbers2 = {-7,-3,2,3,11};
        int [] testResults2 = {4,9,9,49,121};
        assertArrayEquals(testResults2 , SquaresOfASortedArray.sortedSquares(numbers2));

        int [] numbers3 = {-5,-3,-2,-1};
        int [] testResults3 = {1,4,9,25};
        assertArrayEquals(testResults3 , SquaresOfASortedArray.sortedSquares(numbers3));
    }
}