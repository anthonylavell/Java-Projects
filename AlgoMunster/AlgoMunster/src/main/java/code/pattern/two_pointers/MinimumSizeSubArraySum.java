package code.pattern.two_pointers;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MinimumSizeSubArraySum {
    public static void main(String[] args) {
        List<Integer> nums = new ArrayList<>(Arrays.asList(2,3,1,2,4,3));
        int target = 7;
        System.out.println(minSubArrayLen(target,nums));
    }
    public static int minSubArrayLen(int target, List<Integer> nums) {
        int leftIndx = 0;
        int sum = Integer.MAX_VALUE;
        int subTotal = 0;
        for(int rightIndx = 0; rightIndx < nums.size(); rightIndx++){
            subTotal+=nums.get(rightIndx);
            while (subTotal >= target){
                sum = Math.min(sum,(rightIndx-leftIndx)+1);
                subTotal-=nums.get(leftIndx++);
            }
        }
        return (sum == Integer.MAX_VALUE) ? 0 : sum;
    }
}
