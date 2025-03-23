package ds.list.unique_list;

import arraysandstrings.string.ValidAnagram;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class ValidAnagramTest {
        String str;
        String str2;

    @Test
    void isAnagramFalse() {
        str = "team";
        str2 = "maer";
        Assertions.assertFalse(ValidAnagram.isAnagram(str,str2));
    }
    @Test
    void isAnagramTrue() {
        str = "team";
        str2 = "maet";
        Assertions.assertTrue(ValidAnagram.isAnagram(str,str2));

        str = "aabantana";
        str2 = "aaanbanat";
        Assertions.assertTrue(ValidAnagram.isAnagram(str,str2));
    }
}