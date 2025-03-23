package array.testcase;

import array.BestTimeToBuyAndSellStock;
import array.IntersectionOfTwoArrays;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

class BestTimeToBuyAndSellStockTest {
    @Test
    public void returnZero(){
        int [] prices = {7,6,4,3,1};
        int result = 0;
        Assertions.assertEquals(result, BestTimeToBuyAndSellStock.maxProfit(prices));
    }

    @Test
    public void returnValueGreaterThanZero(){
        int [] prices = {7,1,5,3,6,4};
        int result = 5;
        Assertions.assertEquals(result, BestTimeToBuyAndSellStock.maxProfit(prices));

        int [] prices2 = {2,4,1};
        int result2 = 2;
        Assertions.assertEquals(result2, BestTimeToBuyAndSellStock.maxProfit(prices2));

    }

}