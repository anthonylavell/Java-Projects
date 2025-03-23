package arraysandstrings.array;

import java.util.Arrays;

public class ProductOfArrayExceptSelf {
    public static void main(String[] args) {
        int [] arr = {1,2,3,4};
        System.out.println(Arrays.toString(productExceptSelf(arr)));
    }

    public static int[] productExceptSelf(int[] nums) {
        int [] totalArray = new int[nums.length];
        int count = 1;
        for(int i = 0; i < totalArray.length; i++){
            totalArray[i] = count;
            count*=nums[i];
        }
        count=1;

        for(int i = nums.length-1; i >=0; i--){
            totalArray[i] = totalArray[i] * count;
            count*=nums[i];
        }
        return totalArray;

    }
}
