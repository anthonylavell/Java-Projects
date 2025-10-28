package grinder;

import javafx.util.Pair;

import java.util.PriorityQueue;

public class Solution {
    public static void main(String[] args) {
        int[][] points = {{1,3},{-2,2}};
        int k = 1;
        kClosest(points,k);
    }
    public static int[][] kClosest(int[][] points, int k) {
        PriorityQueue<Pair<Integer,int[]>> queue = new PriorityQueue<>((a,b)->Integer.compare(a.getKey(), b.getKey()));
        for (int [] distances : points){
            int x = distances[0];
            int y = distances[1];
            int key = (x*x)+(y*y);
            queue.add(new Pair<>(key,new int[]{x,y}));
        }
        int[][] newPoints = new int[k][2];

        for (int index = 0; !queue.isEmpty() && index < k; index++){
            Pair<Integer,int[]>dist = queue.poll();
            newPoints[index] = dist.getValue();
        }
        return newPoints;

    }

}
