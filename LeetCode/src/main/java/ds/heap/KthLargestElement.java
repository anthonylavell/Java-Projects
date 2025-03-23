package ds.heap;

import java.util.Collections;
import java.util.PriorityQueue;
import java.util.Queue;

public class KthLargestElement {
    public static void main(String[] args) {
        //int [] nums = {3,2,3,1,2,4,5,5,6};
        int k = 4;
        int [] nums = {3,2,1,5,6,4};
        k = 2;
        System.out.println(findKthLargest(nums,k));
    }
    public static int findKthLargest(int[] nums, int k) {
        Queue<Integer> maxHeap = new PriorityQueue<>(Collections.reverseOrder());
        for(int num: nums){
            maxHeap.add(num);
        }
        for (int i = 0; i < k-1; i++){
            maxHeap.poll();
        }
        return maxHeap.peek();
    }
}
