package arraysandstrings.string;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class PalindromeTest {
    private Palindrome palindrome;
    @Before
    public void setUp(){
        palindrome = new Palindrome();
    }

    @Test
    public void longestPalindrome() {
        String str = "abcabc";
        String str1 = "bacxfgebbacabc";
        String str2="dvdf";
        String str3="c";
        String str4="abcabcbb";
        //String str5="babad";
        String str6="cbbd";
        String str7="";
        assertEquals("",palindrome.longestPalindrome(str7));
        assertTrue(palindrome.longestPalindrome(str).contains("c"));
        assertEquals("bacab",palindrome.longestPalindrome(str1));
        assertEquals("dvd",palindrome.longestPalindrome(str2));
        assertEquals("c",palindrome.longestPalindrome(str3));
        assertEquals("bcb",palindrome.longestPalindrome(str4));
        //assertEquals("bab",palindrome.longestPalindrome(str5));
        assertEquals("bb",palindrome.longestPalindrome(str6));


    }
}