package ds.heap;

import java.util.Arrays;
import java.util.Collections;
import java.util.PriorityQueue;
import java.util.Queue;

public class TwoHeap {
    private static Queue<Integer> maxHeap = new PriorityQueue<>(Collections.reverseOrder());
    private static Queue<Integer> minHeap = new PriorityQueue<>();
    public static void main(String[] args) {
        //int [] arr = {7,1,3,4,2,5,6,8};
        //for (int num : arr){
          //  insert(num);
       // }
        //int [] arr = {1,2,3,4,2,3,1,4,2};
        //int [] arr = {-2147483648,-2147483648,2147483647,-2147483648,-2147483648,-2147483648,2147483647,2147483647,2147483647,2147483647,-2147483648,2147483647,-2147483648};
        //int k = 2;
        int [] arr = {-2147483648,-2147483648,2147483647,-2147483648,-2147483648,-2147483648,2147483647,2147483647,2147483647,2147483647,-2147483648,2147483647,-2147483648};
        int k = 3;
        double [] doubleArr = medianSlidingWindow(arr,k);
        System.out.println(Arrays.toString(doubleArr));
    }

    public static void insert(int num){
        if(maxHeap.isEmpty() || maxHeap.peek() >= num){
            maxHeap.add(num);
        }else {
            minHeap.add(num);
        }
        balanceHeap();
    }

    public static void remove(int num){
        if(num <= maxHeap.peek()){
            maxHeap.remove(num);
        }else {
            minHeap.remove(num);
        }
        balanceHeap();
    }

    public static double findMedian(){
        if((maxHeap.size()+minHeap.size()) %2 == 0){
            double med = ((double) (maxHeap.peek()) + (double) (minHeap.peek()))/2;
            int i = 0;
            return (maxHeap.peek() + minHeap.peek())/2.0;
        }else {
            Double med1 = Double.valueOf(maxHeap.peek());
            double med = (double)maxHeap.peek();
            return (double)maxHeap.peek();
        }
    }

    public static double[] medianSlidingWindow(int[] nums, int k) {
        double[] arrOfDouble = new double[nums.length-(k-1)];
        int counter = 0;
        for(int i = 0; i < nums.length; i++){
            insert(nums[i]);
            if(maxHeap.size()+minHeap.size()==k){
                arrOfDouble[counter++] = findMedian();
                remove(nums[i-(k-1)]);
            }
        }
        return arrOfDouble;
    }

    private static void balanceHeap(){
        if(maxHeap.size() > (minHeap.size() + 1)){
            minHeap.add(maxHeap.poll());
        }else if(maxHeap.size() < minHeap.size()){
            maxHeap.add(minHeap.poll());
        }
    }
}
