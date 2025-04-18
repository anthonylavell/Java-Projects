package grinder.graph.bfs;

import java.util.ArrayDeque;
import java.util.Deque;

public class NumberOfIslands {
    public static void main(String[] args) {

    }

    public static int numIslands(char[][] grid) {
        int numOfIsLands = 0;
        for (int row = 0; row < grid.length; row++){
            for (int col = 0; col < grid[row].length; col++){
                if(grid[row][col] != '0'){
                    findIslands(row,col,grid);
                    numOfIsLands++;
                }
            }
        }
        return numOfIsLands;
    }

    private static void findIslands(int sr, int sc, char[][] grid){
        int[][] dir = { {1,0},{-1,0},{0,-1},{0,1} };
        Deque<int[]>visited = new ArrayDeque<>();
        visited.add(new int[] {sr,sc});
        grid[sr][sc] = '0';
        while (!visited.isEmpty()){
            int size = visited.size();
            while (size-->0){
                int [] tempArray = visited.pop();
                for (int[] row : dir){
                    int x = tempArray[0] + row[0];
                    int y = tempArray[1] + row[1];
                    if(x>=0 && x < grid.length && y >=0 && y < grid[0].length && grid[x][y] != '0'){
                        grid[x][y] = '0';
                        visited.add(new int[] {x,y});
                    }
                }
            }
        }
    }
}
