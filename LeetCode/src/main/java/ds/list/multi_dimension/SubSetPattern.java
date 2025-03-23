package ds.list.multi_dimension;

import java.util.ArrayList;
import java.util.List;

public class SubSetPattern {
    public static void main(String[] args) {
        int [] nums = {1,2,3};
        subsets(nums);
    }
    public static List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> subSet = new ArrayList<>(nums.length*2);
        generateSubSets(0,nums,new ArrayList<>(),subSet);
        return subSet;
    }
    public static void generateSubSets(int index,int [] nums,List<Integer> current,List<List<Integer>> subSet ){
        subSet.add(new ArrayList<>(current));
        for(int i = index; i < nums.length; i++){
            current.add(nums[i]);
            generateSubSets(i+1,nums,current,subSet);
            current.remove(current.size()-1);
        }
    }
}
