package code.pattern.dp;

import java.util.Arrays;

public class CoinChange {
    public static void main(String[] args) {
        int[] coins = {1,2,5};
        int amount = 11;
        System.out.println(coinChange(coins,amount));
    }
    public static int coinChange(int[] coins, int amount) {
        int[] dp = new int[amount+1];
        Arrays.fill(dp,-1);
        dp[0] = 0;
        for (int coin : coins) {
            for (int index = coin; index < dp.length; index++) {
                int sum = (dp[index-coin]) == -1 ? -1 : dp[index-coin] +1;
                if (sum != -1){
                    dp[index] = (dp[index] == -1) ? sum : Math.min(dp[index],sum);
                }
            }
        }
        return dp[amount];
    }
}
