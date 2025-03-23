package leetcode.arrays.two_dimensional.main;

import java.util.PriorityQueue;

public class KClosestPointsMain {
    public static void main(String[] args) {
        int k = 2;
       int[][] points = new int[][] {
                {3,3},
                {5,-1},
                {-2,4}
        };
       /* int[][] points = new int[][] {
                {3,3},
                {2,2},
                {5,-1},
                {-2,4}
        };*/
       /* int[][] points = new int[][] {
                {0,1},
                {1,0}
        };*/


        /*int [][]tempPoints = KClosestPoints.kClosest(points,k);
        System.out.println(Arrays.deepToString(tempPoints));*/
        PriorityQueue<int[]>maxHeap =
                new PriorityQueue<>((a,b)->(b[0] * b[0]+b[1] * b[1]) - (a[0] * a[0]+a[1] * a[1]) );
        for( int[] point : points){
            maxHeap.add(point);
        }
        //System.out.println(maxHeap);
    }
}
