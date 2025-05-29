package grinder.arrays;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BestTimeToBuyAndSellStockTest {

    @Test
    void maxProfit() {
        int [] prices = {7,1,5,3,6,4};
        assertEquals(5,BestTimeToBuyAndSellStock.maxProfit(prices));
    }
}