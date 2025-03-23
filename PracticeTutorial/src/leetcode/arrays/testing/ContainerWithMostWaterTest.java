package leetcode.arrays.testing;

import leetcode.arrays.ContainerWithMostWater;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ContainerWithMostWaterTest {
    @Test
    public void testMaxArea(){
        int [] height = {1, 8, 6, 2, 5, 4, 8, 3, 7};
        int total = 49;
        Assertions.assertEquals(total, ContainerWithMostWater.maxArea(height));

        int [] height2 = {1, 1};
        int total2 = 1;
        Assertions.assertEquals(total2,ContainerWithMostWater.maxArea(height2));

        int [] height3 = {1,9,9,1,1,1,1,2,1};
        int total3 = 12;
        Assertions.assertEquals(total3,ContainerWithMostWater.maxArea(height3));

        int [] height4 = {1, 8, 6, 2, 5, 4, 8, 2, 1};
        int total4 = 40;
        Assertions.assertEquals(total4,ContainerWithMostWater.maxArea(height4));
    }

}