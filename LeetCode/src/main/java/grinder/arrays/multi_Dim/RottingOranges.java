package grinder.arrays.multi_Dim;

import java.util.ArrayDeque;
import java.util.Deque;

public class RottingOranges {
    public static void main(String[] args) {
        int[][] grid = {{2,1,1},{1,1,1},{0,1,2}};
        System.out.println(orangesRotting(grid));
    }

    public static int orangesRotting(int[][] grid) {
        Deque<int[]> deque = new ArrayDeque<>();
        int[][] dirs = {{0,1},{0,-1},{-1,0},{1,0}};
        int totalRot = findMin(grid,deque);
        int min = 0;

        while (!deque.isEmpty()){
            int size = deque.size();
            while (size-- > 0){
                int[] temp = deque.pop();
                for (int[]dir : dirs){
                    int sr = dir[0] + temp[0];
                    int sc = dir[1] + temp[1];
                    if (sr >= 0 && sr < grid.length && sc >= 0 && sc < grid[sr].length && grid[sr][sc] == 1 ){
                        deque.add(new int[]{sr,sc});
                        grid[sr][sc]=2;
                    }
                }
            }
            if (!deque.isEmpty()){
                totalRot-=deque.size();
                min++;
            }
        }

        return totalRot > 0 ? -1 : min;
    }

    private static int findMin(int[][] grid,Deque<int[]>deque ){
        int rottenFuit = 0;
        for (int row = 0; row < grid.length; row++){
            for (int col = 0; col < grid[row].length; col++){
                if (grid[row][col] == 2){
                    deque.add(new int[] {row,col});
                }else if (grid[row][col] == 1){
                    rottenFuit++;
                }
            }
        }
        return rottenFuit;
    }
}
