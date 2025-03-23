package practice.array;

import java.util.Arrays;

public class MoveZeroes {
    public static void move(int [] nums){
        int index = -1;
        for(int i =0; i <nums.length; i++){
            if(nums[i] == 0 && index == -1){
                index = i;
            }else if(nums[i] != 0 && index !=-1){
                int temp = nums[i];
                nums[i] = nums[index];
                nums[index]= temp;
                index = (nums[index+1]==0) ? index+1 : i;
            }
        }
        System.out.println(Arrays.toString(nums));
    }
}
