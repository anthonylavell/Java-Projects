package leetcode.string.test;

import leetcode.string.LongestSubStr;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class LongestSubStrTest {
    @Test
    public void testLongestLengthOfSubString(){
        String str = "abcacbfz";
        int result = 5;
        Assertions.assertEquals(result, LongestSubStr.lengthOfLongestSubstring(str));
        String str2 = "abcAbcza";
        result = 5;
        Assertions.assertEquals(result, LongestSubStr.lengthOfLongestSubstring(str2));
        String str3 = "abcabcbb";
        result = 3;
        Assertions.assertEquals(result, LongestSubStr.lengthOfLongestSubstring(str3));
        String str4 = "s";
        result = 1;
        Assertions.assertEquals(result, LongestSubStr.lengthOfLongestSubstring(str4));
        String str5 = "abcafdze";
        result = 7;
        Assertions.assertEquals(result, LongestSubStr.lengthOfLongestSubstring(str5));
        String str6 = "bbb";
        result = 1;
        Assertions.assertEquals(result, LongestSubStr.lengthOfLongestSubstring(str6));
        String str7 = "";
        result = 0;
        Assertions.assertEquals(result, LongestSubStr.lengthOfLongestSubstring(str7));
        String str8 = " ";
        result = 1;
        Assertions.assertEquals(result, LongestSubStr.lengthOfLongestSubstring(str8));

    }

}