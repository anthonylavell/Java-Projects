package practice.java8interfaces.defaults;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class DefaultsStaticExample {
    public static void main(String[] args) {
        List<String> names = Arrays.asList("Mike", "Syed","Jenny","Anthony","Gene");
        /*Collections.sort(names);
        System.out.println("names = " + names);*/

        names.sort(Comparator.naturalOrder());
        System.out.println("names = " + names);
    }
}
