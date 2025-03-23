package arraysandstrings.array;

public class MaximumAverageSubArray {
    public static void main(String[] args) {
        int [] nums = {1,12,-5,-6,50,3};
        int k = 4;
        int [] nums3 = {-1};
        int k3 = 1;
        int [] nums4 = {0,4,0,3,2};
        int k4 = 1;
        System.out.println(findMaxAverage(nums3,k3));
    }

    public static double findMaxAverage(int[] nums, int k) {
        int left = 0;
        int right = 0;
       int subTotal =0;
        double total = Integer.MIN_VALUE;
        while (right < nums.length){
            subTotal+= nums[right];
            if((right - left) == (k-1)){
                total = Math.max(total,(subTotal));
                subTotal-=nums[left];
                left++;
            }
            right++;
        }
        return total/k;
    }
}
