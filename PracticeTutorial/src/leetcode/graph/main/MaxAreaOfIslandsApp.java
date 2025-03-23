package leetcode.graph.main;

import leetcode.graph.MaxAreaOfIslands;

public class MaxAreaOfIslandsApp {
    public static void main(String[] args) {
        int [][] grid = {{0,1,1},{0,0,0},{1,1,1}};
        int [][] grid2 = {{0,1,1},{1,1,1}};
        System.out.println(MaxAreaOfIslands.maxAreaOfIsland(grid));
    }

}
