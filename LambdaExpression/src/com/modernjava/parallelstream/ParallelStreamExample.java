package com.modernjava.parallelstream;

import java.util.stream.IntStream;

public class ParallelStreamExample {
    public static void main(String[] args) {
        System.out.println("Sum Sequential: " + sumSquentialStream());
        System.out.println("Sum Parallel: " + sumParallelStream());

    }

    public static int sumSquentialStream(){
        return IntStream.rangeClosed(0,50000).sum();
    }

    public static int sumParallelStream(){
        return IntStream.rangeClosed(0,50000).parallel().sum();
    }

}
