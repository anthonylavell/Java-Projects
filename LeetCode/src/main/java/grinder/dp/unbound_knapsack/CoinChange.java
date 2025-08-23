package grinder.dp.unbound_knapsack;

import java.util.Arrays;

public class CoinChange {
    public static void main(String[] args) {
        int[] coins = {1,2147483647};
        int amount = 2;
        int[] coins2 = {186,419,83,408};
        int amount2 = 6249;
        int[] coins3 = {1,2,5};
        int amount3 =11;
        int[] coins4 = {2,3,6};
        int amount4 =8;
        int[] coins5 = {2,5,10,1};
        int amount5 =20;
        int[] coins6 = {2};
        int amount6 =3;

        System.out.println(coinChange(coins2,amount2));

    }
    public static int coinChange(int[] coins, int amount) {
        int [] dp = new int [amount+1];
        Arrays.fill(dp,-1);
        dp[0] = 0;
        for (int coin : coins){
            for (int col = coin; col < dp.length; col++){
                    if (col%coin==0 && dp[col] ==-1 || (dp[col] ==-1 && dp[col - coin] !=-1)){
                        dp[col] = col;
                    }
                    if(dp[col - coin] !=-1) {
                        dp[col] = Math.min(dp[col], dp[col - coin] + 1);
                    }
            }
        }

        return dp[amount];
    }
}
