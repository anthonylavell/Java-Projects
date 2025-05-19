package grinder.dp.bottom_up;

public class MinimumPathSumRedo {
    public static void main(String[] args) {
        //int[][] grid = { {1,3,1},{1,5,1},{4,2,1} };
        int[][] grid = { {1,2,3},{4,5,6} };
        System.out.println(minPathSum(grid));
    }

    public static int minPathSum(int[][] grid) {
        int gridRLen = grid.length;
        int gridCLen = grid[0].length;
        int[][] dp = new int[gridRLen][gridCLen];
        for (int row = 0; row < gridRLen; row++){
            for (int col = 0; col < gridCLen; col++){
                if (row == 0 && col==0){
                    dp[row][col] = grid[row][col];
                }else if (row==0){
                    dp[row][col] =  dp[row][col-1] + grid[row][col];
                }else if (col==0){
                    dp[row][col] =  dp[row-1][col] + grid[row][col];
                }else {
                    dp[row][col] = Math.min(dp[row][col-1],dp[row-1][col]) + grid[row][col];
                }
            }
        }
        return dp[gridRLen-1][gridCLen-1];
    }
}
