package grinder.dp.bottom_up;

import java.util.Arrays;

public class PredictTheWinner {
    public static void main(String[] args) {
        //int[] coins = {1,5,2,4,6};
        //int[] coins = {4, 4, 9, 4};
        //int[] coins = {4, 10, 9, 4};
        int[] coins = {4,5,2};
        /*int[] coins = {9337301,0,2,2245036,4,1997658,5,2192224,960000
                ,1261120,8824737,1,1161367,9479977,7,2356738,5,4,9};*/
        System.out.println(predictTheWinner(coins));
    }

    public static boolean predictTheWinner(int[] numbers  ) {
        int[][] dp=new int[numbers.length][numbers.length];
        for(int[] row:dp){
            Arrays.fill(row,-1);
        }
        int scoreDifference = computeScore(dp,numbers,0,numbers.length-1);
        return scoreDifference>=0;
    }
    private static int computeScore(int[][] dp, int[] numbers, int left, int right){
        //base case is ready
        if(left==right){
            return numbers[left];
        }

        if(dp[left][right]!=-1){
            return dp[left][right];
        }
        //now lets check for the p1 first
        int takeLeft=numbers[left]- computeScore(dp,numbers,left+1,right);
        int takeRight=numbers[right]- computeScore(dp,numbers,left,right-1);

        int bestDifference = Math.max(takeLeft,takeRight);
        dp[left][right]=bestDifference;
        return bestDifference;
    }

    public static boolean predictTheWinner2(int[]nums) {
        return sum(nums,0,nums.length-1)>=0;
    }
    public static int sum(int []nums,int i,int j){
        if(i==j){
            return nums[j];
        }
        int sum1=nums[i]-sum(nums,i+1,j);
        int sum2=nums[j]-sum(nums,i,j-1);
        return Math.max(sum1,sum2);
    }
}
