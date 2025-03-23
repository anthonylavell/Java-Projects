package leetcode.graph.main;

import leetcode.graph.Flood;

public class FloodFillApp {
    public static void main(String[] args) {
        int[][] image = {{1,1,1},{1,1,0},{1,0,1}};
        int sr = 0;
        int sc = 0;
        int newColor = 2;
        Flood.floodFill(image,sr,sc,newColor);
        int i  =0;
    }
}
