package wayfair.dp;

public class Islands {
    public static void main(String[] args) {
        char[][] grids = {{'1','1','0','0','0'},{'1','1','0','0','0'},{'0','0','1','0','0'},{'0','0','0','1','1'}};
        System.out.println("Number of Islands: " + numIslands(grids));
    }
    public static int numIslands(char[][] grid) {
        int total = 0;
        for(int row = 0; row <grid.length; row++){
            for (int col = 0; col<grid[row].length; col++){
                if(grid[row][col] != '0'){
                    islandsVisited(grid,row,col);
                    total++;
                }
            }
        }
        return total;
    }
    private static void islandsVisited(char[][] grid,int row, int col){
        if(row < 0 || row >= grid.length || col < 0 || col >= grid[row].length || grid[row][col] == '0'){
            return;
        }
        grid[row][col] = '0';
        islandsVisited(grid,row, col+1);
        islandsVisited(grid,row, col-1);
        islandsVisited(grid,row+1, col);
        islandsVisited(grid,row-1, col);
    }
}
