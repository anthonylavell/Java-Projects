package leetcode.arrays;

import java.util.Arrays;

public class SumTwo {
    public static void main(String[] args) {
        int [] nums = {2,7,11,15};
        int target = 9;
        System.out.println(Arrays.toString(twoSum(nums,target)));
    }
    public static int[] twoSum(int[] numbers, int target) {
        int endIndex = numbers.length-1;
        int startIndex = 0;
        while (startIndex <= endIndex) {
            if((target-numbers[startIndex]) == numbers[endIndex]){
                return new int[]{startIndex+1,endIndex+1};
            }else if((target-numbers[startIndex])> numbers[endIndex]){
                startIndex++;
            }else {
                endIndex--;
            }

        }
        return null;
    }
}
