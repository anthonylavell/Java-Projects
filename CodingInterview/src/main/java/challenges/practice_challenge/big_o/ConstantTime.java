package challenges.practice_challenge.big_o;

import java.util.Arrays;
import java.util.Set;
import java.util.stream.Collectors;

// Big O(1) Constant Time
public class ConstantTime {
    public static void main(String[] args) {
        int a = 0;
        int b = 1;
        int sum;
        sum = a+b;
        int [] number = {1,2,3};
        Set<Integer> hs = Arrays.stream(number).boxed().collect(Collectors.toSet());

        if(hs.contains(3)){
            System.out.println("yes");
        }
    }
}
