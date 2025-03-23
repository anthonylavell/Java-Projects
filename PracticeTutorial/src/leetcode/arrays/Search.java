package leetcode.arrays;

public class Search {
    public static void main(String[] args) {
        int [] nums = {-1,0,3,5,9,12};
        int target = 9;
        binarySearch(nums,target);
    }
    public static int binarySearch(int[] nums, int target){
        int startIndex = 0;
        int endIndex = nums.length-1;
        while (startIndex<=endIndex){
            int foundIndex = (endIndex+startIndex)/2;
            if(nums[foundIndex]== target){
                return foundIndex;
            }else if(nums[foundIndex]>target){
                    endIndex= foundIndex-1;
            }else {
                    startIndex = foundIndex+1;
            }
        }
        return -1;
    }

}
