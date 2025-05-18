package grinder.heap;

import java.util.Collections;
import java.util.PriorityQueue;

public class MedianFinder {
    private PriorityQueue<Double> queue;
    public MedianFinder() {
        queue = new PriorityQueue<>();
    }

    public void addNum(int num) {
    double dec = Math.round(num*100.00)/100.00;
    queue.add(dec);
    }

    public double findMedian() {
        Double[]array = new Double[queue.size()];
        int med = array.length/2;
        for (int index = 0; index<array.length;index++){
            array[index]=queue.poll();
        }
        Collections.addAll(queue,array);
        Double d = (array[med]+array[med-1])/2;
        int per =  med%2;

        return array.length%2==1 ? array[med] : (array[med]+array[med-1])/2;
    }

}
