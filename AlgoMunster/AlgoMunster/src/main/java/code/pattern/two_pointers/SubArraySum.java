package code.pattern.two_pointers;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class SubArraySum {
    public static void main(String[] args) {
        List<Integer> arr = new ArrayList<>(Arrays.asList(1,-20,-3,30,5,4));
        int target = 7;
        System.out.println(subArraySum(arr,target));
    }

    public static List<Integer> subArraySum(List<Integer> arr, int target) {
        // WRITE YOUR BRILLIANT CODE HERE
        int[]storeSum = new int[arr.size()];
        List<Integer> list = new ArrayList<>();
        for(int rightIndx = 0; rightIndx < arr.size(); rightIndx++){
            int leftIndx = 0;
            while (leftIndx <= rightIndx) {
                if(storeSum[leftIndx]+arr.get(rightIndx) == target){
                    list.add(leftIndx);
                    list.add(rightIndx);
                    return list;
                }
                storeSum[leftIndx++]+=arr.get(rightIndx);
                }
            }
        return list;
    }
}
