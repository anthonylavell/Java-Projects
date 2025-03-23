package code.pattern.backtracking;

import java.util.ArrayList;
import java.util.List;

public class SubSet {

    public static List<List<Integer>> subsets(List<Integer> nums) {
        // WRITE YOUR BRILLIANT CODE HERE
        List<List<Integer>> subSet = new ArrayList<>();
        helpSubsets(nums,0,new ArrayList<>(),subSet);
        return subSet;
    }

    public static void helpSubsets(List<Integer>  nums,int start, List<Integer> listOfints, List<List<Integer>> subSet) {
        subSet.add(new ArrayList<>(listOfints));
        for(int index = start; index < nums.size(); index++){
            listOfints.add(nums.get(index));
            helpSubsets(nums,index+1,listOfints,subSet);
            listOfints.remove(listOfints.size()-1);
        }
    }
}
