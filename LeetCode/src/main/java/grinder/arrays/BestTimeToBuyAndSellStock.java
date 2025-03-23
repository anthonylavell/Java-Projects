/*
You are given an array prices where prices[i]
is the price of a given stock on the ith day.

You want to maximize your profit by choosing a
single day to buy one stock and choosing a different
day in the future to sell that stock.

Return the maximum profit you can achieve from this
transaction. If you cannot achieve any profit, return 0.
 */
package grinder.arrays;

public class BestTimeToBuyAndSellStock {
    public static void main(String[] args) {
        int [] prices = {7,1,5,3,6,4};
        int result = maxProfit(prices);
    }
    public static int maxProfit(int[] prices) {
        int total = 0;
        int buyLo = Integer.MAX_VALUE;
        for (int price : prices){
            if(price < buyLo){
                buyLo = price;
            }else {
                int sellHi = (price-buyLo);
                total = (total < sellHi) ? sellHi : total;
            }
        }
        return total;
    }
}
