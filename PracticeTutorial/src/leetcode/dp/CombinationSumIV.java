package leetcode.dp;

public class CombinationSumIV {
    public static void main(String[] args) {
        int [] nums = new int[] {3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20,21,22,23,24,25};
        int target = 1;
        System.out.println(combinationSum4(nums,target));
    }

    public static int combinationSum4(int[] nums, int target) {
        int [] dp = new int[target+1];
        dp[0]= 1;
        for (int i = 0; i <= target; i++){
            if(dp[i] == 0){
                continue;
            }
            for(int num : nums){
                if(i+num <= target){
                    dp[i+num]+=dp[i];
                }
            }
        }
        return dp[dp.length-1];
    }
}
