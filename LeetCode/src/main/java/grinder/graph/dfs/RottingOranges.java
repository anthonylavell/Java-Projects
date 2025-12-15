package grinder.graph.dfs;

import java.util.ArrayDeque;
import java.util.Deque;

public class RottingOranges {
    public static int orangesRotting(int[][] grid){
        int minutes = -1;
        int[][] dirs = {{0,1},{0,-1},{1,0},{-1,0}};
        Deque<int[]> rotten = new ArrayDeque<>();
        //add all 2(rotten fruit)
        for (int row = 0; row < grid.length; row++){
            for(int col = 0; col < grid[row].length; col++){
                if (grid[row][col] == 2){
                    rotten.add(new int[] {row,col});
                }
            }
        }
        while (!rotten.isEmpty()){
            int size = rotten.size();
            while (size-->0){
                int []temp = rotten.poll();
                for (int[] dir : dirs ){
                    int y = dir[0]+temp[0];
                    int x = dir[1]+temp[1];
                    if (y>= 0 && y < grid.length && x >=0 && x < grid[y].length && grid[y][x]==1){
                        rotten.add(new  int[]{y,x});
                        grid[y][x] = 0;
                    }
                }
            }
            minutes++;
        }
//Look for leftover 1s
        for (int[]row : grid){
            for (int col : row){
                if (col == 1){
                    return -1;
                }
            }
        }
        return minutes == -1 ? 0 : minutes;
    }

    public static void main(String[] args) {
        int[][] grid = {{2,1,1},{1,1,0},{0,1,1}};
    }
}
