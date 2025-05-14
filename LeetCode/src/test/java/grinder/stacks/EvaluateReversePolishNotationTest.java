package grinder.stacks;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class EvaluateReversePolishNotationTest {

    @Test
    void testEvalRPNEqual() {
        String [] tokens = {"2","1","+","3","*"};
        int result = 9;
        Assertions.assertEquals(result,EvaluateReversePolishNotation.evalRPN(tokens));

        String [] tokens2 = {"4","13","5","/","+"};
        int result2 = 6;
        Assertions.assertEquals(result2,EvaluateReversePolishNotation.evalRPN(tokens2));

        String [] tokens3 = {"10","6","9","3","+","-11","*","/","*","17","+","5","+"};
        int result3 = 22;
        Assertions.assertEquals(result3,EvaluateReversePolishNotation.evalRPN(tokens3));

        String [] tokens4 = {"4","-2","/","2","-3","-","-"};
        int result4 = -7;
       Assertions.assertEquals(result4,EvaluateReversePolishNotation.evalRPN(tokens4));

        String [] tokens5 = {"18"};
        int result5 =18;
        Assertions.assertEquals(result5,EvaluateReversePolishNotation.evalRPN(tokens5));
    }

    @Test
    void testEvalRPNFalse() {
        String [] tokens = {"2","1","+","3","*"};
        int result = 91;
        Assertions.assertFalse(result==EvaluateReversePolishNotation.evalRPN(tokens));
    }
}