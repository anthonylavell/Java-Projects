package leetcode.queue;

import java.util.PriorityQueue;

public class topKFrequentNumbers {
    public static int FrequentNumbers(int [] nums, int k){


        PriorityQueue<Integer> pq = new PriorityQueue<>((a,b) -> b-a);
        for(int num : nums){
            pq.add(num);
        }
        int count = 1;
        while(count++ < k){
           pq.remove();
        }


        return pq.remove();
    }
}
