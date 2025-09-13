/*
You are given an integer array nums and an integer target.

You want to build an expression out of nums by adding one of the symbols '+' and '-'
before each integer in nums and then concatenate all the integers.

For example, if nums = [2, 1], you can add a '+' before 2 and a '-' before 1 and
concatenate them to build the expression "+2-1".
Return the number of different expressions that you can build, which evaluates to target.

Example 1:

Input: nums = [1,1,1,1,1], target = 3
Output: 5
Explanation: There are 5 ways to assign symbols to make the sum of nums be target 3.
-1 + 1 + 1 + 1 + 1 = 3
+1 - 1 + 1 + 1 + 1 = 3
+1 + 1 - 1 + 1 + 1 = 3
+1 + 1 + 1 - 1 + 1 = 3
+1 + 1 + 1 + 1 - 1 = 3
Example 2:

Input: nums = [1], target = 1
Output: 1
 */

package grinder.dp.zero_one_knapsack;

import java.util.Arrays;

public class TargetSum {
    public static void main(String[] args) {
        int[] nums = {1,1,1,1,1};
        int target = 3;

        int[] nums3 = {2,1,3,5};
        int target3 = 9;

        int[] nums4 = {2,1,3};
        int target4 = 10;

        System.out.println(findTargetSumWays(nums4,target4));
    }

    public static int findTargetSumWays(int[] nums, int target) {
       int sum = Arrays.stream(nums).sum();
       if (sum < target || (sum-target)%2==1){
           return 0;
       }
       int size = nums.length;
       sum = (sum-target)/2;
       int[][] dp = new int[size+1][sum+1];
       dp[0][0] = 1;
       for (int row = 1; row <=size; row++){
           int num = nums[row-1];
           for (int col = 0; col <= sum; col++){
               dp[row][col] = dp[row-1][col];
               if (col>=num){
                   dp[row][col] += dp[row-1][col-num];
               }
           }
       }
       return dp[size][sum];
    }
}
