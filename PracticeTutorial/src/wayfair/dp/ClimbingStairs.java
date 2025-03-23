package wayfair.dp;

public class ClimbingStairs {
    public static void main(String[] args) {
        int n =5;
        System.out.println(climbStairs(n));
    }
    public static int climbStairs(int n) {
        int [] dp = new int[n];
        dp[0] = 1;
        for(int i = 1; i < n; i++){
            int secondN = (i-2)<0?1:dp[i-2];
            dp[i] = dp[i-1]+secondN;
        }
        return dp[n-1];
    }
}
