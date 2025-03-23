package com.modernjava.streams;

import java.util.OptionalDouble;
import java.util.OptionalInt;
import java.util.stream.IntStream;
import java.util.stream.LongStream;

public class NumericStreamAggregrateExample {
    public static void main(String[] args) {
        //sum
        int sum = IntStream
                .rangeClosed(0,1000)
                .sum();
        System.out.println("Sum of 1000 numbers is: "+sum);

        //min
        OptionalInt min = IntStream
                .rangeClosed(0,1000)
                .min();
        System.out.println("Minium of 1000 numbers is: "+min.getAsInt());

        OptionalInt max = IntStream
                .rangeClosed(0,1000)
                .max();
        System.out.println("Max of 1000 numbers is: "+max.getAsInt());

        OptionalDouble average = LongStream
                .rangeClosed(0,1000)
                .asDoubleStream()
                .average();
        System.out.println("Average is: "+(average.isPresent()?
                average.getAsDouble() :0.0));
    }
}
