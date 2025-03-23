package challenges.practice_challenge.coding_challenge;

import java.util.HashSet;
import java.util.Set;

// Take two numbers and find the sum. If you find the sum then return true if not return false
public class FindSum {
    public static void main(String[] args) {
        int [] numArr = {3,2,1,4};
        int sum = 8;
        System.out.println(FindSum.foundSum(numArr, sum));
    }

    public static boolean foundSum(int [] numArr, int sum){
        //Store sum-number
        Set<Integer>setOfNumbers = new HashSet<>();
        for(int num : numArr){
            if(setOfNumbers.contains(num)){
                return true;
            }
            setOfNumbers.add( (sum - num) );
        }

        return false;
    }
}
