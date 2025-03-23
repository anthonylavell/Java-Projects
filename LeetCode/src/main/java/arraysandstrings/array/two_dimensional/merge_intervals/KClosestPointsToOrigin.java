package arraysandstrings.array.two_dimensional.merge_intervals;

import java.util.PriorityQueue;

public class KClosestPointsToOrigin {
    public static void main(String[] args) {
        int[][] points = {{3,3},{5,-1},{-2,4}};
        int k = 2;
        kClosest(points,k);
    }
    public static int[][] kClosest(int[][] points, int k) {
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        int limit = 0;
        System.out.println();
        for(int i = 0; i < points.length; i++){
            int euclideanDistance = (int)Math.pow((points[i][0]),2) + (int)Math.pow((points[i][1]),2);
            pq.add(euclideanDistance);
        }
        for(int i = 0; i < k; i++){
           limit= pq.poll();
        }
        int [][] closestPoints = new int[k][2];
        int count = 0;
        for(int i = 0; i < points.length; i++){
            int euclideanDistance = (int)Math.pow((points[i][0]),2) + (int)Math.pow((points[i][1]),2);
            pq.add(euclideanDistance);
            if(euclideanDistance <= limit){
                closestPoints[count][0] = points[i][0];
                closestPoints[count][1] = points[i][1];
                count++;
            }
        }
        return closestPoints;

    }
}
