package leetcode.dp;

public class HouseRobberII {
    public static void main(String[] args) {
        int [] nums = {2,3,2};
        int [] nums2 = {1,2,3,1};
        int [] nums3 = {1,2,3};
        int [] nums4 = {0};
        int [] nums5 = {1,1};
        int [] nums6 = {5,7,6,8,4,1};
        int [] nums7 = {1,2,1,1};
        int [] nums8 = {2,1,1,2};
        int [] nums9 = {1,3,1,3,100};
        int [] nums10 = {4,1,2,7,5,3,1};
        int [] nums11 = {5,7,10,8,6};
        int [] nums12 = {6,3,10,8,2,10,3,5,10,5,3};

        System.out.println(rob(nums9));
    }
    public static int rob(int[] nums) {
        int total = 0;
        for(int i = 0; i < nums.length; i++){
           total = Math.max(helpRob(nums,i),total);
        }
        return total;
    }
    private static int helpRob(int [] nums, int num){
        int total = 0;
        int [] dp = new int[nums.length];
        for(int i =num; i < nums.length; i++){
            if(nums[i]>dp[i]){
                dp[i] = nums[i];
            }
            total = Math.max(total,dp[i]);
            if (num == 0 && i+2 == nums.length-1){
                break;
            }
            if(i+2<nums.length){
                dp[i+2]=Math.max(dp[i+2],(dp[i]+nums[i+2]) );
                total = Math.max(total,dp[i+2]);
            }
            if (num == 0 && i+3 == nums.length-1){
                break;
            }
            if(i+3<nums.length){
                dp[i+3]=Math.max(dp[i+3],(dp[i]+nums[i+3]) );
                total = Math.max(total,dp[i+3]);
            }

            if(i == num){
                i++;
            }
        }
        return total;
    }

}
