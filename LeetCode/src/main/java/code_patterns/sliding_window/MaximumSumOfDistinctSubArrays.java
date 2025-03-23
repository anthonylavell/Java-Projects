package code_patterns.sliding_window;

import java.util.HashMap;
import java.util.Map;

public class MaximumSumOfDistinctSubArrays {
    public static void main(String[] args) {
        int [] nums = {5,3,3,1,1};
        int k = 3;
        System.out.println(maximumSubarraySum(nums,k));
    }

    public static long maximumSubarraySum(int[] nums, int k) {
        Map<Integer,Integer> mapOfIntegers = new HashMap<>();
        long result = 0;
        int left = 0;
        long subTotal = 0;

        for(int right = 0; right < nums.length; right++){
            subTotal+=nums[right];
            mapOfIntegers.put(nums[right], mapOfIntegers.getOrDefault(nums[right],0) + 1);
            if(right >= (k-1)){
                if(mapOfIntegers.size() == k){
                    result = Math.max(subTotal,result);
                }
                subTotal-=nums[left++];
                mapOfIntegers.put(nums[left],mapOfIntegers.get(nums[left])-1);
                if(mapOfIntegers.get(nums[left]) < 1){
                    mapOfIntegers.remove(nums[left]);
                }
            }
        }
        return result;
    }
}
