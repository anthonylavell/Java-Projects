/*
Given an integer array nums, return an array answer such
that answer[i] is equal to the product of all the elements of nums except nums[i].
*/
package leetcode.arrays;

import java.util.Arrays;

public class ProductArrayExceptSelf {
    public static void main(String[] args) {
        int [] nums = {1,2,3,4};
        int [] nums2 = {-1,1,0,-3,3};
        int [] nums3 = {0,0};
        System.out.println(0/1);
        System.out.println(Arrays.toString(productExceptSelf(nums)));

    }
    public static int[] productExceptSelf(int[] nums) {
        int [] totalArray = new int[nums.length];
        int [] leftIndex = new int[nums.length];
        int [] rightIndex = new int[nums.length];
        int count = 1;
        for(int i = 0; i < leftIndex.length; i++){
            if(i != 0){
                count*=nums[i-1];
            }

            leftIndex[i] = count;
        }
        count=1;

        for(int i = nums.length-1; i >=0; i--){
            if(i != nums.length-1){
                count*=nums[i+1];
            }

            rightIndex[i] = count;
        }

        for(int i = 0; i < leftIndex.length; i++){
            totalArray[i] = leftIndex[i]*rightIndex[i];
        }
        return totalArray;

    }
}
