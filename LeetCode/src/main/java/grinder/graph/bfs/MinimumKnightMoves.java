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
        int steps = 0;
        int [][] moves = {{-1,-2},{1,-2},{-1,2},{1,2},{2,1},{-2,1},{2,-1},{-2,-1} };
        Deque<int[]> deque = new ArrayDeque<>();
        deque.add(new int[] {0,0});
        int [][]  visited = new int[305][305];
        visited[2][2] = 1;
        while (!deque.isEmpty()){
            int size = deque.size();
            while (size-- > 0){
                int [] coord = deque.pop();
                if(coord[0] == x &&  coord[1] == y){
                    return steps;
                }
                for (int [] move : moves){
                    int [] newCoord = {(coord[0] + move[0]), (coord[1] + move[1])};

                    if((newCoord[0] >= -2 && newCoord[1] >= -2) && visited[newCoord[0]+2][newCoord[1]+2] ==0){
                        deque.add(newCoord);
                        visited[newCoord[0]+2][newCoord[1]+2] =1;
                    }

                }
            }
            steps++;
        }
        return steps;
    }
}
