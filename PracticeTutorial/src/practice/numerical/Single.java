package practice.numerical;

import java.util.Arrays;

public class Single {
    public static int singleNumber(int[] nums){
        Arrays.sort(nums);
        for(int i =0; i< nums.length; i++){
            if(i == nums.length-1){
                return nums[i];
            }
            if(nums[i]!= nums[++i]){
                return nums[--i];
            }
        }

        return -1;

    }
}
