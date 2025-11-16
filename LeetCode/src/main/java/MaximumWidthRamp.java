import java.util.Stack;

public class MaximumWidthRamp {
    public static int maxWidthRamp(int[] nums) {
        int maxRamp = 0;
        int numLen = nums.length;
        Stack<Integer> stack = new Stack<>();
        for (int index = numLen-1; index >=0; index--){
            if (index==numLen-1 || nums[stack.peek()] < nums[index]){
                stack.add(index);
            }
        }
        for (int index = 0; index < numLen && !stack.isEmpty(); index++){
            while (!stack.isEmpty()&&nums[stack.peek()] >= nums[index]){
                int right = stack.pop();
                maxRamp = Math.max(maxRamp,(right-index));
            }
        }
        return maxRamp;
    }

    public static void main(String[] args) {
        int [] nums = {9,8,1,0,1,9,4,0,4,1};
        System.out.println(maxWidthRamp(nums));
    }
}
