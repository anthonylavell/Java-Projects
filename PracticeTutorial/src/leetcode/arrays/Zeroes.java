package leetcode.arrays;

import java.util.Arrays;

public class Zeroes {
    public static void main(String[] args) {
        //int [] nums = {1,0,0,1,2};
        //int [] nums = {0,0,0,0,2};
        int [] nums = {1,2,0,1,2};
        moveZeroes(nums);
        System.out.println("nums = " + Arrays.toString(nums));
    }
    public static void moveZeroes(int[] nums) {
        int index =0;
        for(int i = 0; i < nums.length; i++) {
            if(nums[i] !=0){
                if(index < i){
                    nums[index] = nums[i];
                    nums[i] = 0;
                }
                index++;
            }
        }

    }
}
