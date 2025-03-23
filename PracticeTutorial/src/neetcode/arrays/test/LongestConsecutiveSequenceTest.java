package neetcode.arrays.test;

import neetcode.arrays.LongestConsecutiveSequence;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class LongestConsecutiveSequenceTest {

    @Test
    void testLongestConsecutive() {
        int [] nums = {100,4,200,1,3,2};
        int result = 4;
        Assertions.assertEquals(result, LongestConsecutiveSequence.longestConsecutive(nums));

        int [] nums2 = {0,3,7,2,5,8,4,6,0,1};
        int result2 = 9;
        Assertions.assertEquals(result2, LongestConsecutiveSequence.longestConsecutive(nums2));

        int [] nums3 = new int[]{};
        int result3 = 0;
        Assertions.assertEquals(result3, LongestConsecutiveSequence.longestConsecutive(nums3));

        int [] nums4 = {0,-1};
        int result4 = 2;
        Assertions.assertEquals(result4, LongestConsecutiveSequence.longestConsecutive(nums4));

        int [] nums5 = {1,2,0,1};
        int result5 = 3;
        Assertions.assertEquals(result5, LongestConsecutiveSequence.longestConsecutive(nums5));
    }
}