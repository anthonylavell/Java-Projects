package leetcode.string.test;

import leetcode.string.UniqueChar;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class UniqueCharTest {
    @Test
    public void testFirstUniqueCharWithExistedIndex(){
        String str = "leetcode";
        int result = 0;
        Assertions.assertEquals(result, UniqueChar.firstUniqueChar(str));
        String str2 = "loveleetcode";
        result = 2;
        Assertions.assertEquals(result, UniqueChar.firstUniqueChar(str2));
    }

    @Test
    public void testFirstUniqueCharWithOutExistedIndex(){
        String str = "abab";
        int result = -1;
        Assertions.assertEquals(result, UniqueChar.firstUniqueChar(str));
    }

}