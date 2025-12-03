package arraysandstrings.string;

import org.junit.Assert;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class FindAllGroupAnagramsInStringTest {

    @Test
    void findAnagramsTest() {
        String s = "cbaebabacd", p = "abc";
        List<Integer> listOfInts = new ArrayList<>(Arrays.asList(0,6));
        Assert.assertEquals(listOfInts, FindAllAnagramsInString.findAnagrams(s,p));

        String s2 = "abab";
        String p2 = "ab";
        List<Integer> listOfInts2 = new ArrayList<>(Arrays.asList(0,1,2));
        Assert.assertEquals(listOfInts2, FindAllAnagramsInString.findAnagrams(s2,p2));

        String s3 = "abacbabc";
        String p3 = "abc";
        List<Integer> listOfInts3 = new ArrayList<>(Arrays.asList(1,2,3,5));
        Assert.assertEquals(listOfInts3, FindAllAnagramsInString.findAnagrams(s3,p3));

        String s4 = "abaacbabc";
        String p4 = "abc";
        List<Integer> listOfInts4 = new ArrayList<>(Arrays.asList(3,4,6));
        Assert.assertEquals(listOfInts4, FindAllAnagramsInString.findAnagrams(s4,p4));

        String s5 = "acdcaeccde";
        String p5 = "c";
        List<Integer> listOfInts5 = new ArrayList<>(Arrays.asList(1,3,6,7));
        Assert.assertEquals(listOfInts5, FindAllAnagramsInString.findAnagrams(s5,p5));
    }
}