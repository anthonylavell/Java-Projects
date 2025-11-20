package arraysandstrings.array;

import java.util.Arrays;

public class PartitionEqualSubsetSum {
    public static boolean canPartition(int[] nums) {
       int total = Arrays.stream(nums).sum();
       if (total%2==1){
           return false;
       }
       int target = total/2;
       boolean[]dp = new boolean[target+1];
       dp[0]=true;
       for (int num : nums){
           for (int index = target; index>=num; index--){
               if (dp[index-num]){
                   dp[index] = true;
               }
           }
       }
       return dp[target];
    }
    public static void main(String[] args) {
        //int[] nums = {1,5,11,5};
        //int[] nums = {4,4,4,4,8,8};
        //int[] nums = {1,2,3,5};
        //int[] nums = {3,3,3,4,5};
        //int[] nums = {1,2,3,4,5,6,7};
        int[] nums = {2,2,1,1};
        System.out.println(canPartition(nums));
    }

}
