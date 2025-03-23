package leetcode.arrays.testing;

import leetcode.arrays.MergeSortedArrays;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

class MergeSortedArrayTest {

    @Test
    public void testMergeMethodWithElementInFirstArrayAndSecondArray(){

        int num1 [] = {1,2,3,0,0,0};
        int m = 3;
        int num2 [] = {2,5,6};
        int n = 3;
        int [] expected = {1,2,2,3,5,6};
        MergeSortedArrays.merge(num1,m,num2,n);
        Assertions.assertEquals(Arrays.toString(expected), Arrays.toString(num1));

        int num3 [] = {1,0};
         m = 1;
        int num4 [] = {1};
         n = 1;
        int [] expected2 = {1,1};
        MergeSortedArrays.merge(num3,m,num4,n);
        Assertions.assertEquals(Arrays.toString(expected2), Arrays.toString(num3));

        int num5 [] = {2,0};
        m = 1;
        int num6 [] = {1};
        n = 1;
        int [] expected3 = {1,2};
        MergeSortedArrays.merge(num5,m,num6,n);
        Assertions.assertEquals(Arrays.toString(expected3), Arrays.toString(num5));
    }

    @Test
    public void testMergeMethodWithNoElementInFirstArrayAndThreeElementInSecondArray(){
        int num1 [] = {0,0,0};
        int m = 0;
        int num2 [] = {1,2,3};
        int n = 3;
        int [] expected = {1,2,3};
        MergeSortedArrays.merge(num1,m,num2,n);
        Assertions.assertEquals(Arrays.toString(expected), Arrays.toString(num1));
    }

    @Test
    public void testMergeMethodWithNoElementInFirstArrayAndOneElementInSecondArray() {
        int num1[] = {0};
        int m = 0;
        int num2[] = {1};
        int n = 1;
        int[] expected = {1};
        MergeSortedArrays.merge(num1,m,num2,n);
        Assertions.assertEquals(Arrays.toString(expected), Arrays.toString(num1));
    }

}