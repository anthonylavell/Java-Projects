package grinder.arrays.multi_Dim;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class RottingOrangesTest {

    @Test
    void testOrangesRotting() {
        int[][] grid = {{1,1,1},{1,1,0},{0,1,2}};
        int result = 4;
        assertEquals(result, RottingOranges.orangesRotting(grid));

        int[][] grid2 = {{0,2,2}};
        int result2 = 0;
        assertEquals(result2, RottingOranges.orangesRotting(grid2));

        int[][] grid3 = {{1,1,1},{1,1,0},{0,1,2}};
        int result3 = 4;
        assertEquals(result3, RottingOranges.orangesRotting(grid3));

        int[][] grid4 = {{2,1,1},{1,1,1},{0,1,2}};
        int result4 = 2;
        assertEquals(result4, RottingOranges.orangesRotting(grid4));
    }
}