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
        int[]cache={0,0};
        Arrays.sort(nums);
        for (int index = 0; index < nums.length; index++){
            List<Integer>list = new ArrayList<>();;
                int counter = index;
                while (index > 0 &&--counter >= 0){
                    if (nums[index]%nums[counter]==0){
                        if (subList.get(counter).size() > list.size()){
                            if (list.size() > 1)
                                list.clear();
                            list.addAll(subList.get(counter));
                        }
                    }
                }
            list.add(nums[index]);
            subList.add(list);
            if (cache[0]<list.size()){
                cache[0]= list.size();
                cache[1] = index;
            }
        }
        return subList.get(cache[1]);
    }
}
