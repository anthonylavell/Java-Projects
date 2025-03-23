package practice.lambda.stream.intermediate.boxinguboxing;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class BoxingUnBoxingExample {
    public static void main(String[] args) {
        List<Integer> numbers;

        IntStream numStream = IntStream.rangeClosed(0,500);
        numbers = numStream
                .boxed()
                .collect(Collectors.toList());
        numbers.forEach(System.out::println);
        System.out.println("------------------------");

        Optional<Integer> optionalSum = numbers.stream()
                                .reduce((a,b) -> a + b);
        if(optionalSum.isPresent()){
            System.out.println(optionalSum.get());
        }

        System.out.println("------------------------");

        int sum = numbers.stream()
                .mapToInt(Integer::intValue)
                .sum();
        System.out.println(sum);



    }
}
