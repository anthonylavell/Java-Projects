package practice.lambda.stream.terminal.max;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class StreamMaxExample {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1,2,3,4,5,6,7,8);
        Optional result = numbers.stream()
                        .max(Integer::compareTo);
        if(result.isPresent())
            System.out.println("result = " + result.get());
        System.out.println("--------------------------------");
        int result2 = numbers.stream()
                        .reduce(0,(a,b) -> (a>b)? a : b);
        System.out.println("result2 = " + result2);
    }

}
