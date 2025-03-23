package arraysandstrings.array;

public class MaximumSubArray {
    public int maxSubArray(int[] nums) {
        int total = nums[0];
        int runningTotal = total;
        for(int i = 1; i < nums.length; i++){
            runningTotal += nums[i];
            if(runningTotal < nums[i]){
                runningTotal = nums[i];
            }
            if(total < runningTotal){
                total =runningTotal;
            }
        }
        return total;

    }
}
