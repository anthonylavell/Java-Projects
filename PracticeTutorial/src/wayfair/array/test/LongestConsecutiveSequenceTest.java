package wayfair.array.test;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import wayfair.array.LongestConsecutiveSequence;

import static org.junit.jupiter.api.Assertions.*;

class LongestConsecutiveSequenceTest {
    @Test
    public void testLongestConsecutive(){
        int [] nums = {100,4,200,1,3,2};
        int result = 4;
        Assertions.assertEquals(result, LongestConsecutiveSequence.longestConsecutive(nums));

        int [] nums2 = {0,-1};
        int result2 = 2;
        Assertions.assertEquals(result2, LongestConsecutiveSequence.longestConsecutive(nums2));

        int [] nums3 = new int[0];
        int result3 = 0;
        Assertions.assertEquals(result3, LongestConsecutiveSequence.longestConsecutive(nums3));

        int [] nums4 = {0};
        int result4 = 1;
        Assertions.assertEquals(result4, LongestConsecutiveSequence.longestConsecutive(nums4));

        int [] nums5 = {1,2,3,3,3,4,9};
        int result5 = 4;
        Assertions.assertEquals(result5, LongestConsecutiveSequence.longestConsecutive(nums5));

        int [] nums6 = {9,1,4,7,3,-1,0,5,8,-1,6};
        int result6 = 7;
        Assertions.assertEquals(result6, LongestConsecutiveSequence.longestConsecutive(nums6));
    }

}