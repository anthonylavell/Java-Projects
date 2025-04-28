package grinder.dp;

public class ClimbingStairs {
    public static void main(String[] args) {
        System.out.println(climbStairs(45));
    }

    public static int climbStairs(int n) {
        int [] nums = {0,1};
        while (n-- >1){
            int total = nums[0] + nums[1];
            nums[0] = nums[1];
            nums[1] = total;
        }
        return nums[nums.length-1];
    }


}
