package wayfair.array;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class LongestConsecutiveSequence {
    public static void main(String[] args) {
        int [] nums = {100,4,200,1,3,2};
        //int [] nums2 = new int[1];
        int [] nums3 = new int[0];
        int [] nums4 = {0};
        int [] nums6 = {9,1,4,7,3,-1,0,5,8,-1,6};
        System.out.println(nums3.length);
        System.out.println(Arrays.toString(nums3));
        System.out.println(longestConsecutive(nums));

    }
    public static int longestConsecutive(int[] nums) {
        int total =0;
        Set<Integer> setOfInteger = new HashSet<>();
        for(int num : nums){
            setOfInteger.add(num);
        }
       for(int num : nums){
           int len = 1;
           if(!setOfInteger.contains(num-len)){
               while (setOfInteger.contains(num+len)){
                   len++;
               }
               total = Math.max(total,len);
           }
       }
        return total;
    }
}
