package grinder.strings;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MaximumRepeatingSubstringTest {

    @Test
    void testMaxRepeating() {
        String sequence = "ababc";
        String word = "ab";
        int result = 2;
        Assertions.assertEquals(result, MaximumRepeatingSubstring.maxRepeating(sequence,word));

        String sequence2 = "ababc";
        String word2 = "ba";
        int result2 = 1;
        Assertions.assertEquals(result2, MaximumRepeatingSubstring.maxRepeating(sequence2,word2));

        String sequence3 = "ababc";
        String word3 = "ac";
        int result3 = 0;
        Assertions.assertEquals(result3, MaximumRepeatingSubstring.maxRepeating(sequence3,word3));

        String sequence4 = "aaabaaaabaaabaaaabaaaabaaaabaaaaba";
        String word4 = "aaaba";
        int result4 = 5;
        Assertions.assertEquals(result4, MaximumRepeatingSubstring.maxRepeating(sequence4,word4));

        String sequence5 = "a";
        String word5 = "a";
        int result5 = 1;
        Assertions.assertEquals(result5, MaximumRepeatingSubstring.maxRepeating(sequence5,word5));

    }
}