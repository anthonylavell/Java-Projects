package arraysandstrings.array.two_dimensional;

public class UniquePaths {
    public static void main(String[] args) {
        int m = 3; //3
        int n = 2; //7
        uniquePaths(m,n);
    }

    public static int uniquePaths(int m, int n) {
       int [] dp = new int[n];
       dp[0] = 1;
       for(int row = 0; row < m; row++){
           for(int col = 1; col < n; col++){
               dp[col] = dp[col-1] + dp[col];
           }
       }
       return dp[n-1];
    }
}
