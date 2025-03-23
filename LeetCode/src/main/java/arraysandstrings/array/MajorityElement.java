package arraysandstrings.array;

import java.util.Arrays;

public class MajorityElement {
    public static int findMajorityElement(int[] nums) {
        Arrays.sort(nums);
        int foundIndex = nums[0];
        int track = 0;
        int total = 0;
        for(int i = 0; i <nums.length; i++){
            if( i == nums.length-1 || nums[i] != nums[i+1]){
                    track++;
                if(total < track){
                    total = track;
                    foundIndex = nums[i];
                }
                track = 0;
            }else {
                track++;
            }

        }
        return foundIndex;
    }
}
