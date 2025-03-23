package array;

import java.util.Arrays;

/*
Given an array, rotate the array to the right by k steps, where k is non-negative.
Input: nums = [1,2,3,4,5,6,7], k = 3
Output: [5,6,7,1,2,3,4]
Explanation:
rotate 1 steps to the right: [7,1,2,3,4,5,6]
rotate 2 steps to the right: [6,7,1,2,3,4,5]
rotate 3 steps to the right: [5,6,7,1,2,3,4]
 */

public class RotateArray {
    public static void main(String[] args) {
        //int [] nums = new int [] {1,2,3,4,5,6,7};
        int k = 3;
        int [] nums = new int [] {-1,-100,3,99};//[-11,-7,-3,2,3]
        k=2;
        //int [] nums = new int [] {1,99};//[-11,-7,-3,2,3]
        //k=5;
        System.out.println(Arrays.toString(rotate(nums,k)));
    }
    public static int[] rotate(int[] nums, int k) {
        int modular= k % nums.length;

        if(modular == 0){
            return nums;
        }

        int [] arr1 = new int[modular];
        System.arraycopy(nums,nums.length-modular,arr1,0,modular);
        System.arraycopy(nums,0,nums,modular,nums.length-modular);
        System.arraycopy(arr1,0,nums,0,modular);
        return nums;
    }

    public static int[] rotate2(int[] nums, int k) {
        int [] arr1 = new int[nums.length];
        while (k >0){
            int tempNum = nums[nums.length-1];
            System.arraycopy(nums, 0, nums, 1, arr1.length-1);
            nums[0]=tempNum;
            k--;
        }
        return nums;
    }
}
