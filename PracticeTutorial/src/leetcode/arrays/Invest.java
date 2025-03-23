package leetcode.arrays;

public class Invest {
    public static int maxProfit(int[] prices) {
        int maxValue = 0;
        int lowest = Integer.MAX_VALUE;
        for(int price : prices){
            if(price < lowest){
                lowest = price;
            } else {
                if((price-lowest) > maxValue) {
                    maxValue = (price - lowest);
                }
            }
        }
        return maxValue;
    }
}
