package ds.heap;

import java.util.PriorityQueue;

public class KthLargestElement {
    public static void main(String[] args) {
        //int [] nums = {3,2,3,1,2,4,5,5,6};
        int k = 4;
        int [] nums = {3,2,1,5,6,4};
        k = 2;
        System.out.println(findKthLargest(nums,k));
    }
    public static int findKthLargest(int[] nums, int k) {
        PriorityQueue<Integer>queue = new PriorityQueue<>((a,b) -> a-b);
        for (int num: nums){
            queue.add(num);
            k--;
            if (k < 0){
                queue.poll();
            }
        }
        return queue.poll();
    }
}
