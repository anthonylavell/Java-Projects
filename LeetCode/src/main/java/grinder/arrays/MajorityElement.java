package grinder.arrays;

import java.util.Arrays;

public class MajorityElement {
    public static void main(String[] args) {
        int[] nums = {3,2,3};
        System.out.println(majorityElement(nums));
    }

    public static int majorityElement(int[] nums) {
        Arrays.sort(nums);
        int total = nums[0];
        int count = 1;
        int runningC = 1;
        for (int right = 1; right <= nums.length; right++){
           if(right == nums.length || nums[right] != nums[right-1]){
               if(count < runningC){
                   total = nums[right-1];
                   count = runningC;
               }
               runningC=0;
           }
           runningC++;
        }

        return total;
    }
}
