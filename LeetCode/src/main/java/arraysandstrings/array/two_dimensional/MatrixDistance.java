package arraysandstrings.array.two_dimensional;

import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.PriorityQueue;
import java.util.Queue;

public class MatrixDistance {
    public static void main(String[] args) {
        //int[][] mat = {{1,3,4},{6,9,8},{10,14,30}};
        int[][] mat = {{1,1,0},{1,1,1},{1,1,0}};
        //System.out.println(mat.length);
        //System.out.println(mat[0].length);
        //updateMatrix(mat);
        PriorityQueue<int[]> pq = new PriorityQueue<>();
        int[][] points = {{3,3},{5,-1},{-2,4}};
        for(int [] p : points){
            int [] temp = p;
            pq.add(temp);
            System.out.println(Arrays.toString(p));
        }
        int x = 0;

    }
    public static int[][] updateMatrix(int[][] mat) {
        int[][] visited = new int[mat.length][mat[0].length];
        Queue<int[]> queue = new ArrayDeque<>();
        for(int row = 0; row < mat.length; row++){
            for(int col =0; col < mat[row].length; col++){
                if(mat[row][col] != 0 ){
                    visited[row][col] = -1;
                }else {
                    queue.add(new int[] {row,col});
                }
            }
        }
        while (!queue.isEmpty()){
            int[] tempArray = queue.poll();
            int row = tempArray[0];
            int col = tempArray[1];
            if((row-1) >= 0 && visited[row-1][col]== -1){
                visited[row-1][col] = visited[row][col] +1;
                queue.add(new int[] {row-1,col});
            }
            if((row+1) <= mat.length-1 && visited[row+1][col]== -1){
                visited[row+1][col] = visited[row][col] +1;
                queue.add(new int[] {row+1,col});
            }
            if((col-1) >= 0 && visited[row][col-1]== -1){
                visited[row][col-1] = visited[row][col] +1;
                queue.add(new int[] {row,col-1});
            }
            if((col+1) <= mat[row].length-1 && visited[row][col+1]== -1){
                visited[row][col+1] = visited[row][col] +1;
                queue.add(new int[] {row,col+1});
            }
        }
        return visited;

    }
    private static int helpUpdateMatrix(int[][] mat,boolean[][] visited,int row,int col){
        if(row < mat.length || row > mat.length || col < mat[row].length || col > mat[row].length ){
            return Integer.MAX_VALUE;
        }
        if(mat[row][col] == 0 || visited[row][col]){
            return 0;
        }
        visited[row][col] = true;
        int distance = Integer.MAX_VALUE;
        distance = Math.max(distance,helpUpdateMatrix(mat,visited,row, ++col));
        distance = Math.max(distance,helpUpdateMatrix(mat,visited,row, --col));
        distance = Math.max(distance,helpUpdateMatrix(mat,visited,++row, col));
        distance = Math.max(distance,helpUpdateMatrix(mat,visited,--row, col));

        return distance +1;
    }
}
