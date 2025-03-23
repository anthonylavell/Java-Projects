package wayfair.array.test;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import wayfair.dp.Islands;

import static org.junit.jupiter.api.Assertions.*;

class IslandsTest {
    @Test
    public void testNumIsland(){
        char[][] grids = {{'1','1','1','1','0'},{'1','1','0','1','0'},{'1','1','0','0','0'},{'0','0','0','0','0'}};
        int result = 1;
        Assertions.assertEquals(result,Islands.numIslands(grids));

        char[][] grids2 = {{'1','1','0','0','0'},{'1','1','0','0','0'},{'0','0','1','0','0'},{'0','0','0','1','1'}};
        int result2 = 3;
        Assertions.assertEquals(result2, Islands.numIslands(grids2));
    }

}