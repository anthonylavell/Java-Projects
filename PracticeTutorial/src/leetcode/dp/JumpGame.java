package leetcode.dp;

public class JumpGame {
    public static void main(String[] args) {
        int [] nums = {2,3,1,1,4};
        int [] nums2 = {2,3,0,0,1,10};
        int [] nums3 = {1,0,3,1,5};
        System.out.println(canJump(nums3));
    }
    public static boolean canJump(int[] nums) {
        boolean [] dp = new boolean[nums.length];
        int current = nums.length -1;
        dp[current] = true;
        for(int i = current-1; i >=0; i--){
            if(nums[i]+i >= current){
                dp[i] = true;
                current=i;
            }
        }
       int x = 0;
        return dp[0];
    }
}
