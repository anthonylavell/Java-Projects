package grinder.backtracking;

import java.util.Arrays;

public class CoinChange {
    public static void main(String[] args) {
        int [] coin = {1,2,5};
        int amount = 11;
        System.out.println(coinChange(coin,amount));
    }
    public static int coinChange(int[] coins, int amount) {
        if(amount == 0){
            return amount;
        }
        int [] dp = new int[amount+1];
        Arrays.fill(dp,amount+1);
        dp[0] = 0;
        for (int i = 1; i < dp.length; i++){
            for(int coin : coins){
                if(i >= coin){
                    dp[i] = Math.min((dp[(i - coin)])+1, dp[i]);
                }
            }
        }
        return (dp[amount] == (amount+1) ? -1 : dp[amount]);
    }
}
