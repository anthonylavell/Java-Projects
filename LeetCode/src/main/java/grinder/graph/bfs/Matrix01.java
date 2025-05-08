package grinder.graph.bfs;

import java.util.*;

public class Matrix01 {
    public static void main(String[] args) {
        int[][] mat = {{1,1,0},{1,1,1},{1,1,1}};
        //int[][] mat = {{0,0,0},{1,1,0},{1,1,1}};
        System.out.println(Arrays.deepToString(updateMatrix(mat)));
    }

    public static int[][] updateMatrix(int[][] mat) {
        int[][] newMatrix = new int[mat.length][mat[0].length];
        int[][] dirs = { {0,1},{0,-1},{-1,0},{1,0} };
        Deque<int[]>deque= new ArrayDeque<>();
        for (int row = 0; row < mat.length; row++){
            for (int col = 0; col < mat[row].length; col++){
                if(mat[row][col] == 1){
                    newMatrix[row][col] = -1;
                    continue;
                }
                deque.add(new int[] {row,col});
                newMatrix[row][col] = 0;
            }
        }

       while (!deque.isEmpty()){
           int size = deque.size();
           while (size-->0){
               int [] temp = deque.pop();
               for (int[] dir : dirs) {
                   int row = temp[0] + dir[0];
                   int col = temp[1] + dir[1];
                   if (row < mat.length && row >= 0 && col < mat[row].length && col >= 0 && newMatrix[row][col] ==-1) {
                       int subTotal = newMatrix[temp[0]][temp[1]];
                       newMatrix[row][col] = (subTotal == 0) ? 1 : subTotal + 1;
                       deque.add(new int[] {row,col});
                   }
               }
           }
       }

        return newMatrix;
    }


}
