package practice.lambda.unaryoperator;

import java.util.function.UnaryOperator;

public class UnaryOperatorExample {
    public static void main(String[] args) {
        UnaryOperator<Integer> time2 = (number)-> number*2;
        System.out.println(time2.apply(4));
    }
}
