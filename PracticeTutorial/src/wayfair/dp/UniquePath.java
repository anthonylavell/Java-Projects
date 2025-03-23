package wayfair.dp;

public class UniquePath {
    public static void main(String[] args) {
        int m = 3, n = 7;
        System.out.println(uniquePaths(m,n));
    }
    public static int uniquePaths(int m, int n) {
        int [][] dp = new int[m][n];
        dp[0][0] = 1;
        for(int row = 0; row<m; row++){
            for(int col = 0; col < n; col++){
                if(row==0 || col == 0){
                    dp[row][col] = 1;
                }else {
                    dp[row][col] = dp[row][col - 1] + dp[row-1][col];
                }
            }
        }
        int i = 0;
        return dp[m-1][n-1];
    }
}
