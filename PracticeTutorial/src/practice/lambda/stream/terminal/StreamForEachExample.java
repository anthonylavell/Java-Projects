package practice.lambda.stream.terminal;

import java.util.Arrays;
import java.util.List;

public class StreamForEachExample {
    public static void main(String[] args) {
        List<String> listOfNames = Arrays.asList("Clara","Alvin","Lashawn","James",
                "Charles");
        listOfNames.stream()
                    .sorted()
                    .forEach( System.out::println );
    }
}
