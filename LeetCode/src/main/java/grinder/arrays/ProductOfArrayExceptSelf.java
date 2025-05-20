package grinder.arrays;

public class ProductOfArrayExceptSelf {
    public static void main(String[] args) {

    }

    public static int[] productExceptSelf(int[] nums) {
        int[]preAndPost = new int[nums.length];
        int counter = 1;
        for (int index = 0; index < nums.length; index++){
            preAndPost[index] = counter;
            counter*=nums[index];
        }

        counter = 1;

        for (int index = nums.length-1; index >=0; index--){
            preAndPost[index] *= counter;
            counter*=nums[index];
        }

        return preAndPost;
    }

}
