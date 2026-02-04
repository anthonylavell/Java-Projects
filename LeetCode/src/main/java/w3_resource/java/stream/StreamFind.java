package w3_resource.java.stream;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class StreamFind {
    public static List<Integer> findDupNumbers(List<Integer>listOfNums){
        Set<Integer>setOfNums = new HashSet<>();
        return listOfNums.stream().filter(num->!setOfNums.add(num)).distinct().toList();
    }

    public static int findDuplicate(int[] nums) {
        Set<Integer>setOfNums = new HashSet<>();
        return Arrays.stream(nums).boxed().filter(num-> !setOfNums.add(num)).findFirst().orElse(-1);
    }
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 2, 5, 1,1);
        int[] nums = {3,3,3,3,3};
        System.out.println(findDupNumbers(numbers));
        System.out.println(findDuplicate(nums));
    }
}
