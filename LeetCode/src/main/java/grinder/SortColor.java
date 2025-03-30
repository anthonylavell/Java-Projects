package grinder;

import java.util.Arrays;

public class SortColor {
    public static void main(String[] args) {
        int [] nums = {2,0,2,1,1,0};
        System.out.println(Arrays.toString(nums));
        sortColors(nums);
        System.out.println(Arrays.toString(nums));
    }

    public static void sortColors(int[] nums) {
        int zeros = 0;
        int ones = 0;
        for(int num : nums){
            if(num == 0){
                zeros++;
            }else if(num == 1){
                ones++;
            }
        }
        for (int index = 0; index < nums.length; index++){
            if(zeros-- > 0){
                nums[index] =0;
            } else if (ones-- > 0) {
                nums[index] = 1;
            }else {
                nums[index] = 2;
            }
        }
    }
}
