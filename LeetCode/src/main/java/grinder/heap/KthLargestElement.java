package grinder.heap;

import java.util.PriorityQueue;

public class KthLargestElement {
    public static void main(String[] args) {

    }
    public static int findKthLargest(int[] nums, int k) {
        PriorityQueue<Integer>queue=new PriorityQueue<>(nums.length,(a,b)->b-a);
        for (int num : nums){
            queue.add(num);
        }
        while (k-->1){
            queue.poll();
        }

        return queue.poll();
    }
}
