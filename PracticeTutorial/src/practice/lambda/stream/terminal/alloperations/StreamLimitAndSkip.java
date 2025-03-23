package practice.lambda.stream.terminal.alloperations;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StreamLimitAndSkip {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1,2,3,4,5,6,7,8);
        List<Integer> limit5numbers = numbers.stream()
                                .limit(5)
                                .collect(Collectors.toList());
        limit5numbers.forEach(System.out::println);
        System.out.println("--------------------------------------------");
        List<Integer> skipfirst5numbers = numbers.stream()
                                        .skip(5)
                                        .collect(Collectors.toList());
        skipfirst5numbers.forEach(System.out::println);
    }
}
