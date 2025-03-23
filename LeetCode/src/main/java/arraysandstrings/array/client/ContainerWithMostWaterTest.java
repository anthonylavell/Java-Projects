package arraysandstrings.array.client;

import arraysandstrings.array.ContainerWithMostWater;
import org.junit.Assert;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class ContainerWithMostWaterTest {

    @Test
    void notMaxArea() {
        int [] height = {1,8,6,2,5,4,8,3,7};
        int max = ContainerWithMostWater.maxArea(height);
        Assertions.assertNotEquals(48,max);
    }
    @Test
    void maxArea() {
        int [] height = {1,8,6,2,5,4,8,3,7};
        int max = ContainerWithMostWater.maxArea(height);
        Assert.assertEquals(49,max);

        int [] height2 = {1,1};
        max = ContainerWithMostWater.maxArea(height2);
        Assert.assertEquals(1,max);

    }
}