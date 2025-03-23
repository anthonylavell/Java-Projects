package array.testcase;

import array.MostWater;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MostWaterTest {
    @Test
    public void returnMostWaterContain(){
        int [] height = {1,8,6,2,5,4,8,3,7};
        Assertions.assertEquals(49, MostWater.getContain(height));
        int [] height2 = {3,4,3};
        assertEquals(6, MostWater.getContain(height2));
        int [] height3 = {4,3,2,1,4};
        assertEquals(16, MostWater.getContain(height3));
        int [] height4 = {1,2};
        assertEquals(1, MostWater.getContain(height4));

    }

}