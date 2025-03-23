package practice.lambda.stream.terminal.min;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class StreamMinExample {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1,2,3,4,5,6,7,8);
        Optional results = numbers.stream()
                        .min(Integer::compareTo);
        System.out.println("results = " + results.get());
        System.out.println("-----------------------------");
        int results2 = numbers.stream()
                    .reduce(100, Integer::min);
        System.out.println("results2 = " + results2);
        System.out.println("-----------------------------");
        Optional result3 = numbers.stream()
                    .reduce(Integer::min);
        System.out.println("result3 = " + result3.get());
    }
}
