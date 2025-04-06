package code.pattern.graph.bfs;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.List;

public class WallsAndGates {
    public static void main(String[] args) {

    }

    public static List<List<Integer>> mapGateDistances(List<List<Integer>> dungeonMap) {
        // WRITE YOUR BRILLIANT CODE HERE
        int[][] dirs = {{-1, 0}, {1, 0}, {0, -1}, {0, 1}};
        Deque<int[]> deque = new ArrayDeque<>();
        for (int row = 0; row < dungeonMap.size(); row++) {
            for (int col = 0; col < dungeonMap.get(row).size(); col++) {
                if (dungeonMap.get(row).get(col) == 0)
                    deque.add(new int[]{row, col});
            }
        }
        for (int level = 1; !deque.isEmpty(); level++) {
            int size = deque.size();
            while (size-- > 0){
                int [] nodes = deque.pop();
                for (int[] dir : dirs) {
                    int row = nodes[0] + dir[0];
                    int col = nodes[1] + dir[1];
                    if (row < 0 || row >= dungeonMap.size() || col < 0 || col >= dungeonMap.get(row).size() || dungeonMap.get(row).get(col) != Integer.MAX_VALUE) {
                        continue;
                    }
                    deque.add(new int[]{row, col});
                    dungeonMap.get(row).set(col,level);
                }

            }
        }
        return dungeonMap;
    }
}
