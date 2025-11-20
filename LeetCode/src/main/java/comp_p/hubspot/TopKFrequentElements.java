/*
Given an integer array nums and an integer k,
return the k most frequent elements. You may return the answer in any order.
 */
package comp_p.hubspot;

import java.util.*;

public class TopKFrequentElements {
    public static int[] topKFrequent2(int[] nums, int k) {
        int[] resultArray = new int[k];
        PriorityQueue<int[]> queue = new PriorityQueue<>((a,b) -> b[0]-a[0]);
        Map<Integer,Integer> mapOfInts = new HashMap<>();
        for (int num : nums){
            mapOfInts.put(num,mapOfInts.getOrDefault(num,0)+1);
        }
        for (Map.Entry<Integer,Integer> entry : mapOfInts.entrySet()){
            queue.add(new int[]{entry.getValue(),entry.getKey()});
        }
        for (int index = 0; index < k && !queue.isEmpty(); index++){
            int [] tempArray = queue.poll();
            resultArray[index] = tempArray[1];
        }
        return resultArray;
    }

    public static void main(String[] args) {
        int [] nums = {0,0,0,1,1,2};
        int k = 2;
        topKFrequent(nums,k);
    }
    public static int[] topKFrequent(int[] nums, int k) {
        int[] resultArray = new int[k];
        PriorityQueue<int[]> queue = new PriorityQueue<>((a,b) -> b[0]-a[0]);
        Map<Integer,Integer> mapOfInts = new HashMap<>();
        for (int num : nums){
            mapOfInts.put(num,mapOfInts.getOrDefault(num,0)+1);
        }
        for (Map.Entry<Integer,Integer> entry : mapOfInts.entrySet()){
            queue.add(new int[]{entry.getValue(),entry.getKey()});
        }
        for (int index = 0; index < k && !queue.isEmpty(); index++){
            int [] tempArray = queue.poll();
            resultArray[index] = tempArray[1];
        }
        return resultArray;
    }
}
