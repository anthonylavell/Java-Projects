package comp_p.pay_pal;

import java.util.Stack;

public class MaximumLengthOfSemiDecreasingSubArrays {
    public static int maxSubArrayLength(int[] nums) {
        int numsLen = nums.length;

        // 1) Build a stack of indices i where nums[i] form a strictly increasing sequence
        Stack<Integer> stack = new Stack<>();
        for (int index = 0; index < numsLen; index++) {
            if (stack.isEmpty() || nums[index] > nums[stack.peek()]) {
                stack.push(index);
            }
        }

        // 2) Scan from right to left and try to match each j with earliest possible i
        int maxLen = 0;
        for (int right = numsLen - 1; right >= 0; right--) {
            while (!stack.isEmpty() && nums[stack.peek()] > nums[right]) {
                int left = stack.pop();
                maxLen = Math.max(maxLen, right - left + 1);
            }
        }

        return maxLen;
    }

    public static void main(String[] args) {
        int[] nums = {7,6,5,4,3,2,1,6,10,11};
        System.out.println(maxSubArrayLength(nums));
    }
}