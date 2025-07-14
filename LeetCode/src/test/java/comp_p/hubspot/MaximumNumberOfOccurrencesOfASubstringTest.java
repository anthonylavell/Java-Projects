package comp_p.hubspot;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class MaximumNumberOfOccurrencesOfASubstringTest {

    @Test
    void testMaxFreq() {
        String s = "aababcaab";
        int maxLetters = 2, minSize = 3, maxSize = 4;
        assertEquals(2, MaximumNumberOfOccurrencesOfASubstring.maxFreq(s,maxLetters,minSize,maxSize));

        String s2 = "aaaa";
        int maxLetters2 = 1, minSize2 = 3, maxSize2 = 3;
        assertEquals(2,MaximumNumberOfOccurrencesOfASubstring.maxFreq(s2,maxLetters2,minSize2,maxSize2));

        String s3 = "abab";
        int maxLetters3 = 1, minSize3 = 3, maxSize3 = 3;
        assertEquals(0,MaximumNumberOfOccurrencesOfASubstring.maxFreq(s3,maxLetters3,minSize3,maxSize3));

        String s4 = "abcabababacabcabc";
        int maxLetters4 = 10, minSize4 = 3, maxSize4 = 3;
        assertEquals(3,MaximumNumberOfOccurrencesOfASubstring.maxFreq(s4,maxLetters4,minSize4,maxSize4));

    }
}