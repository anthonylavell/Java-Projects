package leetcode.string.test;

import leetcode.string.RansomNote;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RansomNoteTest {
    @Test
    public void testCanConstructWithTrue(){
        String ransomNote = "aa";
        String magazine = "aba";
        Assertions.assertTrue(RansomNote.canConstruct(ransomNote,magazine));
    }

    @Test
    public void testCanConstructWithFalse(){
        String ransomNote = "a";
        String magazine = "b";
        Assertions.assertFalse(RansomNote.canConstruct(ransomNote,magazine));

        String ransomNote2 = "haeiaajhhj";
        String magazine2 = "ahiehehf";
        Assertions.assertFalse(RansomNote.canConstruct(ransomNote2,magazine2));

    }

}