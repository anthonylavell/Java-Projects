package code.pattern.two_pointers;

import java.util.List;

public class SubArraySumLongest {
    public static int subArraySumLongest(List<Integer> nums, int target) {
        // WRITE YOUR BRILLIANT CODE HERE
        int leftIndex = 0;
        int total = 0;
        int subTotal = 0;
        for (int rightIndex = 0; rightIndex < nums.size(); rightIndex++){
            subTotal+=nums.get(rightIndex);
            if(subTotal <= target){
                total = Math.max(((rightIndex-leftIndex) + 1),total);
                continue;
            }
            subTotal-=nums.get(leftIndex++);
        }
        return total;
    }
}
