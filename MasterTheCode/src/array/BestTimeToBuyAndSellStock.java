package array;

public class BestTimeToBuyAndSellStock {
    public static void main(String[] args) {
        int [] prices = {7,6,4,3,1};
        System.out.println(maxProfit(prices));
    }
    public static int maxProfit(int[] prices) {
        int result = 0;
        int min = Integer.MAX_VALUE;
        int max = Integer.MAX_VALUE;
        for(int price: prices){
            if(price < min){
                min=price;
                max = 0;
            }else if(price > max){
                max = price;
            }

            if((max-min) > result) {
                result = (max - min);
            }
        }
        return ((max-min) > result) ? (max-min) : result;
    }
}
