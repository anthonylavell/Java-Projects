package arraysandstrings.array;

import java.util.HashSet;
import java.util.Set;

public class ContainsDuplicate {
    public static void main(String[] args) {
        int [] arrayOfInt = {1,2,3,1};
        containsDuplicate(arrayOfInt);
    }
    public static boolean containsDuplicate(int[] nums) {
        Set<Integer> setOfInteger = new HashSet<>(nums.length);
        for(int num : nums){
            if(!setOfInteger.add(num)){
                return true;
            }
        }
        return false;
    }
}
