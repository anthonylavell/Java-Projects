package practice.lambda.stream.terminal.reduce;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class StreamReduceExample {
    public static void main(String[] args) {
        List<Integer> listOfNum = Arrays.asList(1,2,3,4,5);
        Integer number = listOfNum.stream()
                        .reduce(0,(a,b)-> a+b);
        System.out.println(listOfNum);
        System.out.println("--------------------------");
        System.out.println(number);
        System.out.println("--------------------------");
        List<Integer> numbers = Arrays.asList(1,2,3,4,5,6,7,8,9);
        int results = numbers.stream()
                .reduce(0,(a,b) -> a +b);
        System.out.println("results "+results);
        System.out.println("--------------------------");
                
        int results2 = numbers.stream()
                    .reduce(1,(a,b) -> a*b);
        System.out.println("results2 = " + results2);
        System.out.println("--------------------------");
        Optional result3 = numbers.stream()
                    .reduce((a,b) -> a+b);

        System.out.println("result3 = " + result3.get());
        System.out.println("--------------------------");
        int result4 = listOfNum.stream()
                .collect(Collectors.reducing(0,Integer::sum));
        System.out.println("result4 = " + result4);
    }
}
