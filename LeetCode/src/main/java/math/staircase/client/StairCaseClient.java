package math.staircase.client;

import math.staircase.Stair;

public class StairCaseClient {
    /* Driver program to test above function */
    public static void main(String args[])
    {        int s = 4;
        System.out.println("Number of ways = " + Stair.countWays(s));
        System.out.println("Number of ways = " + Stair.climbStairs(s));
    }
}
