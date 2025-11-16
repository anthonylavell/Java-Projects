package comp_p.pay_pal;

import java.util.HashMap;
import java.util.Map;
import java.util.Stack;

public class MaximumLengthOfSemiDecreasingSubArrays {
    public static int maxSubArrayLength(int[] nums) {
        int maxLen = 0;
        int numLen = nums.length;
        Stack<Integer> stack = new Stack<>();
        for (int index = 0; index < numLen; index++){
            if (index == 0 || nums[stack.peek()] < nums[index]){
                stack.add(index);
            }
        }
        for (int right = numLen -1; right >= 0 && !stack.isEmpty(); right--){

            while (!stack.isEmpty() && nums[right]< nums[stack.peek()]){
                int index = stack.pop();
                maxLen = Math.max(maxLen,(right - index)+1);
            }
        }
        return maxLen;
    }

    public static void main(String[] args) {
        //int[] nums = {7,6,5,4,3,2,1,6,10,11};
        //System.out.println(maxSubArrayLength(nums));
        int[]val = {0};
        Map<String,int[]> map = new HashMap<>();
        map.put("h",val);
        System.out.println(map.get("h")[0]);
        val[0] = 4;
        System.out.println(map.get("h")[0]);
    }
}