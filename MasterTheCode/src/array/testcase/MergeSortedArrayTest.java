package array.testcase;

import array.MergeSortedArray;
import binarysearch.Binary;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

class MergeSortedArrayTest {
    @Test
    public void testMergeMethodWithNoElementInFirstArrayAndThreeElementInSecondArray(){
        int num1 [] = {0};
        int m = 0;
        int num2 [] = {1,2,3};
        int n = 3;
        int [] expected = {1,2,3};
       // Assertions.assertEquals(Arrays.toString(expected), Arrays.toString(MergeSortedArray.merge(num1,m,num2,n)));
    }

    @Test
    public void testMergeMethodWithNoElementInFirstArrayAndOneElementInSecondArray(){
        int num1 [] = {0};
        int m = 0;
        int num2 [] = {1};
        int n = 1;
        int [] expected = {1};
        //Assertions.assertEquals(Arrays.toString(expected), Arrays.toString(MergeSortedArray.merge(num1,m,num2,n)));
    }

}