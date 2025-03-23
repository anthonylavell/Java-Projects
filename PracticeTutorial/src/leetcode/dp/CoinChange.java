package leetcode.dp;

import java.util.Arrays;

public class CoinChange {
    public static void main(String[] args) {
        int [] coins = {1,2,5};
        int amount = 11;
        int [] coins2 = {2};
        int amount2 = -1;
        int [] coins3 = {1};
        int amount3 = 0;
        int [] coins4 = {2,4,5};
        int amount4 = 7;
        int [] coins5 = {186,419,83,408};
        int amount5 = 6249;
        int [] coins6 = {3,7,6};
        int amount6 = 8;
        System.out.println(coinChange(coins5,amount5));
    }

    public static int coinChange(int[] coins, int amount) {
        int [] dp = new int[amount+1];
        Arrays.fill(dp,(amount+1));
        dp[0]=0;
        for (int i = 1; i < dp.length; i++){
            for (int x = 0; x < coins.length; x++){
                int sum = i-coins[x];
                if(sum < 0){
                    continue;
                }
                dp[i] = Math.min(dp[i],(dp[sum]+1));
            }
        }
        int x =0;
        return (dp[dp.length-1] != amount+1) ? dp[dp.length-1] : -1;
    }
}
