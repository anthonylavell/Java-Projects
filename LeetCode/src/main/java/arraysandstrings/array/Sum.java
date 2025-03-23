package arraysandstrings.array;

import java.util.*;

public class Sum {
    public static void main(String[] args) {
        int [] nums = {-1,2,1,-4};
        int target = 1;
        System.out.println(threeSumClosest(nums,target));
    }

    /*
    Given an integer array nums, return all the triplets [nums[i], nums[j], nums[k]] such that i != j, i != k, and j != k, and nums[i] + nums[j] + nums[k] == 0.
    Notice that the solution set must not contain duplicate triplets.
     */
    public List<List<Integer>> threeSum(int[] nums) {
        Arrays.sort(nums);
        List<List<Integer>> listOfZero = new ArrayList<>();
        for(int firstIndex = 0; firstIndex < nums.length-2; firstIndex++) {
            if(nums[firstIndex] > 0){
                break;
            }
            if (firstIndex == 0 || nums[firstIndex] != nums[firstIndex - 1]) {
                int secondIndex = firstIndex+1;
                int lastIndex = nums.length-1;
                while (secondIndex < lastIndex) {
                    int subTotal = (nums[firstIndex] + nums[secondIndex]);
                    if ((Math.abs(subTotal) >= nums[lastIndex])) {
                        if (nums[lastIndex] + subTotal == 0) {
                            listOfZero.add(new ArrayList<>(Arrays.asList(nums[firstIndex], nums[secondIndex], nums[lastIndex])));
                        }
                        while (nums[++secondIndex] == nums[secondIndex - 1]) {
                            if (secondIndex >= lastIndex) {
                                break;
                            }
                        }
                    } else {
                        while (nums[--lastIndex] == nums[lastIndex + 1]) {
                            if (secondIndex >= lastIndex) {
                                break;
                            }
                        }
                    }
                }
            }
        }
        return listOfZero;
    }

/*
    Given an array of integers, return indices of the two numbers such that they add up to a specific target.
    You may assume that each input would have exactly one solution, and you may not use the same element twice.
    Given nums = [2, 7, 11, 15], target = 9,
    Because nums[0] + nums[1] = 2 + 7 = 9,
    return [0, 1].
 */
    public static int[] twoSum(int[] nums, int target) {
        Map<Integer,Integer> keepTrackMap = new HashMap<>();
        for(int count = 0; count < nums.length; count++){
            if(keepTrackMap.containsKey(nums[count])){
                return new int[] {keepTrackMap.get(nums[count]),count};
            }
            keepTrackMap.put((target-nums[count]),count);
        }
            return null;
    }

/*
Given an integer array nums of length n and an integer target, find three integers in nums such that the sum is closest to target.
Return the sum of the three integers.
You may assume that each input would have exactly one solution.
*/
    public static int threeSumClosest(int[] nums, int target) {
        Arrays.sort(nums);
        int minNum = nums[0]+nums[1]+nums[2];
        for(int i = 0; i < nums.length-2;i++) {
            int leftIndex = i+1;
            int rightIndex = nums.length-1;
            while (leftIndex < rightIndex) {
                int subTotal = nums[i] + nums[leftIndex] + nums[rightIndex];
                if (rightIndex > 1) {
                    if (Math.abs(target - minNum) > Math.abs(target - subTotal)) {
                        minNum = subTotal;
                    }
                }
                if (subTotal > target) {
                    rightIndex--;
                } else {
                    leftIndex++;
                }
            }
        }
        return minNum;

    }

}
