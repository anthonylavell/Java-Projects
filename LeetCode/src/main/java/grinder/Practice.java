package grinder;

import java.util.*;

public class Practice {
    public boolean canFinish(int numCourses, int[][] prerequisites) {
        Map<Integer, List<Integer>> graph = new HashMap<>();
        Map<Integer, Integer> inDegree = new HashMap<>();
        Deque<Integer> deque = new ArrayDeque<>();
        int count = 0;
        for(int[]pre: prerequisites){
            inDegree.putIfAbsent(pre[1], 0);
            inDegree.put(pre[0], inDegree.getOrDefault(pre[0],0) + 1);
            graph.computeIfAbsent(pre[1],k->new ArrayList<>()).add(pre[0]);
        }

        for (Map.Entry<Integer, Integer>entry: inDegree.entrySet()){
            if (entry.getValue() < 1){
                deque.add(entry.getKey());
            }
        }

        while (!deque.isEmpty()){
            int course = deque.poll();
            count++;
            List<Integer> neighbours = graph.getOrDefault(course,new ArrayList<>());
            for(Integer neighbour: neighbours){
                inDegree.put(neighbour, inDegree.get(neighbour) - 1);
                if (inDegree.get(neighbour) == 0){
                    deque.add(neighbour);
                }
            }
        }
        return count == inDegree.size();
    }

    public static void main(String[] args) {
        Practice practice = new Practice();
        int[][] prerequisites = new int[][]{{1,0},{2,1}};
        int numCourses = 3;
        System.out.println(practice.canFinish(numCourses, prerequisites));
    }
}
