package practice.array;

import java.util.HashMap;
import java.util.Map;

public class TwoSum {
    public static int[] twoSum(int[] nums, int target) {
        Map<Integer,Integer>hashMap = new HashMap<>();
        for(int index = 0; index < nums.length; index++){
            int counterPart = target - nums[index];
            if(hashMap.containsKey(counterPart)){
                return new int [] {hashMap.get(counterPart), index};
            }
            hashMap.put(nums[index],index);
        }
        return new int [] {};
    }
}
