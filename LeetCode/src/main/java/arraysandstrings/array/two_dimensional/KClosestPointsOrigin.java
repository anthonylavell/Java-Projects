package arraysandstrings.array.two_dimensional;

import java.util.*;

public class KClosestPointsOrigin {
    public static void main(String[] args) {
        //int [][] points = {{3,3},{5,-1},{-2,4}};
        int k = 1;
        //kClosest(points,k);
        int [][] points = {{3,3},{5,-1},{-2,4}};
        k=2;
        kClosest(points,k);
    }
    public static int[][] kClosest(int[][] points, int k) {
        PriorityQueue<Integer> minHeap = new PriorityQueue<>();
        int [] limit = new int[k];
        for(int [] point : points){
            int euclidean  = (int)(Math.pow(point[0],2) + Math.pow(point[1],2));
            minHeap.add(euclidean);
        }
        int count = 0;
        while (count < k){
            limit[count++] = minHeap.poll();
        }
        int[][] newPoints = new int[k][2];
        count = 0;
        for(int [] point : points){
            int euclidean  = (int)(Math.pow(point[0],2) + Math.pow(point[1],2));
            if(euclidean <= limit[k-1]){
                newPoints[count++] = point;
            }
        }
        return newPoints;
    }
}
