package leetcode.string.test;

import leetcode.string.Roman;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class RomanTest {

    @Test
    void testRomanToInt() {
        String s = "III";
        int result = 3;
        Assertions.assertEquals(result, Roman.romanToInt(s));

        String s2 = "LVIII";
        int result2 = 58;
        Assertions.assertEquals(result2, Roman.romanToInt(s2));

        String s3 = "MCMXCIV";
        int result3 = 1994;
        Assertions.assertEquals(result3, Roman.romanToInt(s3));
    }
}