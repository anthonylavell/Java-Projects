package leetcode.arrays.testing;

import kin_carta.PostfixCalc;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class PostfixCalcTest {

    @Test
    void testEvalRPN() {
        String [] tokens = {"9","2","1","1","*","-5","+","/","+"};
        int result = 9;
        Assertions.assertEquals(result, PostfixCalc.evalRPN(tokens));

        String [] tokens2 = {"10","6","9","3","+","-11","*","/","*","17","+","5","+"};
        int result2 = 22;
        Assertions.assertEquals(result2, PostfixCalc.evalRPN(tokens2));

        String [] tokens3 = {"10","6","9","3","+","-11","*","/","+","17","+","5","+"};
        int result3 = 32;
        Assertions.assertEquals(result3, PostfixCalc.evalRPN(tokens3));

        String [] tokens4 = {"10"};
        int result4 = 10;
        Assertions.assertEquals(result4, PostfixCalc.evalRPN(tokens4));

        String [] tokens5 = {"4","-2","/","2","-3","-","-"};
        int result5 = -7;
        Assertions.assertEquals(result5, PostfixCalc.evalRPN(tokens5));
    }
}