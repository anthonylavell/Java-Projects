package arraysandstrings.array.best_time_to_buy_and_sell_stock;

public class Profit {
    public static void main(String[] args) {
        int [] prices = {7,1,5,3,6,4};
        System.out.println(maxProfit(prices));
        int [] prices2 = {7,6,4,3,1};
        System.out.println(maxProfit(prices2));

    }
    public static int maxProfit(int[] prices) {
        int low = Integer.MAX_VALUE;
        int profit = 0;
        for(int num : prices){
            if(num < low){
                low = num;
                continue;
            }
            profit = Math.max(profit,(num-low));
        }
        return profit;
    }
}
