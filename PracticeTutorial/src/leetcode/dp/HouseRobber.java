package leetcode.dp;

public class HouseRobber {
    public static int val = 0;
    public static void main(String[] args) {
        int [] nums = {1,2,3,1};
        int [] nums2 = {2,7,9,3,1};
        int [] nums3 = {5,7,6,8,4,1};
        int [] nums4 = {0};
        int [] nums5 = {1,1};
        int [] nums6 = {5,7,10,8,6};
        System.out.println(rob(nums6));
    }
    public static int rob(int[] nums) {
        int [] dp = new int[nums.length];
        int total = 0;
        for(int i =0; i < nums.length; i++){
            if(nums[i]>dp[i]){
                dp[i] = nums[i];
            }

            if(i+2<nums.length){
                dp[i+2]=Math.max(dp[i+2],(dp[i]+nums[i+2]) );
            }
            if(i+3<nums.length){
                dp[i+3]=Math.max(dp[i+3],(dp[i]+nums[i+3]) );
            }
        }
        return (dp.length> 1 && dp[dp.length-2] > dp[dp.length-1]) ? dp[dp.length-2] : dp[dp.length-1];
    }

}
