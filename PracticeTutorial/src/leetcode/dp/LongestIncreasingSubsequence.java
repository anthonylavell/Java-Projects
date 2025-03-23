package leetcode.dp;

import java.util.Arrays;

public class LongestIncreasingSubsequence {
    public static void main(String[] args) {
        int [] nums = {4,3,8,6,2,3,4};
        int [] nums2 = {4,3,8,6,2,2,2};
        int [] nums3 = {1,3,6,7,9,4,10,5,6};
        System.out.println(lengthOfLIS(nums3));
    }

    public static int lengthOfLIS(int[] nums) {
        int total = 1;
        int [] dp = new int[nums.length];
        Arrays.fill(dp,1);
        for(int i = dp.length-2; i >=0; i--){
            int x = i+1;
            while ( x < nums.length){
                if(nums[x] > nums[i]){
                    dp[i] = Math.max(dp[i],(dp[x]+1));
                }
                x++;
            }
            total=Math.max(total,dp[i]);
        }
        return total;
    }
}
