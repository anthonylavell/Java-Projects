package ds.list.multi_dimension;

import java.util.ArrayList;
import java.util.List;

public class Permutations {
    public static void main(String[] args) {
        int[] nums = {1,2,3};
        permute(nums);

    }
    public static List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> sum =new ArrayList<>();
        backTrack(sum,nums,new ArrayList<>());
        return sum;
    }

    private static void backTrack(List<List<Integer>> sum, int[] nums, List<Integer> list){
        if(list.size() == nums.length){
            sum.add(new ArrayList<>(list));
            return;
        }
        for(int num : nums){
            if(list.contains(num))
                continue;
            list.add(num);
            backTrack(sum,nums,list);
            list.remove(list.size()-1);
        }
    }
}
