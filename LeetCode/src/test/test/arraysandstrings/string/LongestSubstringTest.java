package arraysandstrings.string;

import arraysandstrings.string.longest_string.LongestSubstringWithoutRepeatingChars;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;

public class LongestSubstringTest {
    private LongestSubstringWithoutRepeatingChars ls;

    @org.junit.Before
    public void setUp(){
        ls = new LongestSubstringWithoutRepeatingChars();
    }

    @org.junit.Test
    public void wrongLengthOfString(){
        assertNotEquals(2,ls.lengthOfLongestSubstring("dvdf"));
    }

    @org.junit.Test
    public void lengthOfLongestSubstring() {
        assertEquals(4,ls.lengthOfLongestSubstring("dvdfc"));
        assertEquals(1,ls.lengthOfLongestSubstring("c"));
        assertEquals(3,ls.lengthOfLongestSubstring("abcabcbb"));
    }
}