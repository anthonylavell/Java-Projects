package practice.lambda.stream.intermediate.sort;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StreamSortExample {
    public static void main(String[] args) {
        List<String> listOfNames = Arrays.asList("Clara","Alvin","Lashawn","James",
                "Charles");
        List<String> listOfSortedNames = listOfNames.stream()
                                        .sorted()
                                        .collect(Collectors.toList());
        System.out.println(listOfNames);
        System.out.println("---------------------------------");
        System.out.println(listOfSortedNames);
    }
}
