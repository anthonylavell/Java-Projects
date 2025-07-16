package comp_p.hubspot;

import java.util.*;

public class TopKFrequentElements {
    public static void main(String[] args) {
        int [] nums = {0,0,0,1,1,2};
        int k = 2;
        topKFrequent(nums,k);
    }
    public static int[] topKFrequent(int[] nums, int k) {
        Map<Integer,Integer> mapOfInts = new HashMap<>();
        PriorityQueue<int[]> queue = new PriorityQueue<>((a,b) -> b[0] - a[0]);
        for (int num : nums){
            mapOfInts.put(num, mapOfInts.getOrDefault(num,0)+1);
        }
        int[]totalArray = new int[k];
        for (Map.Entry<Integer,Integer> entry : mapOfInts.entrySet()){
           queue.add(new int[] {entry.getValue(), entry.getKey()});
        }
        int count = 0;
        while (count < k){
            int[]temp = queue.poll();
            totalArray[count++] = temp[1];
        }

        return totalArray;
    }
}
