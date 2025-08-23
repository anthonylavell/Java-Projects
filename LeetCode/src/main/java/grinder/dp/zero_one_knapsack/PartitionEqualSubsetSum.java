/*
Given an integer array nums, return true if you can partition the
array into two subsets such that the sum of the elements in both
subsets is equal or false otherwise.
Example 1:

Input: nums = [1,5,11,5]
Output: true
Explanation: The array can be partitioned as [1, 5, 5] and [11].
Example 2:

Input: nums = [1,2,3,5]
Output: false
Explanation: The array cannot be partitioned into equal sum subsets.
*/


package grinder.dp.zero_one_knapsack;

public class PartitionEqualSubsetSum{
    public static void main(String[] args) {
        int [] nums = {1,5,11,5};
        int [] nums2 = {2,2,1,1};
        int [] nums3 = {2,2,3,5};
        int [] nums4 = {100,4,6};
        System.out.println(canPartition(nums3));


    }

    public static boolean canPartition(int[] nums) {
        int sum = 0;
        for (int num:nums){
            sum+=num;
        }
        if (sum%2==1){
            return false;
        }
        sum/=2;
        boolean[][]dp2 = new boolean[nums.length][sum+1];
        for (int row = 0; row < nums.length; row++){
            int num = nums[row];
            if (row==0){
                dp2[row][0] = true;
                if(num < dp2[row].length)
                    dp2[row][num] = true;
                continue;
            }
            int tempRow = row-1;
            for (int col = 0; col < dp2[row].length; col++){
                if (col==0){
                    dp2[row][col] = true;
                    continue;
                }
                dp2[row][col] = (num > col) ? dp2[tempRow][col] : dp2[tempRow][col] || dp2[tempRow][col-num];
            }
        }
        return dp2[nums.length-1][sum];
    }
}

