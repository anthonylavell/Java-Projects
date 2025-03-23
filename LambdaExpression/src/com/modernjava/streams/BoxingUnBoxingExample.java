package com.modernjava.streams;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class BoxingUnBoxingExample {
    public static void main(String[] args) {
        List<Integer> numbers;
        IntStream numStream = IntStream
                .rangeClosed(0,5000);
        numbers = numStream
                .boxed()
                .collect(Collectors.toList());
        numbers.forEach(System.out::println);
        System.out.println("------------------------");

        Optional<Integer> sum = numbers
                        .stream()
                        .reduce((a,b)-> a+b);
        if(sum.isPresent())
            System.out.println(sum.get());
        System.out.println("------------------------");

        int sum2 = numbers
                    .stream()
                    .mapToInt(Integer::intValue)
                    .sum();
        System.out.println(sum2);

    }
}
