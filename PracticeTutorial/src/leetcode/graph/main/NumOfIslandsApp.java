package leetcode.graph.main;

import leetcode.graph.NumOfIslands;

public class NumOfIslandsApp {
    public static void main(String[] args) {
        char[][] grid = {
                {'1','1','0','0','0'},
                {'1','1','0','0','0'},
                {'0','0','1','0','0'},
                {'0','0','0','1','1'}
        };
        System.out.println(NumOfIslands.numIslands(grid));
    }
}
