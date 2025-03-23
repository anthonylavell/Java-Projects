package com.modernjava.streams;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import static java.lang.System.*;
public class StreamLimitAndSkipExample {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1,2,3,4,5,6,7,8);
        List<Integer> limit5numbers = numbers
                                    .stream()
                                    .limit(5)
                                    .collect(Collectors.toList());
        limit5numbers.forEach(out::println);
        out.println("--------------------");
        List skip5Numbers = numbers
                            .stream()
                            .skip(5)
                            .collect(Collectors.toList());
        skip5Numbers.forEach(out::println);
    }
}
