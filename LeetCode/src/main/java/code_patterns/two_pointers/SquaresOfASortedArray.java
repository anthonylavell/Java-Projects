/*
Given an integer array nums sorted in non-decreasing order,
return an array of the squares of each number sorted in non-decreasing order.
 */
package code_patterns.two_pointers;

import java.util.Arrays;

public class SquaresOfASortedArray {
    public static void main(String[] args) {
        int [] numbers = {-5,-3,-2,-1};
        System.out.println(Arrays.toString(SquaresOfASortedArray.sortedSquares(numbers)));
    }

    public static int[] sortedSquares(int[] nums) {
        int leftIndex = 0;
        int rightIndex = nums.length-1;
        int [] sortedArray = new int[nums.length];

        while (rightIndex>=leftIndex){
            int leftIndexSquared = (nums[leftIndex]*nums[leftIndex]);
            int rightIndexSquared = (nums[rightIndex]*nums[rightIndex]);
            if(leftIndexSquared < rightIndexSquared) {
               sortedArray[rightIndex-leftIndex] = rightIndexSquared;
                rightIndex--;
            }else {
                sortedArray[rightIndex-leftIndex] = leftIndexSquared;
                leftIndex++;
            }
        }
        return sortedArray;
    }
}
