/*
Given an integer array nums, move all 0's to the end of it while maintaining
the relative order of the non-zero elements.

Note that you must do this in-place without making a copy of the array.
 */

package comp_p.fantasic;

import java.util.Arrays;

public class MoveZeroes {
    public static void moveZeroes(int[] nums) {
        int leftIndex = 0;
        for ( int rightIndex = 0; rightIndex < nums.length; rightIndex++){
            if (nums[rightIndex]!=0){
                if (leftIndex < rightIndex){
                    nums[leftIndex]=nums[rightIndex];
                    nums[rightIndex] =0;
                }
                leftIndex++;
            }
        }
    }
    public static void main(String[] args) {
        //int[]nums = {73348,66106,-85359,53996,18849,-6590,-53381,-86613,-41065,83457,0};
        //int[]nums = {1,0,1};
        int[]nums = {0,1,0,3,12};
        moveZeroes(nums);
        System.out.println(Arrays.toString(nums));
    }
}
