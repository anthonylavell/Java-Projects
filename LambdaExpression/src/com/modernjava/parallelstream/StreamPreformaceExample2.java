package com.modernjava.parallelstream;

import java.util.Comparator;
import java.util.List;
import java.util.concurrent.ThreadLocalRandom;
import java.util.function.Supplier;
import java.util.stream.Collectors;
import java.util.stream.LongStream;

public class StreamPreformaceExample2 {
    static long tokenCount = 50000;
    public static void main(String[] args) {
        int loop = 20;
        long result = measurePerformance(StreamPreformaceExample2::sortSequentialStream
                ,loop);
        System.out.println("Time taken to process sum in sequential: "+result+" in " +
                "msces");
        System.out.println("----------------------------");
        result = measurePerformance(StreamPreformaceExample2::sortParallelStream,loop);
        System.out.println("Time taken to process sum in parallel: "+result+" in msces");

    }

    public static long measurePerformance(Supplier<Long> supplier, int numberOfTimes){
        long startTime= System.currentTimeMillis();
        for(int i=0; i <numberOfTimes; i++){
            supplier.get();
        }
        return System.currentTimeMillis() - startTime;
    }

    public static long sortSequentialStream(){
        List<RandomTokens> randomTokens = LongStream.rangeClosed(0,tokenCount)
                .mapToObj((i)->{
                    return new RandomTokens(i, ThreadLocalRandom.current()
                            .nextLong(tokenCount));
                }).collect(Collectors.toList());
        randomTokens.stream().sorted(Comparator.comparing(RandomTokens::getTokens));
        return -1;
    }

    public static long sortParallelStream(){
        List<RandomTokens> randomTokens = LongStream.rangeClosed(0,tokenCount)
                                    .parallel().mapToObj((i)->{
                                        return new RandomTokens(i, ThreadLocalRandom.current()
                                        .nextLong(tokenCount));
                }).collect(Collectors.toList());
        randomTokens.stream().parallel().sorted(Comparator.comparing(RandomTokens::getTokens));
        return -1;
    }

}

class RandomTokens{
    long id;
    long tokens;

    public RandomTokens(long id, long tokens) {
        this.id = id;
        this.tokens = tokens;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public long getTokens() {
        return tokens;
    }

    public void setTokens(long tokens) {
        this.tokens = tokens;
    }
}
