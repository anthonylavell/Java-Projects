/*
Given an array of distinct integers candidates and a target integer target,
return a list of all unique combinations of candidates where the chosen numbers
sum to target. You may return the combinations in any order.

The same number may be chosen from candidates an unlimited number of times.
Two combinations are unique if the
frequency
 of at least one of the chosen numbers is different.

The test cases are generated such that the number of unique combinations
that sum up to target is less than 150 combinations for the given input.



Example 1:

Input: candidates = [2,3,6,7], target = 7
Output: [[2,2,3],[7]]
Explanation:
2 and 3 are candidates, and 2 + 2 + 3 = 7. Note that 2 can be used multiple times.
7 is a candidate, and 7 = 7.
These are the only two combinations.
Example 2:

Input: candidates = [2,3,5], target = 8
Output: [[2,2,2,2],[2,3,3],[3,5]]
Example 3:

Input: candidates = [2], target = 1
Output: []
 */

package grinder.backtracking;

import java.util.ArrayList;
import java.util.List;

public class CombinationSum {

    private List<List<Integer>> sum = new ArrayList<>();
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        findCombination(new ArrayList<>(),candidates,target,0);
        int i = 0;
        return sum;
    }

    private void findCombination(List<Integer>subList, int[] candidates, int target, int index){
        if (target ==0){
            sum.add(new ArrayList<>(subList));
            return;
        }
        for (int idx = index; idx < candidates.length; idx++){
            if (target-candidates[idx] >=0) {
                subList.add(candidates[idx]);
                findCombination(subList, candidates, target-candidates[idx], idx);
                subList.remove(subList.size()-1);
            }
        }
    }

    public static void main(String[] args) {
        CombinationSum combinationSum = new CombinationSum();
        int [] candidates = {2,3,5};
        int target = 8;
        System.out.println(combinationSum.combinationSum(candidates,target));
    }
}
