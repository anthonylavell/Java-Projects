/*
You are given an m x n grid rooms initialized with these three possible values.

-1 A wall or an obstacle.
0 A gate.
INF Infinity means an empty room. We use the value 231 - 1 = 2147483647 to represent INF
as you may assume that the distance to a gate is less than 2147483647.
Fill each empty room with the distance to its nearest gate. If it is impossible to reach
a gate, it should be filled with INF.
 */
package grinder.graph.bfs;

import java.util.ArrayDeque;
import java.util.Deque;

public class WallsAndGates {
    public static void main(String[] args) {
        int[][] rooms = {
                {2147483647,-1,0,2147483647},
                {2147483647,2147483647,2147483647,-1},
                {2147483647,-1,2147483647,-1},
                {0,-1,2147483647,2147483647}};
        wallsAndGates(rooms);
    }

    public static void wallsAndGates(int[][] rooms) {
        int[][] dirs = { {-1,0},{1,0},{0,-1},{0,1} };
        Deque<int[]>deque = new ArrayDeque<>();
        for(int row = 0; row < rooms.length; row++){
            for(int col = 0; col < rooms[row].length; col++){
                if(rooms[row][col] == 0)
                    deque.add(new int[] {row,col});
            }
        }
        for (int level = 1; !deque.isEmpty(); level++){
            int size = deque.size();
            while (size-- > 0){
                int [] nodes = deque.pop();
                for (int[] dir : dirs) {
                    int row = nodes[0] + dir[0];
                    int col = nodes[1] + dir[1];
                    if (row < 0 || row >= rooms.length || col < 0 || col >= rooms[row].length || rooms[row][col] != Integer.MAX_VALUE) {
                        continue;
                    }
                    deque.add(new int[]{row, col});
                    rooms[row][col] = level;
                }

            }
        }
    }
}
