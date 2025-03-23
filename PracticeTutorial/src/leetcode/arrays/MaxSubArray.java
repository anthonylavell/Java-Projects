/*
Given an integer array nums, find the contiguous
subarray (containing at least one number) which has the largest sum and return its sum.
*/
package leetcode.arrays;
public class MaxSubArray {
    public static void main(String[] args) {
        int [] arrOfNum = {-2,1,-3,4,-1,2,1,-5,6};
        System.out.println(maxSubArray(arrOfNum));
    }
    public static int maxSubArray(int[] nums) {
        int runningTotal = 0;
        int total = Integer.MIN_VALUE;
        for(int num : nums){
            runningTotal += num;
            if(runningTotal>total){
                total=runningTotal;
            }
            if(runningTotal < 0){
                runningTotal=0;
            }

        }
        return total;
    }
}
