package leetcode.graph.test;

import leetcode.graph.Flood;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

class FloodTest {

    @Test
    void testFloodFill() {
        int[][] image = {{1,1,1},{1,1,0},{1,0,1}};
        int sr = 1;
        int sc = 1;
        int newColor = 2;
        int[][] result = {{2,2,2},{2,2,0},{2,0,1}};
        Assertions.assertTrue(Arrays.deepEquals(result,Flood.floodFill(image,sr,sc,newColor)));

        int[][] image2 = {{0,0,0},{0,0,0},};
        int sr2 = 0;
        int sc2 = 0;
        int newColor2 = 2;
        int[][] result2 = {{2,2,2},{2,2,2}};
        Assertions.assertTrue(Arrays.deepEquals(result2,Flood.floodFill(image2,sr2,sc2,newColor2)));
    }
}