/*
Given an integer array nums, return true if you can partition the
array into two subsets such that the sum of the elements in both
subsets is equal or false otherwise.
Example 1:

Input: nums = [1,5,11,5]
Output: true
Explanation: The array can be partitioned as [1, 5, 5] and [11].
Example 2:

Input: nums = [1,2,3,5]
Output: false
Explanation: The array cannot be partitioned into equal sum subsets.
*/


package grinder.dp.zero_one_knapsack;

import java.util.Arrays;

public class PartitionEqualSubsetSum{
    public static void main(String[] args) {
        int [] nums = {1,5,11,5};
        int [] nums2 = {2,2,1,1};
        int [] nums3 = {2,2,3,5};
        int [] nums4 = {100,4,6};
        int [] nums5 = {1,2,3,5};
        int [] nums6 = {1,2,5};
        System.out.println(canPartition(nums6));


    }

    public static boolean canPartition(int[] nums) {
        int sum = Arrays.stream(nums).sum();
        if (sum%2==1){
            return false;
        }
        sum/=2;
        int size = nums.length;
        boolean[][]dp = new boolean[size+1][sum+1];
        dp[0][0] = true;
        for (int row = 1; row <= size; row++){
            int num = nums[row-1];
            for (int col = 0; col <=sum; col++){
                dp[row][col] = dp[row-1][col];
                if (col>=num){
                    dp[row][col] = dp[row-1][col-num] || dp[row][col];
                }
            }
        }
        return dp[size][sum];
    }
}

