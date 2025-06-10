package grinder.strings;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RepeatedSubstringPatternTest {

    @Test
    void testRepeatedSubstringPattern_True() {
        String str = "abab";
        assertTrue(RepeatedSubstringPattern.repeatedSubstringPattern(str));

        String str2 = "abcabcabcabc";
        assertTrue(RepeatedSubstringPattern.repeatedSubstringPattern(str2));

        String str3 = "aa";
        assertTrue(RepeatedSubstringPattern.repeatedSubstringPattern(str3));
    }

    @Test
    void testRepeatedSubstringPattern_False() {
        String str = "aba";
        assertFalse(RepeatedSubstringPattern.repeatedSubstringPattern(str));

        String str2 = "aabb";
        assertFalse(RepeatedSubstringPattern.repeatedSubstringPattern(str2));

        String str3 = "abcd";
        assertFalse(RepeatedSubstringPattern.repeatedSubstringPattern(str3));
    }
}