package arraysandstrings.string;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class STRTest {

    @Test
    void findIndex() {
        String str = "abcabc";
        int result = 3;
        assertEquals(result,STR.findIndex(str));

        String str2 = "xabcabcabc";
        int result2 = 4;
        assertEquals(result2,STR.findIndex(str2));

        String str3 = "bacxfgebbacabc";
        int result3 = 8;
        assertEquals(result3,STR.findIndex(str3));

        String str4 = "abcfbc";
        int result4 = -1;
        assertEquals(result4,STR.findIndex(str4));

        String str5 = "abcdefg";
        int result5 =  -1;
        assertEquals(result5,STR.findIndex(str5));

        String str6 = "abcfgabc";
        int result6 = 5;
        assertEquals(result6,STR.findIndex(str6));

        String str7 = "abcagabc";
        int result7 = 5;
        assertEquals(result7,STR.findIndex(str7));

        String str8 = "abcabdabc";
        int result8 = 6;
        assertEquals(result8,STR.findIndex(str8));

        String str9 = "bbbbxbbb";
        int result9 = 5;
        assertEquals(result9, STR.findIndex(str9));

    }
}