package ds.graph;

import java.util.*;

public class MinimumKnightMove {
    public static void main(String[] args) {
        int x = 1;//5,0,2,7
        int y = 1;//5,0,1,7
        System.out.println(minKnightMoves(x,y));
    }

    public static int minKnightMoves(int x, int y) {
        x = Math.abs(x);
        y = Math.abs(y);
        int[][] legalMoves = {{1, 2}, {2, 1}, {2, -1}, {1, -2}, {-1, -2}, {-2, -1}, {-2, 1}, {-1, 2}};
        int [][] visited = new int[305][305];
        visited[0+2][0+2] = 1;
        Queue<int[]> queue = new LinkedList<>();
        queue.add(new int[]{0,0});
        int moves = 0;
        while (!queue.isEmpty()){
            int size = queue.size();
            for(int i = 0; i < size; i++) {
                int [] temp = queue.poll();
                if (temp[0] == x && temp[1] == y){
                    return moves;
                }
                for(int[] count : legalMoves){
                    int posX = count[0] + temp[0];
                    int posY = count[1] + temp[1];
                    if (posX >= -2 && posY >= -2 && posX < 305 && posY < 305 && visited[posX+2][posY+2] == 0) {
                        queue.add(new int[]{posX,posY});
                        visited[posX+2][posY+2] = 1;
                    }
                }
            }
                moves++;
        }
        return moves;
    }
}
