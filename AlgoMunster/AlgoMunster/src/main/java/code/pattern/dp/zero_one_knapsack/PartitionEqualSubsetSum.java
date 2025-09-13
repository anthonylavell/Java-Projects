package code.pattern.dp.zero_one_knapsack;

import java.util.Arrays;

public class PartitionEqualSubsetSum {
    public boolean canPartition(int[] nums) {
        int sum = Arrays.stream(nums).sum();
        if (sum%2==1){
            return false;
        }
        sum/=2;
        int size = nums.length;
        boolean[][] dp = new boolean[size+1][sum+1];
        for (int row = 1; row <= size; row++){
            int num = nums[row-1];
            for (int col = 0; col <= sum; col++){
                dp[row][col] = dp[row-1][col];
                if (col>=num){
                    dp[row][col] = dp[row-1][col-num] || dp[row][col];
                }
            }
        }
        return dp[size][sum];
    }
}
