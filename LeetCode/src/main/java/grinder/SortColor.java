package grinder;

import java.util.Arrays;

public class SortColor {
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

    public static void sortColors2(int[] nums) {
        int low = 0;
        int mid = 0;
        int high = nums.length-1;
        while (mid <= high){
            if (nums[mid] == 0){
                swap(nums,low,mid);
                low++;
                mid++;
            } else if (nums[mid] == 1) {
                mid++;
            }else {
                swap(nums,mid,high);
                high--;
            }
        }

    }

    private static void swap(int[]nums, int low, int mid){
        int temp = nums[low];
        nums[low]=nums[mid];
        nums[mid]=temp;
    }
    public static void main(String[] args) {
        int [] nums = {2,0,2,1,1,0};
        System.out.println(Arrays.toString(nums));
        sortColors2(nums);
        System.out.println(Arrays.toString(nums));
    }
}
