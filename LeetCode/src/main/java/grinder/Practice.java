package grinder;

import java.util.*;

public class Practice {
    public static boolean containsNearbyDuplicate(int[] nums, int k) {
        Map<Integer,Integer>map = new HashMap<>();
        for (int index = 0; index < nums.length; index++){
            int key = nums[index];
            if (map.containsKey(key)){
                if (index - map.get(key) <= k){
                    return true;
                }
            }
            map.put(key, index);
        }
        return false;
    }
    public static void main(String[] args) {
        int[] nums = {1,1,1,2,2,3};
        int[] nums2 = {5,3,1,1,1,3,73,1};
        int k = 2;

    }
}
