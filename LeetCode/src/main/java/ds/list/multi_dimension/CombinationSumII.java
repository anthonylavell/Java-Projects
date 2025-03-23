package ds.list.multi_dimension;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CombinationSumII {
    public static void main(String[] args) {
        int[] candidates = {10,1,2,7,6,1,5};
        int target = 8;
        combinationSum2(candidates,target);
        int [] candidates2 = {2,5,2,1,2};
        target = 5;
        combinationSum2(candidates2,target);
    }
    public static List<List<Integer>> combinationSum2(int[] candidates, int target) {
        Arrays.sort(candidates);
        List<List<Integer>> sum = new ArrayList<>();
        generateSum(0,sum,new ArrayList<>(),candidates,target);
        return sum;
    }

    public static void generateSum(int index,List<List<Integer>> sum, List<Integer> sub, int[] candidates, int target){

        if(target < 0){

        } else if (target== 0) {
            sum.add(new ArrayList<>(sub));
        }else{
            for(int i = index; i < candidates.length; i++){
                if(i > index && candidates[i] == candidates[i-1])
                    continue;
                sub.add(candidates[i]);
                generateSum(i+1,sum,sub,candidates,(target-candidates[i]));
                sub.remove(sub.size()-1);
            }
        }
    }
}
