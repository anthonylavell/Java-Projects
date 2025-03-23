package leetcode.arrays;

import java.util.Arrays;

public class RotateArray {
    public static void main(String[] args) {
        int [] nums = {1,2,3,4,5,6,7};
        int [] nums2 = {-1,-100,3,99};
        int [] nums3 = {-1};
        int [] nums4 = {1,2,3};
        int i = 5%2;
        int i2 = 2%5;
        int i3 = 5/2;
        int i4 = 2/5;

        i = 6%3;
        i2 = 3%6;
        i3 = 6/3;
        i4 = 3/6;
        /*System.out.println("nums = " + Arrays.toString(nums));
        int [] tempArray = Arrays.copyOfRange(nums,0,nums.length-1);
        tempArray[0] = 7;
        System.out.println("tempArray = " + Arrays.toString(tempArray));
        nums=tempArray;
        System.out.println("nums = " + Arrays.toString(nums));*/
        int k = 3;
        rotate(nums,k);
        System.out.println("nums = " + Arrays.toString(nums2));

    }
    public static void rotate(int[] nums, int k){
        k = k%nums.length;
        int index = nums.length-k;
        int[] tempArray = Arrays.copyOf(nums,nums.length);
        System.arraycopy(tempArray,index,nums,0,k);
        System.arraycopy(tempArray,0,nums,k,index);
    }
}
