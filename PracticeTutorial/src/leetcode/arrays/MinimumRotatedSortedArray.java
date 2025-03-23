package leetcode.arrays;

public class MinimumRotatedSortedArray {
    public static void main(String[] args) {
        int [] nums = {3,4,5,1,2};
        System.out.println(findMin(nums));
    }
    public static int findMin(int[] nums) {
        int minNum = Integer.MAX_VALUE;
        int startIndex = 0;
        int endIndex = nums.length-1;
        while (startIndex<=endIndex){
            if(startIndex==endIndex){
                if(nums[startIndex] < minNum) {
                    minNum = nums[startIndex];
                }
            }else {
                if (nums[startIndex] < minNum) {
                    minNum = nums[startIndex];
                }
                if (nums[endIndex] < minNum) {
                    minNum = nums[endIndex];
                }
            }
            startIndex++;
            endIndex--;
        }
        return minNum;

    }
}
