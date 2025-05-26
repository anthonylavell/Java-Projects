package grinder.dp.bottom_up;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class LargestDivisibleSubset {
    public static void main(String[] args) {
        int[]nums = {4,8,10,240};
        System.out.println(largestDivisibleSubset(nums));
    }

    public static List<Integer> largestDivisibleSubset(int[] nums) {
        List<List<Integer>>subList = new ArrayList<>();
        int cacheSize = 0;
        int cacheIndex = 0;
        Arrays.sort(nums);
        for (int index = 0; index < nums.length; index++){
            int counter = index;
            int[] temp = {-1,0};
            while (index > 0 &&--counter >= 0){
                if (nums[index]%nums[counter]==0){
                    int size = subList.get(counter).size();
                    if (size > temp[1]){
                        temp[0] = counter;
                        temp[1] = size;
                    }
                }
            }
            List<Integer> list = new ArrayList<>();
            if (temp[0] != -1){
                list.addAll(subList.get(temp[0]));
            }
            list.add(nums[index]);
            subList.add(list);
            if (cacheSize<temp[1]){
                cacheSize= temp[1];
                cacheIndex = index;
            }
        }
        return subList.get(cacheIndex);
    }
}
