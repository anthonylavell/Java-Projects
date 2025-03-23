/*
Given an array (list) nums consisted of only non-negative integers,
find the largest sum among all subarrays of length k in nums.

For example, if the input is nums = [1, 2, 3, 7, 4, 1], k = 3, then
the output would be 14 as the largest length 3 subarray sum is given
by [3, 7, 4] which sums to 14.
 */
package code.pattern.two_pointers;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class SubArraySumFixed {
    public static void main(String[] args) {
        List<Integer> nums = new ArrayList<>(Arrays.asList(1, 2, 3, 7, 4, 1));
        int k = 3;
        System.out.println(subArraySumFixed(nums,k));
    }

    public static int subArraySumFixed(List<Integer> nums, int k) {
        // WRITE YOUR BRILLIANT CODE HERE
        int leftIndex = 0;
        int subTotal =0;
        int total = 0;
        for (int rightIndex = 0; rightIndex < nums.size(); rightIndex++){
            subTotal+=nums.get(rightIndex);
            if((rightIndex-leftIndex) == (k-1)){
                total = Math.max(total,subTotal);
                subTotal-=nums.get(leftIndex);
                leftIndex++;
            }
        }
        return total;
    }
}
