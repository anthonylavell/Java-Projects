package grinder.strings;

import comp_p.hubspot.LongestSubstringWithAtLeastKRepeatingChars;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class LongestSubstringWithAtLeastKRepeatingCharsTest {

    @Test
    void testLongestSubstring() {
        String str = "aaabb";
        int k = 3;
        int result = 3;
        Assertions.assertEquals(result, LongestSubstringWithAtLeastKRepeatingChars.longestSubstring(str,k));

        String str2 = "ababbc";
        int k2 = 2;
        int result2 = 5;
        Assertions.assertEquals(result2,LongestSubstringWithAtLeastKRepeatingChars.longestSubstring(str2,k2));

        String str3 = "aabbbcc";
        int k3 = 3;
        int result3 = 3;
        Assertions.assertEquals(result3,LongestSubstringWithAtLeastKRepeatingChars.longestSubstring(str3,k3));

        String str4 = "aaabbcccc";
        int k4 = 3;
        int result4 = 4;
        Assertions.assertEquals(result4,LongestSubstringWithAtLeastKRepeatingChars.longestSubstring(str4,k4));

        String str5 = "abaa";
        int k5 = 2;
        int result5 = 2;
        Assertions.assertEquals(result5,LongestSubstringWithAtLeastKRepeatingChars.longestSubstring(str5,k5));
    }
}