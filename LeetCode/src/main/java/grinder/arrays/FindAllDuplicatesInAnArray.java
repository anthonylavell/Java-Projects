/*
Given an integer array nums of length n where all the
integers of nums are in the range [1, n] and each integer
appears once or twice, return an array of all the integers
that appears twice.

You must write an algorithm that runs in O(n) time and uses
only constant auxiliary space, excluding the space needed to
store the output
 */

package grinder.arrays;

import java.util.ArrayList;
import java.util.List;

public class FindAllDuplicatesInAnArray {
    public static void main(String[] args) {
        int [] nums = {4,3,2,7,8,2,3,1};
        List<Integer> listOfInts = findDuplicates(nums);
        System.out.println(listOfInts);
    }

    public static List<Integer> findDuplicates(int[] nums) {
        List<Integer> listOfInt = new ArrayList<>();
        int[] tempArray = new int[nums.length+1];
        for(int num : nums){
            tempArray[num]++;
        }

        for(int count = 1; count<tempArray.length; count++){
            if(tempArray[count] > 1){
                listOfInt.add(count);
            }
        }
        return listOfInt;
    }
}
