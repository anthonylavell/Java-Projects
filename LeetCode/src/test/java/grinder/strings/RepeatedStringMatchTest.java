package grinder.strings;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class RepeatedStringMatchTest {

    @Test
    void testRepeatedStringMatch() {
        String a = "abcd";
        String b = "cdabcdab";
        int output = 3;
        assertEquals(output, RepeatedStringMatch.repeatedStringMatch(a,b));

        String a2 = "aa";
        String b2 = "a";
        int output2 = 1;
        assertEquals(output2, RepeatedStringMatch.repeatedStringMatch(a2,b2));

        String a3 = "aa";
        String b3 = "f";
        int output3 = -1;
        assertEquals(output3, RepeatedStringMatch.repeatedStringMatch(a3,b3));

        String a4 = "abc";
        String b4 = "cabcabca";
        int output4 = 4;
        assertEquals(output4, RepeatedStringMatch.repeatedStringMatch(a4,b4));
    }
}