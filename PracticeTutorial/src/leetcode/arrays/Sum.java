package leetcode.arrays;

import java.util.Arrays;

public class Sum {
    public static void main(String[] args) {
        int [] nums = {2,7,11,15};
        int target = 9;
    }
    public static int [] TwoSum(int[] nums, int target){
        Arrays.sort(nums);
        int [] totalArray = new int[2];
        int startIndex = 0;
        int endIndex = nums.length-1;
        while (startIndex<endIndex){
            if(startIndex!=0 && nums[startIndex] == nums[startIndex-1]){
                startIndex++;
                continue;
            }
            if(endIndex!=nums.length-1 && nums[endIndex] == nums[endIndex+1]){
                endIndex--;
                continue;
            }
            if(nums[startIndex]+nums[endIndex] == target){
                totalArray[0] = startIndex;
                totalArray[1] = endIndex;
            }else if(nums[startIndex]+nums[endIndex]>target){
                endIndex--;
            }else {
                startIndex++;
            }
        }
       return totalArray;
    }
}
