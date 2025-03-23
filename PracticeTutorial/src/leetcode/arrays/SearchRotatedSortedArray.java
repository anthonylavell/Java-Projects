package leetcode.arrays;

public class SearchRotatedSortedArray {
    public static void main(String[] args) {
        int [] nums = {4, 5, 6, 7, 0, 1, 2};
        int target = 0;
        System.out.println(search(nums,target));
    }
    public static int search(int[] nums, int target) {
        int startIndex = 0;
        int endIndex = nums.length-1;
        while (startIndex<=endIndex){
            if(nums[startIndex]==target){
                return startIndex;
            }else if(nums[endIndex] == target){
                return endIndex;
            }
            startIndex++;
            endIndex--;
        }
        return -1;
    }
}
