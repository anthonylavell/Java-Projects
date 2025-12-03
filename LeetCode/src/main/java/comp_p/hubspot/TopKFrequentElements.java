/*
Given an integer array nums and an integer k,
return the k most frequent elements. You may return the answer in any order.
 */
package comp_p.hubspot;

import java.util.*;

public class TopKFrequentElements {
    public static int[] topKFrequent2(int[] nums, int k) {
        Map<Integer,Integer>mapOfCount = new HashMap<>();
        List<Integer>[] store = new List[nums.length+1];
        int [] topFreq = new int[k];
        for (int num: nums){
            mapOfCount.putIfAbsent(num,0);
            mapOfCount.put(num,mapOfCount.get(num)+1);
        }
        for (int index = 0; index < store.length; index++){
            store[index] =new ArrayList<>();
        }
        for (Map.Entry<Integer,Integer> entry : mapOfCount.entrySet()){
            store[entry.getValue()].add(entry.getKey());
        }
        int count = 0 ;
        for (int index = store.length-1; index>=0 && count < k; index--){
            for (int num : store[index]){
                topFreq[count]=num;
                count++;
            }
        }
        return topFreq;
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
