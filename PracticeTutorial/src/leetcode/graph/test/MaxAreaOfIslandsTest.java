package leetcode.graph.test;

import leetcode.graph.MaxAreaOfIslands;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MaxAreaOfIslandsTest {

    @Test
    void testMaxAreaOfIsland() {
        int [][] grid = {{0,1,1},{0,0,0},{1,1,1}};
        int result = 3;
        Assertions.assertEquals(result, MaxAreaOfIslands.maxAreaOfIsland(grid));

        int [][] grid2 = {{0,1,1},{1,1,1}};
        int result2 = 5;
        Assertions.assertEquals(result2, MaxAreaOfIslands.maxAreaOfIsland(grid2));

        int [][] grid3 = {
                {0,0,1,0,0,0,0,1,0,0,0,0,0},
                {0,0,0,0,0,0,0,1,1,1,0,0,0},
                {0,1,1,0,1,0,0,0,0,0,0,0,0},
                {0,1,0,0,1,1,0,0,1,0,1,0,0},
                {0,1,0,0,1,1,0,0,1,1,1,0,0},
                {0,0,0,0,0,0,0,0,0,0,1,0,0},
                {0,0,0,0,0,0,0,1,1,1,0,0,0},
                {0,0,0,0,0,0,0,1,1,0,0,0,0}
        };
        int result3 = 6;
        Assertions.assertEquals(result3, MaxAreaOfIslands.maxAreaOfIsland(grid3));
    }
}