package leetcode.graph;

public class NumOfIslands {
    public static int numIslands(char[][] grid) {
        int total = 0;
        for(int row = 0; row < grid.length; row++){
            for(int col = 0; col < grid[row].length; col++){
                if(grid[row][col] == '1'){
                    islandsVisited(grid,row,col);
                    total++;
                }
            }
        }
        return total;
    }
    private static void islandsVisited(char[][] grid, int row, int col){
        if(!isFeasible(grid,row,col)){
            return;
        }
        grid[row][col]='0';
        islandsVisited(grid,row+1, col);
        islandsVisited(grid,row-1, col);
        islandsVisited(grid,row, col+1);
        islandsVisited(grid,row, col-1);
    }

    private static boolean isFeasible(char[][] grid, int row, int col){
        if(row < 0 || row > grid.length-1){
            return false;
        }
        if(col < 0 || col > grid[row].length-1){
            return false;
        }
        if(grid[row][col] != '1'){
            return false;
        }
        return true;
    }
}
