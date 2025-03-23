package code_patterns.sliding_window;

import java.util.HashMap;
import java.util.Map;

public class MaximumSumOfDistinctSubArrays_Pt2 {
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
            if(mapOfIntegers.containsKey(nums[right])){
                while (left < mapOfIntegers.get(nums[right])+1){
                    subTotal-=nums[left++];
                }
            }
            mapOfIntegers.put(nums[right],right);
            if((right - left) == (k-1)){
                if(subTotal> result){
                    result = subTotal;
                }
                subTotal-=nums[left++];
            }
        }
        return result;
    }
}
