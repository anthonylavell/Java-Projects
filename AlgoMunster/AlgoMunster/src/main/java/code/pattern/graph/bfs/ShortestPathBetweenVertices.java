package code.pattern.graph.bfs;

import java.util.*;

public class ShortestPathBetweenVertices {
    public static void main(String[] args) {
        List<List<Integer>> graph = Arrays.asList(
                Arrays.asList(1,4),
                Arrays.asList(0,2),
                Arrays.asList(1,3),
                Arrays.asList(2,4,5),
                Arrays.asList(0,3),
                Arrays.asList(3,6,9),
                Arrays.asList(5,8),
                Arrays.asList(8,9),
                Arrays.asList(6,7),
                Arrays.asList(5,7)
        );
        int a = 0;
        int b =7;
        System.out.println(shortestPath(graph,a,b));
    }
    public static int shortestPath(List<List<Integer>> graph, int start, int end) {
        // WRITE YOUR BRILLIANT CODE HERE
        Deque<Integer> deque = new ArrayDeque<>();
        deque.add(start);
        Set<Integer> visited = new HashSet<>();
        visited.add(start);
        int pathLevel = 0;
        while (!deque.isEmpty()){
            pathLevel++;
            int dequeSize = deque.size();
            while (dequeSize-- > 0) {
                int currentNode = deque.pop();
                for (Integer neighbor : graph.get(currentNode)) {
                    if (neighbor == end) {
                        return pathLevel;
                    }
                   if (visited.add(neighbor)){
                       deque.add(neighbor);
                   }
                }
            }
        }
        return -1;
    }
}
