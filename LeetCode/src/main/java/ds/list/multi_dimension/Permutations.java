package ds.list.multi_dimension;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Permutations {
    public List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> sum =new ArrayList<>();
        Arrays.sort(nums);
        backTrack(sum,new ArrayList<>(),nums,0);
        return sum;
    }

    private void backTrack(List<List<Integer>> sum, List<Integer> list, int[] nums, int index){
        if(list.size() == nums.length){
            sum.add(new ArrayList<>(list));
        }else {
            for(int i = index; i < nums.length; i++){
                if(list.contains(nums[i])){
                    continue;
                }
                list.add(nums[i]);
                backTrack(sum,list,nums,index);
                list.remove(list.size()-1);
            }
        }
    }
}
