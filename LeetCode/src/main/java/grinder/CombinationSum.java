package grinder;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CombinationSum {
    public static void main(String[] args) {
        int []candidates = {2,3,4};
        int target = 9;
        System.out.println(combinationSum(candidates,target));

    }
    public static List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<List<Integer>>sum = new ArrayList<>();
        Arrays.sort(candidates);
        findSum(sum,new ArrayList<>(),candidates,target,0);

        return sum;
    }

    private static void findSum(List<List<Integer>>sum, List<Integer> tempList, int[] candidates, int target,int start){
        if (target==0){
            sum.add(new ArrayList<>(tempList));
            return;
        }

        for (int pos= start; pos < candidates.length; pos++){
            if (candidates[pos] > target){
                break;
            }
            tempList.add(candidates[pos]);
            findSum(sum,tempList,candidates,target- candidates[pos],pos);
            tempList.remove(tempList.size()-1);
        }
    }

}
