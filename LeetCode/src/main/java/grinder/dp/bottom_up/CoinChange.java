package grinder.dp.bottom_up;

import grinder.json.CoinChangeJson;
import org.json.JSONArray;
import org.json.JSONObject;

import java.util.Arrays;

public class CoinChange {
    public static void main(String[] args) {
        JSONObject jsonObject = new JSONObject(CoinChangeJson.getCoinChange());
        JSONObject jsonData = jsonObject.getJSONObject("data");
        JSONArray jsonCoins = jsonData.getJSONArray("coins");
        int[]coins = new int[jsonCoins.length()];
        for (int index = 0; index < coins.length; index++){
            coins[index] = jsonCoins.getInt(index);
        }
        int amount = jsonData.getInt("amount");
        System.out.println(coinChange(coins,amount));
    }

    public static int coinChange(int[] coins, int amount) {
        int[]dp = new int[amount+1];
        Arrays.fill(dp,amount+1);
        Arrays.sort(coins);
        dp[0]=0;
        for (int index = 1; index < dp.length; index++){
            for (int coin : coins){
                if (coin <= index){
                    dp[index] = Math.min(dp[index],1 + dp[(index-coin)]);
                }else {
                    break;
                }
            }
        }
        return dp[amount]>amount?-1 : dp[amount];
    }

}
