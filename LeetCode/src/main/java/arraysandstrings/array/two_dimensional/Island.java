package arraysandstrings.array.two_dimensional;
/*
Given a 2d grid map of '1's (land) and '0's (water), count the number of islands. An island is surrounded by water and is formed by connecting adjacent lands horizontally or vertically. You may assume all four edges of the grid are all surrounded by water.

Example 1:

Input:
11110
11010
11000
00000

Output: 1
Example 2:

Input:
11000
11000
00100
00011

Output: 3
 */
public class Island {
    public static int numIslands(char[][] grid) {
        int foundIslands = 0;
        for(int row = 0; row < grid.length; row++){
            for(int col = 0; col < grid[row].length; col++){
                if(grid[row][col] != '0'){
                    foundIslands(grid,row,col);
                    foundIslands++;
                }
            }
        }
        return foundIslands;
    }

    private static void foundIslands(char[][] grid, int row, int col){
        if( isLandLimits(grid,row,col) ){
            return;
        }
        grid[row][col]='0';
        foundIslands(grid,row-1,col);
        foundIslands(grid,row+1,col);
        foundIslands(grid,row,col-1);
        foundIslands(grid,row,col+1);
    }

    private static boolean isLandLimits(char[][] grid, int row, int col){
        if(row < 0 || row >= grid.length){
            return true;
        } else if(col < 0 || col >= grid[row].length ){
            return true;
        } else if (grid[row][col] == '0') {
            return true;
        }
        return false;
    }
}