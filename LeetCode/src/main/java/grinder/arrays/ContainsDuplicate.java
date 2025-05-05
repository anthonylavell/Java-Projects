package grinder.arrays;

import java.util.HashSet;
import java.util.Set;

public class ContainsDuplicate {
    public static void main(String[] args) {
        int[] nums = {3,1,1,4};
        System.out.println(containsDuplicate(nums));
    }

    public static boolean containsDuplicate(int[] nums) {
        Set<Integer>visited = new HashSet<>(nums.length);
        for (int num : nums){
            if (!visited.add(num)){
                return true;
            }
        }
        return false;
    }
}
