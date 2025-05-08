package grinder.graph.kahn;

import java.util.*;

public class CourseSchedule {
    public static void main(String[] args) {
        int numCourse = 2;
        int[][] prerequisites = {{0,10}};
        System.out.println(canFinish(numCourse,prerequisites));

    }
    public static boolean canFinish(int numCourses, int[][] prerequisites) {
        Map<Integer,Integer>indirect=new HashMap<>();
        Map<Integer, List<Integer>>graph=new HashMap<>();
        Deque<Integer>deque = new ArrayDeque<>();
        int numOfPopElement = 0;

        for (int[]row : prerequisites){
            indirect.computeIfAbsent(row[0], k ->0);
            indirect.computeIfAbsent(row[1], k ->0);
            graph.computeIfAbsent(row[1],k->new ArrayList<>()).add(row[0]);
            indirect.put(row[0],indirect.get(row[0])+1);
        }

        for (Map.Entry<Integer,Integer>entry : indirect.entrySet()){
            if (entry.getValue()<1){
                deque.add(entry.getKey());
            }
        }

        while (!deque.isEmpty()){
            int current = deque.pop();
            numOfPopElement++;
            List<Integer>list = graph.getOrDefault(current,new ArrayList<>());
            for (int key : list){
                indirect.put(key,(indirect.get(key))-1);
                if(indirect.get(key) == 0){
                    deque.add(key);
                }
            }
        }
        return numOfPopElement == indirect.size();
    }
}
