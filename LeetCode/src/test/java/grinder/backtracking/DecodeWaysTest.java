package grinder.backtracking;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class DecodeWaysTest {

    @BeforeEach
    void setUp() {
    }

    @Test
    void testNumDecodings() {
        String str = "2";
        int result = 1;
        Assertions.assertEquals(result,DecodeWays.numDecodings(str));

        String str2 = "12";
        int result2 = 2;
        Assertions.assertEquals(result2,DecodeWays.numDecodings(str2));

        String str3 = "226";
        int result3 = 3;
        Assertions.assertEquals(result3,DecodeWays.numDecodings(str3));

        String str4 = "06";
        int result4 = 0;
        Assertions.assertEquals(result4,DecodeWays.numDecodings(str4));

        String str5 = "1201234";
        int result5 = 3;
        Assertions.assertEquals(result5,DecodeWays.numDecodings(str5));

        String str6 = "10011";
        int result6 = 0;
        Assertions.assertEquals(result6,DecodeWays.numDecodings(str6));

        String str7 = "111111111111111111111111111111111111111111111";
        int result7 = 1836311903;
        Assertions.assertEquals(result7,DecodeWays.numDecodings(str7));
    }
}