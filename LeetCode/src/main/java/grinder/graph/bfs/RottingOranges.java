/*
You are given an m x n grid where each cell can have one of three values:

0 representing an empty cell,
1 representing a fresh orange, or
2 representing a rotten orange.
Every minute, any fresh orange that is 4-directionally adjacent to a rotten orange becomes rotten.

Return the minimum number of minutes that must elapse until no cell has a fresh orange. If this is
impossible, return -1.
 */

package grinder.graph.bfs;

import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Deque;

public class RottingOranges {
    public static void main(String[] args) {
        int[][] grid = {{2,1,1},{1,1,0},{0,1,1}};
        System.out.println(orangesRotting(grid));
        System.out.println(Arrays.deepToString(grid));
    }
    public static int orangesRotting(int[][] grid) {
        int minutes = 0;
        int[][] dirs = { {-1,0},{1,0},{0,-1},{0,1} };
        int totalFresh = 0;
        Deque<int[]> deque = new ArrayDeque<>();
        for(int row = 0; row < grid.length; row++){
            for(int col = 0; col < grid[row].length; col++){
                if(grid[row][col] == 2){
                    deque.add(new int[] {row,col});
                }else if(grid[row][col] == 1){
                    totalFresh++;
                }
            }
        }

        while (!deque.isEmpty()){
            int size = deque.size();
            while (size-- > 0){
                int[] nodes = deque.pop();
                for(int[] dir : dirs){
                    int row = nodes[0] + dir[0];
                    int col = nodes[1] + dir[1];
                    if(row >= 0 && row < grid.length && col >= 0 && col < grid[row].length && grid[row][col] == 1){
                        continue;
                    }
                    deque.add(new int[] {row,col});
                    grid[row][col] = 2;
                }
            }
            if(!deque.isEmpty()){
                totalFresh-=deque.size();
                minutes++;
            }

        }
        return (totalFresh > 0) ? -1: minutes;
    }
}
