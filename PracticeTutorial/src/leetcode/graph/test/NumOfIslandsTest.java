package leetcode.graph.test;

import leetcode.graph.NumOfIslands;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class NumOfIslandsTest {

    @Test
    void testNumIslands() {
        char[][] grid = {
                {'1','1','0','0','0'},
                {'1','1','0','0','0'},
                {'0','0','1','0','0'},
                {'0','0','0','1','1'}
        };
        int result = 3;
        Assertions.assertEquals(result, NumOfIslands.numIslands(grid));

        char[][] grid2 = {
                {'1','1','1','1','0'},
                {'1','1','0','1','0'},
                {'1','1','0','0','0'},
                {'0','0','0','0','0'}
        };
        int result2 = 1;
        Assertions.assertEquals(result2, NumOfIslands.numIslands(grid2));
    }
}