package leetcode.dp.test;

import leetcode.dp.WordBreak;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class WordBreakTest {

    @Test
    void testWordBreakTrue() {
        String s = "leetcode";
        List<String> wordDict = new ArrayList<>(Arrays.asList("leet","code"));
        Assertions.assertTrue(WordBreak.wordBreak(s,wordDict));

        String s2 = "applepenapple";
        List<String> wordDict2 = new ArrayList<>(Arrays.asList("apple","pen"));
        Assertions.assertTrue(WordBreak.wordBreak(s2,wordDict2));

        String s3 = "bb";
        List<String> wordDict3 = new ArrayList<>(Arrays.asList("a","b","bbb","bbbb"));
        Assertions.assertTrue(WordBreak.wordBreak(s3,wordDict3));

        String s4 = "aaaaaaa";
        List<String> wordDict4 = new ArrayList<>(Arrays.asList("aaaa","aaa"));
        Assertions.assertTrue(WordBreak.wordBreak(s4,wordDict4));
    }

    @Test
    void testWordBreakFalse() {
        String s = "leetcodepen";
        List<String> wordDict = new ArrayList<>(Arrays.asList("leet","code"));
        Assertions.assertFalse(WordBreak.wordBreak(s,wordDict));

        String s2 = "catsandog";
        List<String> wordDict3 = new ArrayList<>(Arrays.asList("cats","dog","sand","and","cat"));
        Assertions.assertFalse(WordBreak.wordBreak(s2,wordDict3));
    }
}