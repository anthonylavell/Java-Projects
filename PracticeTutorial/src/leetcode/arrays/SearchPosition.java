package leetcode.arrays;

public class SearchPosition {
    public static void main(String[] args) {
        int [] nums = {1,3,4,5,7};
        int target = 0;
        searchInsert(nums,target);
    }
    public static int searchInsert(int[] nums, int target) {
        int startIndex = 0;
        int endIndex = nums.length-1;
        while (startIndex<=endIndex){
            int foundIndex = (endIndex+startIndex)/2;
            if(nums[foundIndex]== target){
                return foundIndex;
            }else if(nums[foundIndex]> target){
                endIndex = foundIndex-1;
            }else {
                startIndex = foundIndex+1;
            }
        }
        return startIndex;
    }
}
