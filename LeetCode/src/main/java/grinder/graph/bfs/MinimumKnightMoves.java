package grinder.graph.bfs;

import java.util.ArrayDeque;
import java.util.Deque;

public class MinimumKnightMoves {
    public static void main(String[] args) {
        int x = 5;
        int y = 5;
        System.out.println(minKnightMoves(x,y));
    }

    public static int minKnightMoves(int x, int y) {
        x = Math.abs(x);
        y = Math.abs(y);
        int[][] dir = new int[][] { {1,2},{-1,2},{1,-2},{-1,-2}, {2,1},{-2,1},{2,-1},{-2,-1} };
        int[][]visited = new int[305][305];
        visited[0][0] = 1;
        Deque<int[]>deque = new ArrayDeque<>();
        deque.add(new int[]{0,0});
        for ( int steps = 0;!deque.isEmpty(); steps++){
            int size = deque.size();
            while (size-->0){
                int [] tempArray = deque.pop();
                if(tempArray[0] == x && tempArray[1] == y){
                    return steps;
                }
                for (int[]move : dir){
                    int row = tempArray[0] + move[0];
                    int col = tempArray[1] + move[1];
                    if(row >=-2 && col >=-2 && visited[row+2][col+2] == 0){
                        deque.add(new int[] {row,col});
                        visited[row+2][col+2] = 1;
                    }

                }
            }
        }
        return -1;
    }
}
