package leetcode.stack.test;

import leetcode.stack.ValidParentheses;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ValidParenthesesTest {
    @Test
    public void isValidTestThatFalseWithOneChar(){
        String s = "[";
        Assertions.assertFalse(ValidParentheses.isValid(s));
    }

    @Test
    public void isValidTestThatTrue(){
        //String s1 = "([{]})";
        //Assertions.assertFalse(ValidParentheses.isValid(s1));
        String s2 = "([{}])";
        Assertions.assertTrue(ValidParentheses.isValid(s2));
        String s3 = "()[]{}";
        Assertions.assertTrue(ValidParentheses.isValid(s2));
        String s4 = "()";
        Assertions.assertTrue(ValidParentheses.isValid(s2));
    }

    @Test
    public void isValidTestThatFalse(){
        String s1 = "([{]})";
        Assertions.assertFalse(ValidParentheses.isValid(s1));
        String s2 = "(])";
        Assertions.assertFalse(ValidParentheses.isValid(s2));
    }

}