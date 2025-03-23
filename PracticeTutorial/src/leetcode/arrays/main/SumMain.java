package leetcode.arrays.main;

import leetcode.arrays.Sum;

import java.util.Arrays;

public class SumMain {
    public static void main(String[] args) {
        int[] nums = {2,11, 7,15};
        int target = 9;
        System.out.println(Arrays.toString(Sum.TwoSum(nums,target) ));
    }
}
