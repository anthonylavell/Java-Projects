package arraysandstrings.array.best_time_to_buy_and_sell_stock.client;

import arraysandstrings.array.best_time_to_buy_and_sell_stock.Stocks;

public class StocksClient {
    public static void main(String[] args) {
        //int [] prices = {7,1,5,3,6,4};
        int [] prices = {7,6,4,3,1};
        int sum = Stocks.maxProfit(prices);
        System.out.println("Total profit: " + sum);
    }


}
