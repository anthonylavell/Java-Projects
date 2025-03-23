package code_patterns.sliding_window;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PermutationInStringTest {

    @Test
    void checkInclusionThatTrue() {
        String s1 = "ab";
        String s2 = "eidbaooo";
        assertTrue(PermutationInString.checkInclusion(s1,s2));

        String s3 = "adc";
        String s4 = "dcda";
        assertTrue(PermutationInString.checkInclusion(s3,s4));

        String s5 = "a";
        String s6 = "a";
        assertTrue(PermutationInString.checkInclusion(s5,s6));
    }

    @Test
    void checkInclusionThatFalse() {
        String s1 = "ab";
        String s2 = "eidboaoo";
        assertFalse(PermutationInString.checkInclusion(s1,s2));
    }
}