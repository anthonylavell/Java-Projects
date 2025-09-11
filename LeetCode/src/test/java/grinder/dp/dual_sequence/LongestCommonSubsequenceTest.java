package grinder.dp.dual_sequence;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class LongestCommonSubsequenceTest {

    @Test
    void testLongestCommonSubsequence() {
        String text1 = "abcde", text2 = "ace";
        int result = 3;
        assertEquals(result, LongestCommonSubsequence.longestCommonSubsequence(text1,text2));

        String text3 = "abc", text4 = "abc";
        int result2 = 3;
        assertEquals(result2, LongestCommonSubsequence.longestCommonSubsequence(text3,text4));

        String text5 = "abc", text6 = "def";
        int result3 = 0;
        assertEquals(result3, LongestCommonSubsequence.longestCommonSubsequence(text5,text6));

        String text7 = "mhunuzqrkzsnidwbun", text8 = "szulspmhwpazoxijwbq";
        int result4 = 6;
        assertEquals(result4, LongestCommonSubsequence.longestCommonSubsequence(text7,text8));

        String text9 = "pmjghexybyrgzcz", text10 = "hafcdqbgncrcbihkd";
        int result5 = 4;
        assertEquals(result5, LongestCommonSubsequence.longestCommonSubsequence(text9,text10));
    }
}