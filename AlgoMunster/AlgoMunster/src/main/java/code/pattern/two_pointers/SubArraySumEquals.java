package code.pattern.two_pointers;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class SubArraySumEquals {
    public static void main(String[] args) {

    }
    public static int subArraySumTotal(List<Integer> arr, int target) {
        // WRITE YOUR BRILLIANT CODE HERE
        Map<Integer,Integer> mapOfNums = new HashMap<>();
        mapOfNums.put(0,1);
        int total = 0;
        int subTotal = 0;
        for(int val : arr){
            subTotal += val;
            int diff = subTotal - target;
            if(mapOfNums.containsKey(diff)){
                total+=mapOfNums.get(diff);
            }
            mapOfNums.put(subTotal,mapOfNums.getOrDefault(subTotal,0)+1);
        }
        return total;
    }

}
