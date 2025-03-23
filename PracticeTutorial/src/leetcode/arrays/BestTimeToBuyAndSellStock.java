package leetcode.arrays;

public class BestTimeToBuyAndSellStock {
    public static void main(String[] args) {
        int [] prices = {7,1,5,3,6,4};
        //int [] prices = {2,4,1};
        System.out.println("price = " + maxProfit(prices));
    }

    public static int maxProfit(int[] prices) {
        int profit = 0;
        int buy = Integer.MAX_VALUE;
        for(int price : prices){
            if(price < buy){
                buy = price;
            }else if(profit < (price-buy)){
                profit = (price-buy);
            }
        }
        return profit;
    }
}
