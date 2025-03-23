package leetcode.arrays;

import java.util.Arrays;

public class Sorted {
    public static void main(String[] args) {
        int [] array = {-4,-1,2,3,10};
        System.out.println("sortedSquares(array) = " + Arrays.toString(sortedSquares(array)));
    }

    public static int[] sortedSquares(int[] nums) {
        int [] result = new int[nums.length];
        int startIndex = 0;
        int endIndex = nums.length-1;
        int counter = nums.length;
        while (startIndex<=endIndex){
            if(Math.abs(nums[startIndex]) > Math.abs(nums[endIndex])){
                result[counter-1] = (nums[startIndex]*nums[startIndex]);
                startIndex++;
            }else {
                result[counter-1] = (nums[endIndex]*nums[endIndex]);
                endIndex--;
            }
            counter--;
        }
        return result;
    }
}
