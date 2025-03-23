package leetcode.stack.main;

import leetcode.stack.MinStack;

public class MinStackMain {
    public static void main(String[] args) {
             MinStack stack = new MinStack();
            int[] nums = {-2,0,1,-3};
            for(int num : nums){
                stack.push(num);
            }
            stack.pop();
        System.out.println(stack.getMin());
            stack.pop();
        System.out.println(stack.getMin());
        stack.push(-4);
        System.out.println(stack.getMin());

    }
}
