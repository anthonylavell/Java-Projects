package leetcode.arrays.main;

import leetcode.arrays.Invest;

public class InvestMain {
    public static void main(String[] args) {
        //int [] prices = {7,1,5,3,6,4};
        //int [] prices = {7,6,4,3,1};
        //int [] prices = {7,6,4,3,4};
        int [] prices = {1,6,4,3,7};
        //int [] prices = new int[5];
        System.out.println("Inv = " + Invest.maxProfit(prices));
    }
}
