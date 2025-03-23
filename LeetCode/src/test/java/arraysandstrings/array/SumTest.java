package arraysandstrings.array;

import org.junit.Assert;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SumTest {

    @Test
    void threeSumClosest() {
        int [] nums = {-1,2,1,-4};
        int target = 1;
        int result = 2;
        Assert.assertEquals(result,Sum.threeSumClosest(nums,target));

        int [] nums2 = {0,0,0};
        int target2 = 1;
        int result2 = 0;
        assertEquals(result2,Sum.threeSumClosest(nums2,target2));

        int [] nums3 = {-4,-1,1,2};
        int target3 = 1;
        int result3 = 2;
        assertEquals(result3,Sum.threeSumClosest(nums3,target3));

        int [] nums4 = {5,4,3,3,0,0,-5,-5,-4};
        int target4 = -2;
        int result4 = -2;
        assertEquals(result4,Sum.threeSumClosest(nums4,target4));

        int [] nums5 = {0,3,97,102,200};
        int target5 = 300;
        int result5 = 300;
        assertEquals(result5, Sum.threeSumClosest(nums5,target5));
    }
}