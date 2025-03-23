package array.non_divisible;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class MatheMaticsClient {
    public static void main(String[] args) {
        int num = 4;
        //int [] numbers = {1,16,20,12,17,27,11};
        //int [] numbers = {19,10,12,10,24,25,22};
        //int [] numbers = {1,7,11,15,19,23,27};
        int [] numbers = {1,7,2,4};
        //int [] numbers = {278, 576, 496, 727, 410, 124, 338, 149, 209, 702, 282, 718, 771, 575, 436};
        //Arrays.sort(numbers);
        List<Integer> lstNumber = Arrays.stream(numbers).boxed().collect(Collectors.toList());
       /* lstNumber.remove(new Integer(27));
        System.out.println(lstNumber);*/
        System.out.println(MatheMatics.nonDivisibleSubset(num,numbers));
    }
}
