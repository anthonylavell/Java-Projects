/*
Given an array of integers nums and an integer target, return
indices of the two numbers such that they add up to target.

You may assume that each input would have exactly one solution,
and you may not use the same element twice.

You can return the answer in any order.
 */
package comp_p.hubspot;

import java.util.HashMap;
import java.util.Map;

public class TwoSum {
    public static void main(String[] args) {
        int [] nums = {2,7,11,15};
        int target = 9;
        int [] resultArray = twoSum(nums,target);
    }

    public static int[] twoSum(int[] nums, int target) {
        Map<Integer,Integer> mapOfInt = new HashMap<>();
        for (int index = 0; index < nums.length; index++){
            if(mapOfInt.containsKey(nums[index])){
                return new int[]{mapOfInt.get(nums[index]),index};
            }
            mapOfInt.put((target-nums[index]),index);
        }
        return new int[2];

    }
}
