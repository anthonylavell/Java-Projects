package ds.list.multi_dimension;

import java.util.ArrayList;
import java.util.List;

public class SubSets {
    public static void main(String[] args) {

    }

    public static List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> subSet = new ArrayList<>();
        getSubsets(0,nums,new ArrayList<>(),subSet);
        return subSet;
    }

    private static void getSubsets (int index, int[] nums,List<Integer> current,List<List<Integer>> subSet){
        subSet.add(new ArrayList<>(current));
        for (int i = index; i < nums.length; i++){
            current.add(nums[i]);
            getSubsets(i+1,nums,current,subSet);
            current.remove(current.size()-1);
        }
    }
}
