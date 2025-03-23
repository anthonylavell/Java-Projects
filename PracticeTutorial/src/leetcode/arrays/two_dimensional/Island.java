package leetcode.arrays.two_dimensional;

public class Island {
    public static int numIslands(char[][] grid) {
        int result =0;
        if(grid.length == 0 )
            return result;
        for(int row = 0; row < grid.length; row++){
            for(int col =0; col < grid[row].length; col++){
                if(grid[row][col]=='1'){
                    result++;
                    islandsVisited(grid,row,col);
                }
            }
        }

        return result;
    }
    public static void islandsVisited(char[][] map, int row, int col){
        if(row < 0 || col < 0 || row >= map.length || col >= map[row].length){
            return;
        }
        if(map[row][col] != '1'){
            return;
        }
        map[row][col]='0';
        islandsVisited(map,row-1, col);
        islandsVisited(map,row+1, col);
        islandsVisited(map,row, col-1);
        islandsVisited(map,row, col+1);
    }
}
