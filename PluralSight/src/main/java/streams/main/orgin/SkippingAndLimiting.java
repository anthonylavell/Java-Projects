package streams.main.orgin;

import java.nio.file.Path;
import java.util.stream.IntStream;

public class SkippingAndLimiting {
    public static void main(String[] args) {
        IntStream.range(0,30)
                .skip(10)
                .limit(10)
                .forEach(index -> System.out.println(index + " "));
    }
}
