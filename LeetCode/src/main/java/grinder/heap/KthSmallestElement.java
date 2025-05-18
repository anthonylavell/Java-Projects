package grinder.heap;

import java.util.Arrays;
import java.util.PriorityQueue;

public class KthSmallestElement {
    public static void main(String[] args) {

    }

    public static int kthSmallest(int[][] matrix, int k) {
        PriorityQueue<Integer> queue = new PriorityQueue<>();
        for (int [] row : matrix){
            for (int col : row){
                queue.add(col);
            }
        }
        while (k-->1){
            queue.poll();
        }
        return queue.poll();
    }

    public static int kthSmallest2(int[][] matrix, int k) {
        int size = matrix.length;
        int[]oneD = new int[size*size];
        int index = 0;
        for (int [] row : matrix){
            for (int col : row){
                oneD[index++]=col;
            }
        }
        Arrays.sort(oneD);
        return oneD[k-1];
    }
}
