package grinder.strings;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ValidPalindromeTest {

    @Test
    void isPalindromeTrue() {
        String str = " ";
        assertTrue(ValidPalindrome.isPalindrome(str));

        String str2 = "A man, a plan, a canal: Panama";
        assertTrue(ValidPalindrome.isPalindrome(str2));
    }

    @Test
    void isPalindromeFalse() {
        String str = "0P";
        assertFalse(ValidPalindrome.isPalindrome(str));

        String str2 = "race a car";
        assertFalse(ValidPalindrome.isPalindrome(str2));
    }
}