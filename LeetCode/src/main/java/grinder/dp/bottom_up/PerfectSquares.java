package grinder.dp.bottom_up;

import java.util.Arrays;

public class PerfectSquares {
    public static void main(String[] args) {
        int n = 12;
        System.out.println(numSquares(n));
    }

    public static int numSquares(int n){
        int [] dp = new int[n+1];
        Arrays.fill(dp,Integer.MAX_VALUE);
        dp[0]=0;
        for (int row = 1; row <=n; row++){
            for (int col = 1; (col*col) <= row; col++){
                dp[row] = Math.min(dp[row], dp[(row-col*col)]+1);
            }
        }
        return dp[n];
    }
}
