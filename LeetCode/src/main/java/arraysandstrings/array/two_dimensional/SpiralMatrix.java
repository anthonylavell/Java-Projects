package arraysandstrings.array.two_dimensional;

import java.util.ArrayList;
import java.util.List;

public class SpiralMatrix {
    public static void main(String[] args) {
        //int[][] matrix = {{1,2,3,4},{5,6,7,8},{9,10,11,12},{13,14,15,16}};
        int[][] matrix = {{1,2,3},{4,5,6},{7,8,9}};
        spiralOrder(matrix);

    }
    public static List<Integer> spiralOrder(int[][] matrix) {
        List<Integer> listOfInts = new ArrayList<>();
        boolean [][] visited = new boolean[matrix.length][matrix[0].length];
        for(int row = 0; row < matrix.length; row++){
            for (int col = 0; col < matrix[row].length; col++){
                if(!visited[row][col]){
                    setSpiral(matrix ,visited,row,col,listOfInts,new int[] {0});
                    break;
                }
            }
        }
        return listOfInts;
    }

    private static void setSpiral(int[][] matrix,boolean [][] visited,int row, int col,List<Integer> listOfInts,int[] counter){
        if(outOfBoundary(matrix,visited,row,col)){
            counter[0] = counter[0] < matrix.length ? counter[0]+1 : 0;
            return;
        }
        visited[row][col] = true;
        listOfInts.add(matrix[row][col]);
        if(counter[0] == 0){
            setSpiral(matrix ,visited,row,col+1,listOfInts,counter);
        }
        if(counter[0] == 1){
            setSpiral(matrix ,visited,row+1,col,listOfInts,counter);
        }
        if(counter[0] == 2){
            setSpiral(matrix ,visited,row,col-1,listOfInts,counter);
        }
        if(counter[0] == 3){
            setSpiral(matrix ,visited,row-1,col,listOfInts,counter);
        }
    }

    private static boolean outOfBoundary(int[][] matrix,boolean [][] visited,int row, int col){
        if(row < 0 || col < 0){
            return true;
        }
        if(row >= matrix.length || col >= matrix[row].length){
            return true;
        }
        if (visited[row][col]){
            return true;
        }
        return false;
    }
}
