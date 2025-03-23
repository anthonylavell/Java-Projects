package arraysandstrings.array.client;

import arraysandstrings.array.MaximumAverageSubArray;
import org.junit.Assert;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MaximumAverageSubArrayTest {
    private double delta;
    @BeforeEach
    void setUp(){
        delta = .01;
    }

    @Test
    void findMaxAverage() {
        int [] nums = {1,12,-5,-6,50,3};
        int k = 4;
        double result = 12.75;
        Assert.assertEquals(result, MaximumAverageSubArray.findMaxAverage(nums,k),delta);

        int [] nums2 = {5};
        int k2 = 1;
        double result2 = 5;
        Assert.assertEquals(result2, MaximumAverageSubArray.findMaxAverage(nums2,k2),delta);

        int [] nums3 = {-1};
        int k3 = 1;
        double result3 = -1.0;
        Assert.assertEquals(result3, MaximumAverageSubArray.findMaxAverage(nums3,k3),delta);

        int [] nums4 = {0,4,0,3,2};
        int k4 = 1;
        double result4 = 4.0;
        Assert.assertEquals(result4, MaximumAverageSubArray.findMaxAverage(nums4,k4),delta);
    }
}