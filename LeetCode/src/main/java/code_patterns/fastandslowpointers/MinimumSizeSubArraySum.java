package code_patterns.fastandslowpointers;

public class MinimumSizeSubArraySum {
    public static void main(String[] args) {
        int [] nums = {2,3,1,2,4,3};
        int target = 7;
        System.out.println(minSubArrayLen(target,nums));
    }

    public static int minSubArrayLen(int target, int[] nums) {
        int leftIndx = 0;
        int sum = Integer.MAX_VALUE;
        int subTotal = 0;
        for(int rightIndx = 0; rightIndx < nums.length; rightIndx++){
            subTotal+=nums[rightIndx];
            while (subTotal >= target){
                sum = Math.min((rightIndx-leftIndx) + 1, sum);
                subTotal-=nums[leftIndx++];
            }
        }
        return (sum == Integer.MAX_VALUE) ? 0 : sum;
    }
}
