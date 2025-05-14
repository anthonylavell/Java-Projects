package code.pattern.heap;

import java.util.*;
import java.util.List;
import java.util.PriorityQueue;

public class MergeKSortedLists {
    public static void main(String[] args) {

    }
    public static List<Integer> mergeKSortedLists(List<List<Integer>> lists) {
        // WRITE YOUR BRILLIANT CODE HERE
        PriorityQueue<Integer>queue = new PriorityQueue<>();
        List<Integer> merge = new ArrayList<>();
        for (List<Integer> list : lists){
            queue.addAll(list);
        }
        while (!queue.isEmpty()){
            merge.add(queue.poll());
        }
        return merge;
    }
}
