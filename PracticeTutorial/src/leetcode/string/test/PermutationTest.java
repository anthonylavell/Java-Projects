package leetcode.string.test;

import leetcode.string.Permutation;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PermutationTest {
    @Test
    public void TestStringForTrue(){
    String str = "ab";
    String str2 = "eiptbanyz";
    Assertions.assertTrue(Permutation.checkInclusion(str,str2));
    str = "adc";
    str2 ="dcda";
    Assertions.assertTrue(Permutation.checkInclusion(str,str2));
    }

   @Test
    public void TestStringForFalse(){
        String str = "ab";
        String str2 = "eidboaoo";
        Assertions.assertFalse(Permutation.checkInclusion(str,str2));
        str =  "anthon";
        str2 = "ntatony";
       Assertions.assertFalse(Permutation.checkInclusion(str,str2));
       str = "abc";
       str2 = "ccccbbbbaaaa";
       Assertions.assertFalse(Permutation.checkInclusion(str,str2));

   }
}