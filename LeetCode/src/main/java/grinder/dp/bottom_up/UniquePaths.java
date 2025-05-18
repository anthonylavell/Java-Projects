package grinder.dp.bottom_up;

public class UniquePaths {
    public static void main(String[] args) {
        int m =3;
        int n = 3;
        System.out.println(uniquePaths(m,n));
    }

    public static int uniquePaths(int m, int n) {
        int[][]dp = new int[m][n];
        for (int row = 0; row < m; row++){
            for (int col = 0; col < n; col++){
                if (row == 0 || col ==0 ){
                    dp[row][col] = 1;
                }else {
                    dp[row][col] = dp[row-1][col] + dp[row][col-1];
                }
            }
        }
        return dp[m-1][n-1];

    }
}
