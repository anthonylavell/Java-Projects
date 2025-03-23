package binarysearch;
/*
Given an array of integers nums which is sorted in ascending order, and an integer target, write a function to search target in nums. If target exists, then return its index. Otherwise, return -1.
You must write an algorithm with O(log n) runtime complexity.
*/

public class Binary {
    public static void main(String[] args) {
        //int [] nums = new int [] {-3,-1,0,1,2,4,5,7,9,11,12};
        //int [] nums = new int [] {-1,0,3,5,9,12};
        //int target = 2;
        //int [] nums = new int [] {-1,0,1,2,3,4,5,9,12,14,16};
        //int target = 9;
        //int [] nums = new int [] {-4,-1,0,3,10};
        //int target = 3;
        int [] nums = new int [] {1,3,5,6};
        int target = 4;
        System.out.println(searchInsert(nums,target));
    }
    public static int search(int[] nums, int target) {
        int startIndex = 0;
        int endIndex = nums.length-1;
        while (startIndex <= endIndex){
            int middleIndex = startIndex+((endIndex-startIndex)/2);
            if(nums[middleIndex] == target){
                return middleIndex;
            }
            if(nums[middleIndex]>target){
                endIndex = middleIndex-1;
            }else {
                startIndex = (middleIndex+1);
            }
        }
        return -1;
    }
    public static int searchInsert(int[] nums, int target) {
        int startIndex = 0;
        int endIndex = nums.length-1;
        int middleIndex = 0;
        while (startIndex<=endIndex){
            middleIndex = startIndex + (endIndex-startIndex)/2;
            if(nums[middleIndex]==target){
                return middleIndex;
            }
            if(nums[middleIndex]>target){
                endIndex=middleIndex-1;
            }else {
                startIndex=middleIndex+1;
            }
        }
        return (target>nums[middleIndex])?middleIndex+1:middleIndex;

    }
}
