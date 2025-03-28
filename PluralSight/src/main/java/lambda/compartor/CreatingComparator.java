package lambda.compartor;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.function.Function;

public class CreatingComparator {
    public static void main(String[] args) {
        List<String> strings = Arrays.asList("one","two","three","four","five","six","seven","eight","nine");
        Comparator<String> cmp = (s1, s2) -> s1.compareTo(s2);
        strings.sort(cmp);
        System.out.println(strings);

       // Function<String, Integer> toLength = s -> s.length();
        Function<String, Integer> toLength = s -> s.length();

        Comparator<String> cmp2 = Comparator.comparing(toLength);
        System.out.println(strings);
    }
}
