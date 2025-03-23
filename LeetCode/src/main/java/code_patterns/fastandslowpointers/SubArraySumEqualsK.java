package code_patterns.fastandslowpointers;

import java.util.HashMap;
import java.util.Map;

public class SubArraySumEqualsK {
    public static void main(String[] args) {
        int [] arr = {1,2,-3,3};
        int target = 3;
        System.out.println(subArraySum(arr,target));

    }
    public static int subArraySum(int[] nums, int target) {
        Map<Integer,Integer>mapOfNums = new HashMap<>();
        mapOfNums.put(0,1);
        int total = 0;
        int subTotal = 0;
        for(int val : nums){
            subTotal += val;
            int diff = subTotal - target;
            if(mapOfNums.containsKey(diff)){
                total+=mapOfNums.get(diff);
            }
            mapOfNums.put(subTotal,mapOfNums.getOrDefault(subTotal,0)+1);
        }
        return total;
    }
}
