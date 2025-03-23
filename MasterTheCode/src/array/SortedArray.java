package array;

import java.util.Arrays;

public class SortedArray {
    public static void main(String[] args) {
        int [] nums = new int [] {-4,-1,2,3,10};
        //int [] nums = new int [] {-5,-3,-2,-1};//[-11,-7,-3,2,3]
        System.out.println(Arrays.toString(sortedSquares(nums)));
    }
    public static int[] sortedSquares(int[] nums) {
        int startIndex = 0;
        int endIndex = nums.length-1;
        int [] tempArray = new int [nums.length];
        while (startIndex<=endIndex){
            if((nums[startIndex]*nums[startIndex])< (nums[endIndex]*nums[endIndex])){
                tempArray[(endIndex-startIndex)] = (nums[endIndex]*nums[endIndex]);
                endIndex--;
            }else{
                tempArray[(endIndex-startIndex)] = (nums[startIndex]*nums[startIndex]);
                startIndex++;
            }
        }
        return tempArray;
    }
}
