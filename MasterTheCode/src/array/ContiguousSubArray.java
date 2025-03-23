package array;

public class ContiguousSubArray {
    public static void main(String[] args) {
        //int [] nums = new int[] {-2,1,-3,4,-1,2,1,-5,4};
        //int [] nums = new int[]{5,4,-1,7,8};
        int [] nums = new int[]{-5,-4,-1,-7,-8};
        //int [] nums = new int[]{5};
        System.out.println(maxSubArray(nums));
    }
    public static int maxSubArray(int[] nums) {
        int total = Integer.MIN_VALUE;
        int runningTotal = 0;
        for(int num : nums){
            runningTotal+=num;
            if(total < runningTotal){
                total = runningTotal;
            }
            if(runningTotal < 0)
                runningTotal = 0;

        }
        return total;
    }
}
