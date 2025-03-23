/*
A permutation of an array of integers is an arrangement
of its members into a sequence or linear order.
https://leetcode.com/problems/next-permutation/
 */
package leetcode.arrays;

import java.util.Arrays;

public class NextPermutation {
    public static void main(String[] args) {
        int[] nums = {1,2,3};
        int[] nums2 = {3,2,1};
        int[] nums3 = {1,1,5};
        int[] nums4 = {1,2};
        int[] nums5= {0,2,3,1};
        int[] nums6= {1,5,1};

        nextPermutation(nums6);
        System.out.println(Arrays.toString(nums6));
    }
    public static void nextPermutation(int[] nums) {
        int index = -1;
        int movingIndex =nums.length-1;
        int steadyIndex = nums.length-1;
        while (movingIndex>=0){
            if(movingIndex != nums.length-1 && nums[(movingIndex+1)] > nums[movingIndex]){
                if(nums[movingIndex]>=nums[steadyIndex]){
                    steadyIndex--;
                    continue;
                }
                index = movingIndex;
                break;
            }
            movingIndex--;
        }
        if(index != -1){
            swap(nums,index,steadyIndex);
        }
        sortArray(nums,index+1);
    }

    private static void swap(int[] nums, int left, int right){
        int temp = nums[right];
        nums[right] = nums[left];
        nums[left] = temp;
    }

    private static void sortArray(int[] nums, int left){
        Arrays.sort(nums,left,nums.length);
    }
}
