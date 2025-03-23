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
    public static void main(String[] args) {
        int [] candidates = {2,3,5};
        int target = 8;
        System.out.println(combinationSum(candidates,target));
    }

    public static List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<List<Integer>>sum = new ArrayList<>();
        helpCombinationSum(candidates,target,0,new ArrayList<>(),sum);
        return sum;
    }

    private static void helpCombinationSum(int[] candidates, int target,  int start, List<Integer> list, List<List<Integer>>sum) {
        if(target <= 0){
            if(target == 0) {
                sum.add(new ArrayList<>(list));
            }
            return;
        }
        for(int i = start; i < candidates.length; i++){
            list.add(candidates[i]);
            helpCombinationSum(candidates,(target -list.get(list.size()-1)),i,list,sum);
            list.remove(list.size()-1);
        }
    }
}
