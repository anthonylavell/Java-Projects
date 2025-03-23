package code_patterns.fastandslowpointers.prefix_sum;

import java.util.Arrays;

public class ProductOfArrayExceptSelf {
    public static void main(String[] args) {
        int [] nums = {-1,1,0,-3,3};
        System.out.println(Arrays.toString(productExceptSelf(nums)));
    }

    public static int[] productExceptSelf(int[] nums) {
        int [] subTotal = new int[nums.length];
        Arrays.fill(subTotal,1);
        int count = 1;
        //PreFix
        for(int index = 0; index < nums.length; index++){
            subTotal[index] *= count;
            count*=nums[index];
        }

        count = 1;
        //Suffix
        for(int index = nums.length-1; index >= 0 ; index--){
            subTotal[index] *= count;
            count*=nums[index];
        }
        return subTotal;
    }
}
