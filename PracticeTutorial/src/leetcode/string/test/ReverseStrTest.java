package leetcode.string.test;

import leetcode.string.ReverseStr;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

class ReverseStrTest {
    @Test
    public void testReverseString(){
        char[] s = {'h','e','l','l','o'};
        ReverseStr.reverseString(s);
        char[] resultArray = {'o','l','l','e','h'};
        Assertions.assertEquals(Arrays.toString(resultArray), Arrays.toString(s));

        char[] s2 = {'H','a','n','n','a','h'};
        ReverseStr.reverseString(s2);
        char[] resultArray2 =  {'h','a','n','n','a','H'};
        Assertions.assertEquals(Arrays.toString(resultArray2), Arrays.toString(s2));

        char[] s3 = {'h'};
        ReverseStr.reverseString(s3);
        char[] resultArray3 =  {'h'};
        Assertions.assertEquals(Arrays.toString(resultArray3), Arrays.toString(s3));

        char[] s4 = {'a','h'};
        ReverseStr.reverseString(s4);
        char[] resultArray4 =  {'h','a'};
        Assertions.assertEquals(Arrays.toString(resultArray4), Arrays.toString(s4));
    }

    @Test
    public void testReverseWords(){
        String str = "Ward to Anthony";
        String resultStr = "draW ot ynohtnA";
        Assertions.assertEquals(resultStr, ReverseStr.reverseWords(str));

        String str2 = "a's s'a x's";
        String resultStr2 = "s'a a's s'x";
        Assertions.assertEquals(resultStr2, ReverseStr.reverseWords(str2));

        String str3 = "Let's take LeetCode contest";
        String resultStr3 = "s'teL ekat edoCteeL tsetnoc";
        Assertions.assertEquals(resultStr3, ReverseStr.reverseWords(str3));
    }

}