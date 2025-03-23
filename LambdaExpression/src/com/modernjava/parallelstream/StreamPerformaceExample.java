package com.modernjava.parallelstream;

import java.util.function.Supplier;
import java.util.stream.IntStream;

public class StreamPerformaceExample {
    public static void main(String[] args) {
        int loop = 20;
        long result = measurePerformance(StreamPerformaceExample::sumSquentialStream, loop);
        System.out.println("Time taken to process sum in sequential: "+result+"in msces");
        System.out.println("----------------------------");
        result = measurePerformance(StreamPerformaceExample::sumParallelStream,loop);
        System.out.println("Time taken to process sum in parallel: "+result+"in msces");
    }

    public static long measurePerformance(Supplier<Integer> supplier, int numberOfTimes){
       long startTime= System.currentTimeMillis();
        for(int i=0; i <numberOfTimes; i++){
            supplier.get();
        }
        return System.currentTimeMillis() - startTime;
    }

    public static int sumSquentialStream(){
        return IntStream.rangeClosed(0,50000).sum();
    }

    public static int sumParallelStream(){
        return IntStream.rangeClosed(0,50000).parallel().sum();
    }
}
