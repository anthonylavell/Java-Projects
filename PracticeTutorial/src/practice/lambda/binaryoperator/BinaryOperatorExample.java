package practice.lambda.binaryoperator;

import java.util.Comparator;
import java.util.function.BinaryOperator;

public class BinaryOperatorExample {
    public static void main(String[] args) {
        BinaryOperator<Integer>powerOfTwo =
                (first, second)->(first*first) + (second*second);
        Integer first = 2;
        Integer second = 3;
        System.out.println(powerOfTwo.apply(first,second));
        Comparator<Integer> comparator = (a,b) -> a.compareTo(b);
        BinaryOperator<Integer> maxNum =  BinaryOperator.maxBy(comparator);
        BinaryOperator<Integer>minNum = BinaryOperator.minBy(comparator);
        System.out.println("-----------------------------------");
        System.out.println(maxNum.apply(first,second));
        System.out.println(minNum.apply(first,second));
    }
}
