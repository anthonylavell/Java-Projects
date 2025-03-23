package code_patterns.sliding_window;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class LongestSubStringWithAtMostKDistinctTest {

    @Test
    void testLengthOfLongestSubstringKDistinctWithK0(){
        String str = "aa";
        String str2 = "a";
        int k = 0;
        assertEquals(0,LongestSubStringWithAtMostKDistinct.lengthOfLongestSubstringKDistinct(str,k));
        assertEquals(0,LongestSubStringWithAtMostKDistinct.lengthOfLongestSubstringKDistinct(str2,k));
    }

    @Test
    void testLengthOfLongestSubstringKDistinctWithK1(){
        String str = "aa";
        String str2 = "a";
        int k = 1;
        assertEquals(2,LongestSubStringWithAtMostKDistinct.lengthOfLongestSubstringKDistinct(str,k));
        assertEquals(1,LongestSubStringWithAtMostKDistinct.lengthOfLongestSubstringKDistinct(str2,k));
    }

    @Test
    void testLengthOfLongestSubstringKDistinctWithK2(){
        String str = "aaft";
        String str2 = "eceba";
        String str3 = "abbs";
        String str4 = "bacc";
        String str5 = "abaccc";
        int k = 2;
        assertEquals(3,LongestSubStringWithAtMostKDistinct.lengthOfLongestSubstringKDistinct(str,k));
        assertEquals(3,LongestSubStringWithAtMostKDistinct.lengthOfLongestSubstringKDistinct(str2,k));
        assertEquals(3,LongestSubStringWithAtMostKDistinct.lengthOfLongestSubstringKDistinct(str3,k));
        assertEquals(3,LongestSubStringWithAtMostKDistinct.lengthOfLongestSubstringKDistinct(str4,k));
        assertEquals(4,LongestSubStringWithAtMostKDistinct.lengthOfLongestSubstringKDistinct(str5,k));
    }

    @Test
    void testLengthOfLongestSubstringKDistinctWithK3(){
        String str = "babcbc";
        int k = 3;
        assertEquals(6,LongestSubStringWithAtMostKDistinct.lengthOfLongestSubstringKDistinct(str,k));
    }

    /*@Test
    void testLengthOfLongestSubstringKDistinctWithK4(){

    }*/

}