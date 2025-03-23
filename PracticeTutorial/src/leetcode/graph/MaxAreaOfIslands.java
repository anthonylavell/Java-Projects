package leetcode.graph;

public class MaxAreaOfIslands {
    public static int maxAreaOfIsland(int[][] grid) {
        int total = 0;
        for(int row = 0; row < grid.length; row++){
            for(int col = 0; col < grid[row].length; col++){
                if(grid[row][col] == 1){
                    total = Math.max(total,islandsVisited(grid,row,col,1));
                }
            }
        }
        return total;
    }
    private static int islandsVisited(int[][] grid, int row, int col, int sum){
        if(!isFeasible(grid,row,col)){
            return 0;
        }
        grid[row][col]= 0;
        sum += islandsVisited(grid,row+1, col, 1);
        sum += islandsVisited(grid,row-1, col, 1);
        sum += islandsVisited(grid, row, col+1, 1);
        sum += islandsVisited(grid, row, col-1, 1);
        return sum;
    }

    private static boolean isFeasible(int[][] grid, int row, int col){
        if(row < 0 || row > grid.length-1){
            return false;
        }
        if(col < 0 || col > grid[row].length-1){
            return false;
        }
        if(grid[row][col] != 1){
            return false;
        }
        return true;
    }
}
