package grinder.arrays;

import java.util.Arrays;

public class ProductOfArrayExceptSelf {
    public static void main(String[] args) {
        int[] nums = {1,2,3,4};
        System.out.println(Arrays.toString(productExceptSelf(nums)));
    }

    public static int[] productExceptSelf(int[] nums) {
        int count = 1;
        int[] product = new int[nums.length];
        Arrays.fill(product,1);
        //preFix
        for (int index = 0; index < nums.length; index++){
            product[index]*= count;
            count*=nums[index];
        }

        count =1;
        //postFix
        for (int index = nums.length-1; index >=0; index--){
            product[index]*= count;
            count*=nums[index];
        }
        return product;
    }

}
