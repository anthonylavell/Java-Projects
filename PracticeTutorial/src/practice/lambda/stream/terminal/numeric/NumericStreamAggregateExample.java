package practice.lambda.stream.terminal.numeric;

import java.util.OptionalDouble;
import java.util.OptionalInt;
import java.util.stream.IntStream;
import java.util.stream.LongStream;

public class NumericStreamAggregateExample {
    public static void main(String[] args) {
        //sum
        int sum = IntStream.rangeClosed(0,100).sum();
        System.out.println("sum = " + sum);
        System.out.println("------------------");

        //min
        OptionalInt min = IntStream.range(0,100).min();
        System.out.println("min = " + min);
        System.out.println("---------------------");

        //max
        OptionalInt max = IntStream.range(0,100).max();
        System.out.println("max = " + max);
        System.out.println("--------------------------------");

        //average
        OptionalDouble average = LongStream.rangeClosed(0,100).average();
        System.out.println("average = " + (average.isPresent() ? average.getAsDouble() : 0.0));




    }
}
