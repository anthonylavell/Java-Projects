package grinder;

import java.util.Arrays;

public class Practice {

    public static int coinChange(int[] coins, int amount) {
        Arrays.sort(coins);
        int[] dp = new int[amount+1];
        Arrays.fill(dp,-1);
        dp[0] = 0;
        for (int coin : coins){
            for (int index = coin; index < dp.length; index++){
                int sum = (dp[index-coin]==-1)?-1 : dp[index-coin]+1;
                if (sum!=-1){
                dp[index] = dp[index]== -1?sum: Math.min(dp[index],(sum));
                }
            }
        }
        return dp[amount];
    }
    public static void main(String[] args) {
        /*int[] coins = {2,5,10,1};
        int amount = 27;*/
        int[] coins = {1,2,5};
        int amount = 11;
        /*int[] coins = {2};
        int amount = 3;*/
        System.out.println(coinChange(coins,amount));
    }
}
