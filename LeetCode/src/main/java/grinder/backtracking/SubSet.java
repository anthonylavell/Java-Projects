package grinder.backtracking;

import java.util.ArrayList;
import java.util.List;

public class SubSet {
    public static void main(String[] args) {
        int [] nums = {1,2,3};
        System.out.println(subsets(nums));
    }
    public static List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> subSet = new ArrayList<>();
        helpSubsets(nums,0,new ArrayList<>(),subSet);
        return subSet;
    }

    public static void helpSubsets(int[] nums,int start, List<Integer> listOfints, List<List<Integer>> subSet) {
        subSet.add(new ArrayList<>(listOfints));
        for(int index = start; index < nums.length; index++){
            listOfints.add(nums[index]);
            helpSubsets(nums,index+1,listOfints,subSet);
            listOfints.remove(listOfints.size()-1);
        }
    }
}
