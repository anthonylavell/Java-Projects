package array;

import java.util.Arrays;

public class MoveZeroes {
    public static void main(String[] args) {
        int [] nums = new int [] {1,2,0,3,0,4,5};
        movingZeroes(nums);
        System.out.println(Arrays.toString(nums));
    }
    public static void movingZeroes(int [] nums){
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
