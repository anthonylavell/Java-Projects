package grinder.arrays;

public class FindPeakElement {
    public static void main(String[] args) {

    }

    public static int findPeakElement(int[] nums) {
        int leftIndx = 0;
        int rightIndx = nums.length-1;
        int peak = 0;
        while(leftIndx <= rightIndx){
            int temp =(nums[leftIndx]>nums[rightIndx]) ? leftIndx : rightIndx;
            if(nums[temp] > nums[peak]){
                peak = temp;
            }
            leftIndx++;
            rightIndx--;
        }
        return peak;
    }
}
