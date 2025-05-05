package grinder.arrays;

public class MaximumSubArray {
    public static void main(String[] args) {

    }
    public static int maxSubArray(int[] nums) {
        int total = nums[0];
        int subTotal = total;
        for (int index = 1; index < nums.length; index++){
            subTotal = Math.max((subTotal+nums[index]),nums[index]);
            total = Math.max(total,subTotal);
        }
        return total;
    }

}
