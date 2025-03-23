package leetcode.arrays;

import java.util.Arrays;

public class TwoSum {
    public static void main(String[] args) {
       int [] nums = new int [] {2,7,11,15};
       int target = 9;
        System.out.println(Arrays.toString(twoSum(nums,target)));
    }
    public static int[] twoSum(int[] nums, int target) {
       int startIndex = 0;
       int endIndex = nums.length-1;
      while (startIndex<endIndex){
           if((target-nums[startIndex])== nums[endIndex]){
               return new int[]{startIndex+1,endIndex+1};
           }else if((target-nums[startIndex]) > nums[endIndex]){
               startIndex++;
           }else {
               endIndex--;
           }
       }
       return null;
    }
}
