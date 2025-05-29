package code_patterns.two_pointers;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BackSpaceStringCompareTest {

    @Test
    void backspaceCompareTrue() {
        String str = "ab#c";
        String str2 = "ad#c";
        assertTrue(BackSpaceStringCompare.backspaceCompare(str,str2));

        String str3 = "ab##";
        String str4 = "c#d#";
        assertTrue(BackSpaceStringCompare.backspaceCompare(str3,str4));

        String str5 = "ab##c";
        String str6 = "a#c";
        assertTrue(BackSpaceStringCompare.backspaceCompare(str5,str6));

        String str7 = "a##c";
        String str8 = "#a#c";
        assertTrue(BackSpaceStringCompare.backspaceCompare(str7,str8));

        String str9 = "bxj##tw";
        String str10 = "bxo#j##tw";
        assertTrue(BackSpaceStringCompare.backspaceCompare(str9,str10));

        String str11 = "y#fo##f";
        String str12 = "y#f#o##f";
        assertTrue(BackSpaceStringCompare.backspaceCompare(str11,str12));
    }

    @Test
    void backspaceCompareFalse() {
        String str = "a#c";
        String str2 = "b";
        assertFalse(BackSpaceStringCompare.backspaceCompare(str,str2));

        String str3 = "hd#dp#czsp#####";
        String str4 = "hd#dp#czsp######";
        assertFalse(BackSpaceStringCompare.backspaceCompare(str3,str4));
    }
}