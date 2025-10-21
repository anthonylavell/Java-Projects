package code.pattern.company.boa.capital_one;

import java.util.HashMap;
import java.util.Map;

/*
Given an array of integers nums and an integer target, return indices of the two numbers such
that they add up to target.

You may assume that each input would have exactly one solution, and you may not use the same
element twice.

You can return the answer in any order.
 */
public class TwoSum {
    public static void main(String[] args) {

    }

    public static int[] twoSum(int[] nums, int target) {
        Map<Integer,Integer> mapOfInts = new HashMap<>();
        for (int index = 0; index < nums.length; index++){
            int key = target - nums[index];
            if (mapOfInts.containsKey(key)){
                return new int[] {mapOfInts.get(key), index};
            }
            mapOfInts.put(nums[index],index);
        }
        return null;
    }
}
