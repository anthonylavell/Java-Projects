/*
Given an integer array nums of length n and an integer target,
find three integers in nums such that the sum is closest to target.
Return the sum of the three integers.
You may assume that each input would have exactly one solution.
* */
package code_patterns.two_pointers;

import java.util.Arrays;

public class ThreeSumCloset {
    public static void main(String[] args) {
       int [] nums = {-1,2,1,-4};
       int target = 1;
        System.out.println(threeSumClosest(nums,target));
    }

    public static int threeSumClosest(int[] nums, int target) {
        Arrays.sort(nums);
        int minNum = Integer.MAX_VALUE;
        for(int curIndex = 0; curIndex < nums.length-2; curIndex++){
            if(curIndex == 0 || nums[curIndex] != nums[curIndex-1]){
                int leftIndex = curIndex+1;
                int rightIndex = nums.length-1;
                if((nums[curIndex] + nums[leftIndex] + nums[rightIndex]) == target){
                    return target;
                }
                while (leftIndex < rightIndex){
                    int subTotal = nums[curIndex] + nums[leftIndex] + nums[rightIndex];
                    if(subTotal == target){
                        return target;
                    }
                    minNum = (Math.abs(subTotal-target)< Math.abs(minNum-target)) ? subTotal : minNum;
                    if(subTotal < target){
                        leftIndex++;
                    }else {
                        rightIndex--;
                    }
                }
            }
        }
        return minNum;
    }
}
