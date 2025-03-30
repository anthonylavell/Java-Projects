package grinder.graph.bfs;

import java.util.Deque;
import java.util.LinkedList;

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
        Deque<int[]> deque = new LinkedList<>();
        for (int row = 0; row < rooms.length; row++){
            for (int col = 0; col < rooms[row].length; col++){
                if(rooms[row][col] == 0){
                   deque.add(new int[]{row,col});
                }
            }
        }
        int [][] dirs = new int[][]{ {-1,0},{1,0},{0,-1},{0,1}};
        for (int level = 1; !deque.isEmpty(); level++){
            int size = deque.size();
            while (size-- > 0){
                int [] node = deque.pop();
                for(int []dir : dirs){
                    int row = dir[0] + node[0];
                    int col = dir[1] + node[1];
                    if(row < 0 || row >= rooms.length || col < 0 || col >= rooms[row].length || rooms[row][col] != Integer.MAX_VALUE){
                        continue;
                    }
                    rooms[row][col] = level;
                    deque.add(new int[]{row,col});
                }
            }
        }
    }

}
