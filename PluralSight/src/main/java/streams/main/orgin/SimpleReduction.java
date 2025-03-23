package streams.main.orgin;

import java.util.List;


public class SimpleReduction {
    public static void main(String[] args) {
        List<Integer> ints = List.of(1);
        int sum = ints.stream()
                .reduce(10, (i1, i2) -> i1 + i2);
        System.out.println("Sum = " + sum);
}
}
