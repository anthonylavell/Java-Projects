package arraysandstrings.array.two_dimensional;

import java.util.LinkedList;
import java.util.Queue;

public class RottingOranges {

    public static void main(String[] args) {
        int[][] grid = {{2,1,2},{1,1,1},{0,1,1}};
        int[][] grid2 = {{2,1,1},{0,1,1},{1,0,1}};
        int[][] grid3 = {{2,1,1},{1,1,0},{0,2,1}};
        orangesRotting(grid3);
    }
    public static int orangesRotting(int[][] grid) {
        Queue<int[]> matrixQueue = new LinkedList<>();
        int freshFruit = 0;
        for(int row = 0; row < grid.length; row++){
            for(int col = 0; col < grid[row].length; col++ ){
                if(grid[row][col] == 2){
                   matrixQueue.add(new int[] {row,col}) ;
                }else if(grid[row][col] == 1){
                    freshFruit++;
                }
            }
        }
        int minutes = 0;
        while (!matrixQueue.isEmpty()){
            int size = matrixQueue.size();
            for(int i = 0; i < size; i++){
                findFruit(matrixQueue.poll(),matrixQueue,grid);
            }
            freshFruit-=matrixQueue.size();
            if(matrixQueue.size()>0){
                minutes++;
            }
        }
        return (freshFruit==0) ? minutes : -1;
    }

    private static void findFruit(int [] temp,Queue<int[]> queue, int[][] grid ){
        int[][] directions = {{0,1},{1,0},{-1,0},{0,-1}};
        for(int [] map : directions){
            int row = (map[0] + temp[0]);
            int col = (map[1] + temp[1]);
            if(row >=0 && row < grid.length && col >=0 && col < grid[row].length && (grid[row][col] != 0 && grid[row][col] != 2 )){
                queue.add(new int[]{row,col});
                grid[row][col] = 2;
            }
        }
    }
}
