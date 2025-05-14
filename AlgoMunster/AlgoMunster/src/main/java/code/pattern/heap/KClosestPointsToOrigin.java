package code.pattern.heap;

import java.util.*;

public class KClosestPointsToOrigin {
    public static void main(String[] args) {
        List<List<Integer>> points = Arrays.asList(
                new ArrayList<>(Arrays.asList(1,1)),
                new ArrayList<>(Arrays.asList(2,2)),
                new ArrayList<>(Arrays.asList(3,3))
        );
        int k = 1;
        System.out.println(kClosestPoints(points,k));
    }

    public static List<List<Integer>> kClosestPoints(List<List<Integer>> points, int k) {
        // WRITE YOUR BRILLIANT CODE HERE
        List<List<Integer>>closestP = new ArrayList<>();
        PriorityQueue<List<Integer>> heap = new PriorityQueue<>((a,b) ->Integer.compare(a.get(0),b.get(0)));
        int count = 0;
       for (List<Integer>point:points){
           int total = (point.get(0) * point.get(0)) +(point.get(1) * point.get(1));
           heap.add(Arrays.asList(total,point.get(0),point.get(1)));
       }
       while (k-->0){
           List<Integer>point = heap.poll();
           closestP.add(new ArrayList<Integer>(Arrays.asList(point.get(1),point.get(2))));
       }
        return closestP;
    }
}
