package code.pattern.two_pointers;

import java.util.*;

public class TwoSum {
    public static List<Integer> twoSumSorted(List<Integer> nums, int target) {
        // WRITE YOUR BRILLIANT CODE HERE
        Map<Integer,Integer> hMap = new HashMap<>();
        for(int index = 0; index < nums.size(); index++){
            int key = target - nums.get(index);
            if(hMap.containsKey(key)){
                return new ArrayList<>(Arrays.asList(hMap.get(key),index+1));
            }
            hMap.put(nums.get(index),index+1);
        }
        return null;
    }
}
