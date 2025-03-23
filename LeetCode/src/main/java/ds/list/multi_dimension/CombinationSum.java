package ds.list.multi_dimension;

import java.util.ArrayList;
import java.util.List;

public class CombinationSum {
    public static void main(String[] args) {
        int[] candidates = {2,3,5,7};
        combinationSum(candidates,7);

    }
    public static List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<List<Integer>> sum = new ArrayList<>();
        generateSum(0,candidates,target,sum,new ArrayList<>());
        return sum;
    }

    private static void generateSum(int index, int[] candidates, int target, List<List<Integer>> sum, List<Integer> subTotal) {
        if (target < 0) {
        } else if (target == 0) {
            sum.add(new ArrayList<>(subTotal));
        } else {
            for (int i = index; i < candidates.length; i++) {
                subTotal.add(candidates[i]);
                generateSum(i, candidates, target-candidates[i], sum, subTotal);
                subTotal.remove(subTotal.size() - 1);
            }
        }
    }
}
