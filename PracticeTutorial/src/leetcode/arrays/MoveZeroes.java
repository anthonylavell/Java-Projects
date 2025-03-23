package leetcode.arrays;

public class MoveZeroes {
    public static void main(String[] args) {
        int [] nums = {0,1,0,3,12};
        int [] nums2 = {1,1,0,3,12,0};
        int [] nums3 = {0};
        int [] nums6 = {0,1,0,3,12};
        moveZeroes(nums6);
    }

    public static void moveZeroes(int[] nums) {
        int zeroIndex = 0;
        for(int i = 0; i < nums.length; i++){
            if(nums[i] != 0){
                if(nums[zeroIndex] == 0){
                    nums[zeroIndex] = nums[i];
                    nums[i] = 0;
                }
                zeroIndex++;
            }
        }
        int i = 0;
    }
}
