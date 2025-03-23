package wayfair.dp;

public class MinSizeSubArraySum {
    public static void main(String[] args) {
        int target = 7;
        int[] nums = {2,3,1,2,4,3};
        System.out.println("min: "+minSubArrayLen(target,nums));
    }
    public static int minSubArrayLen(int target, int[] nums) {
        int total = Integer.MAX_VALUE;
        int runningTotal = 0;
        int leftIndex = 0;
        for(int i = 0; i < nums.length; i++){
            runningTotal = runningTotal+nums[i];
            while (runningTotal>=target){
                if(total>(i-leftIndex)+1){
                    total = (i-leftIndex)+1;
                }
                runningTotal-=nums[leftIndex];
                leftIndex++;
            }
        }
        return (total==Integer.MAX_VALUE)?0:total;
    }
}
