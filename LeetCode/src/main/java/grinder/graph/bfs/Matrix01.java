package grinder.graph.bfs;

import java.util.*;

public class Matrix01 {
    public static int[][] updateMatrix(int[][] mat) {
        Deque<int[]>dequeOfRows = new ArrayDeque<>();
        int[][] dirs = {{0,1},{0,-1},{-1,0},{1,0} };
        boolean[][]visited = new boolean[mat.length][mat[0].length];
        for (int row = 0; row < mat.length; row++){
            for (int col = 0; col < mat[row].length; col++){
                if (mat[row][col] == 0){
                    dequeOfRows.add(new int[] {row,col});
                    visited[row][col] = true;
                }
            }
        }
        while (!dequeOfRows.isEmpty()){
            int size = dequeOfRows.size();
            while (size-->0) {
                int[] temp = dequeOfRows.poll();
                int row = temp[0];
                int col = temp[1];
                for (int[] dir : dirs) {
                    int y = row + dir[0];
                    int x = col + dir[1];
                    if (y >= 0 && y < mat.length && x >= 0 && x < mat[0].length && !visited[y][x]) {
                        mat[y][x] += mat[row][col];
                        dequeOfRows.add(new int[]{y, x});
                        visited[y][x] = true;
                    }
                }
            }
        }
        return mat;
    }

    public static void main(String[] args) {
        int[][] mat = {{1,1,0},{1,1,1},{1,1,1}};
        //int[][] mat = {{0,0,0},{1,1,0},{1,1,1}};
        System.out.println(Arrays.deepToString(updateMatrix(mat)));
    }


}
