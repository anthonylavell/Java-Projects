package arraysandstrings.array;

import java.util.Arrays;

public class ProductOfArrayExceptSelf {

    public static int[] productExceptSelf(int[] nums) {
        int [] products = new int[nums.length];
        Arrays.fill(products,1);
        //prefix
        int count = 1;
        for(int i = 0; i < products.length; i++){
            products[i] = count;
            count*=nums[i];
        }
        //postFix
        count=1;
        for(int i = nums.length-1; i >=0; i--){
            products[i] = products[i] * count;
            count*=nums[i];
        }
        return products;

    }

    public static void main(String[] args) {
        int [] arr = {1,2,3,4};
        System.out.println(Arrays.toString(productExceptSelf(arr)));
    }
}
