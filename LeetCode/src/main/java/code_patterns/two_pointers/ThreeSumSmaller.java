/*
Given an array of n integers nums and an integer target,
find the number of index triplets i, j, k with 0 <= i < j < k < n
that satisfy the condition nums[i] + nums[j] + nums[k] < target.
 */
package code_patterns.two_pointers;

import java.util.Arrays;

public class ThreeSumSmaller {
    public static void main(String[] args) {
        int [] nums = {1,-2,2,1,0};
        int target = 1;
        System.out.println(threeSumSmaller(nums,target));
    }
    public static int threeSumSmaller(int[] nums, int target) {
        if(nums.length < 3){
            return 0;
        }
        Arrays.sort(nums);
        int sum = 0;
        for(int counter = 0; counter < nums.length-2; counter++){
            int leftIndex = counter+1;
            if((nums[counter] + nums[leftIndex] + nums[leftIndex]) >= target)
                continue;
            while (leftIndex<nums.length-1){
                for (int rightIndex = leftIndex+1; rightIndex< nums.length; rightIndex++){
                    if( (nums[counter] + nums[rightIndex] + nums[leftIndex]) >= target){
                        break;
                    }
                    sum++;
                }
                leftIndex++;
            }
        }
        return sum;
    }

    public static int threeSumSmaller2(int[] nums, int target) {
        Arrays.sort(nums);
        int sum = 0;
        for (int i = 0; i < nums.length - 2; i++) {
            int left = i + 1, right = nums.length - 1;
            if (nums[i] + nums[left] + nums[left] >= target) continue;
            while (left < right) {
                if (nums[i] + nums[left] + nums[right] < target) {
                    sum += right - left;
                    left++;
                } else {
                    right--;
                }
            }
        }
        return sum;
    }
}
