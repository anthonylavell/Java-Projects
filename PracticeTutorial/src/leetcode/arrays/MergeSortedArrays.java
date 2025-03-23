package leetcode.arrays;

import java.util.Arrays;

public class MergeSortedArrays {
    public static void main(String[] args) {
       /* int num1 [] = {1,2,3,0,0,0};
        int m = 3;
        int num2 [] = {1,5,6};
        int n = 3;*/

       /* int num1[] = {0};
        int m = 0;
        int num2[] = {1};
        int n = 1;
        int [] expected = {1,2,2,3,5,6};*/
        /*int num1 [] = {2,0};
        int m = 1;
        int num2 [] = {1};
        int n = 1;*/
        int num1 [] = {1,2,3,0,0,0};
        int m = 3;
        int num2 [] = {2,5,6};
        int n = 3;
        MergeSortedArrays.merge(num1,m,num2,n);
        System.out.println("num1: "+ Arrays.toString(num1));
    }
    public static void merge(int[] nums1, int m, int[] nums2, int n) {
       if(n==0){
           return;
       }
       n--;
       m--;
       for(int i = nums1.length-1; i >=0; i--){
           if( n < 0 || (m >=0 && nums1[m] > nums2[n])){
               nums1[i] = nums1[m];
               m--;
           }else {
               nums1[i] = nums2[n];
               n--;
           }
        }

    }
}
