package code_patterns.sliding_window;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FindAllAnagramsTest {

    @Test
    void findAnagramsWithK2(){
        String s = "cbaebabacd";
        String p = "abc";
        FindAllAnagrams.findAnagrams(s,p);

        String s2 = "af";
        String p2 = "be";
        FindAllAnagrams.findAnagrams(s,p);
    }

}