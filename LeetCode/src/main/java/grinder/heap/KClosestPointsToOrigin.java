package grinder.heap;

import java.util.*;

public class KClosestPointsToOrigin {
    public static void main(String[] args) {
        int[][] points = {{6,10},{-3,3},{-2,5},{0,2}};
        //int[][] points = {{0,1},{1,0}};
        int k = 3;

        System.out.println(Arrays.deepToString(kClosest(points,k)));

    }

    public static int[][] kClosest(int[][] points, int k) {
        PriorityQueue<int[]> pq = new PriorityQueue<>((a,b)->Integer.compare(a[0],b[0]));
        int[][] origin = new int[k][2];
        for (int[] row : points){
            int key = (row[0]*row[0])+(row[1]*row[1]);
            pq.add(new int[]{key,row[0],row[1]});
        }
        while (k > 0){
           int[] row = pq.poll();
            origin[k-1][0] = row[1];
            origin[k-1][1] = row[2];
            k--;
        }
        return origin;
    }
}
