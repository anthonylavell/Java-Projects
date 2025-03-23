package code_patterns.two_pointers;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ThreeSumSmallerTest {

    @Test
    void threeSumSmallerWithOver5Elements() {
        int [] nums = {3,2,-2,6,2,-2,6,-2,-4,2,3,0,4,4,1};
        int target = 3;
        assertEquals(151,ThreeSumSmaller.threeSumSmaller(nums,target));
    }

    @Test
    void threeSumSmallerWith5Elements() {
        int [] nums = {1,-2,2,1,0};
        int target = 1;
        assertEquals(4,ThreeSumSmaller.threeSumSmaller(nums,target));
    }

    @Test
    void threeSumSmallerWith4Elements() {
        int [] nums = {-2,0,1,3};
        int target = 2;
        assertEquals(2,ThreeSumSmaller.threeSumSmaller(nums,target));

        int [] nums2 = {-1,1,-1,-1};
        int target2 = -1;
        assertEquals(1,ThreeSumSmaller.threeSumSmaller(nums2,target2));
    }

    @Test
    void threeSumSmallerWith3Elements() {
        int [] nums = {1,1,-2};
        int target = 1;
        assertEquals(1,ThreeSumSmaller.threeSumSmaller(nums,target));
    }

    @Test
    void threeSumSmallerWithEmptyElements() {
        int [] nums = {};
        int target = 0;
        assertEquals(0,ThreeSumSmaller.threeSumSmaller(nums,target));
    }

    @Test
    void threeSumSmallerWithZeroElements() {
        int [] nums = {0};
        int target = 0;
        assertEquals(0,ThreeSumSmaller.threeSumSmaller(nums,target));
    }
}