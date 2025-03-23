package arraysandstrings.array.best_time_to_buy_and_sell_stock;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Stocks {
    public static int maxProfit(int[] prices) {
        int sum =0;
        int lowPrice = 10000;
        int highPrice = -1000;
        for(int price : prices){
            if(price< lowPrice){
                lowPrice = price;
                highPrice = 0;
            } else if( price > highPrice){
                highPrice = price;
            }
            if((highPrice - lowPrice) > sum){
                sum = highPrice - lowPrice;
            }
        }
        List<String> list = new ArrayList<>(Arrays.asList("Yes, Yes, please upgrade me","What"));
        String str = String.join(",", list);
        System.out.println(str);
        if(list.subList(0,2).contains("Y")){
            System.out.println("Hello");
        }
        return sum;
    }
}
