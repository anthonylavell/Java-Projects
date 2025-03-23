package code_patterns.two_pointers;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ThreeSumClosetTest {

    @Test
    void threeSumClosestWithTargetOf1() {
        int [] nums = {-1,2,1,-4};
        int target = 1;
        assertEquals(2,ThreeSumCloset.threeSumClosest(nums,target));

        int [] nums2 = {-0,0,0};
        int target2 = 0;
        assertEquals(0,ThreeSumCloset.threeSumClosest(nums2,target2));
    }
}