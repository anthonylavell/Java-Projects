package leetcode.arrays;

import java.util.Arrays;

public class SquaresArray {
    public static void main(String[] args) {
        int [] nums = {-4,-1,0,3,10};
        System.out.println(Arrays.toString(sortedSquares(nums)));
    }

    public static int[] sortedSquares(int[] nums) {
        int [] resultArr = new int[nums.length];
        int startIndex = 0;
        int endIndex = nums.length-1;
        while (startIndex<=endIndex){
            int startIndexSquared = (nums[startIndex]*nums[startIndex]);
            int endIndexSquared = (nums[endIndex]*nums[endIndex]);
            if( startIndexSquared > endIndexSquared){
                resultArr[(endIndex-startIndex)] = startIndexSquared;
                startIndex++;
            }else {
                resultArr[(endIndex-startIndex)] = endIndexSquared;
                endIndex--;
            }
        }
        return resultArr;
    }
}
