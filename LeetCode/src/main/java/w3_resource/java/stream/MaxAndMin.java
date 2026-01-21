package w3_resource.java.stream;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class MaxAndMin {
    public static int getMax( List<Integer>listOfNumbers){
        return listOfNumbers.stream().max(Integer::compare).orElseThrow();
    }

    public static int getMin( List<Integer>listOfNumbers){
        return listOfNumbers.stream().min(Integer::compare).orElse(Integer.MAX_VALUE);
    }

    public static int getSecondLargestNum( List<Integer>listOfNumbers){
        return listOfNumbers.stream().distinct().sorted(Comparator.reverseOrder()).skip(1).max(Integer::compare).orElse(Integer.MIN_VALUE);
    }

    public static int getSecondSmallestNum( List<Integer>listOfNumbers){
        return listOfNumbers.stream().distinct().sorted().skip(1).min(Integer::compare).orElse(Integer.MAX_VALUE);
    }
    public static void main(String[] args) {
        List<Integer>listOfNumbers =new ArrayList<>(Arrays.asList(11, 2, 3, 14, 5, 6, 7, 8, 9, 10));
        System.out.println(getMax(listOfNumbers));
        System.out.println(getMin(listOfNumbers));
        System.out.println(getSecondLargestNum(listOfNumbers));
        System.out.println(getSecondSmallestNum(listOfNumbers));
    }
}
