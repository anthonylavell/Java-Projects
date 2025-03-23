package string.testcase;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import string.ReverseStr;

class ReverseStrTest {

    @Test
    public void reverseSentenceWithOneWhiteSpace(){
        String str = "Hello Ward";
        String testResult = "olleH draW";
        Assertions.assertEquals(testResult, ReverseStr.words2(str));
    }

    @Test
    public void reverseSentenceWithMultipleWhiteSpace(){
        String str = "Hot   Stuff ";
        String testResult = "toH   ffutS ";
        Assertions.assertEquals(testResult, ReverseStr.words2(str));
    }

}