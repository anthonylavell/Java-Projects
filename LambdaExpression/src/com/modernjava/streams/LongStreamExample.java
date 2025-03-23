package com.modernjava.streams;

import java.util.Random;
import java.util.stream.LongStream;

public class LongStreamExample {
    public static void main(String[] args) {
        LongStream numbers = LongStream
                .of(1,2,3,4,5);

        numbers.forEach(System.out::println);
        System.out.println("-----------------");

        //iterate
        numbers = LongStream
                .iterate(0, i-> i+2)
                .limit(5);

        numbers.forEach(System.out::println);
        System.out.println("-----------------");

        //Random Generator
        numbers= LongStream
                .generate(new Random()::nextInt)
                .limit(5);

        numbers.forEach(System.out::println);
        System.out.println("-----------------");

        //range
        numbers=LongStream.range(1,5);

        numbers.forEach(System.out::println);
        System.out.println("-----------------");

        //rangeClosed
        numbers = LongStream.rangeClosed(1,5);
        numbers.forEach(System.out::println);
    }
}
