package grinder.stacks;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ValidParenthesesTest {

    @Test
    void isValid() {
        String str = "()";
        assertTrue(ValidParentheses.isValid(str));

        String str2 = "()[]{}";
        assertTrue(ValidParentheses.isValid(str2));
    }

    @Test
    void isNotValid() {
        String str = "(]";
        assertFalse(ValidParentheses.isValid(str));

        String str2 = "[";
        assertFalse(ValidParentheses.isValid(str2));
    }
}