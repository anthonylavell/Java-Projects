package com.modernjava.streams;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class StreamMinExample {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(8,2,3,4,5,6,7,1);
        //Stream min function
        Optional result = numbers
                        .stream()
                        .min(Integer::compareTo);
        if(result.isPresent())
            System.out.println(result.get());

        int result2 = numbers
                        .stream()
                        .reduce(numbers.get(7),(a,b) -> (a<b) ? a :b);
        System.out.println(result2);

        Optional result3 = numbers
                        .stream()
                        .reduce((a,b)-> (a<b) ? a :b);
        if(result3.isPresent())
         System.out.println(result3.get());

        Optional result4 = numbers
                .stream()
                .reduce(Integer::min);
        if(result4.isPresent())
            System.out.println(result3.get());
    }
}
