/*
There are a total of numCourses courses you have to take, labeled from 0 to numCourses - 1. Y
ou are given an array prerequisites where prerequisites[i] = [ai, bi] indicates that you must
take course bi first if you want to take course ai.

For example, the pair [0, 1], indicates that to take course 0 you have to first take course 1.
Return true if you can finish all courses. Otherwise, return false.



Example 1:

Input: numCourses = 2, prerequisites = [[1,0]]
Output: true
Explanation: There are a total of 2 courses to take.
To take course 1 you should have finished course 0. So it is possible.
Example 2:

Input: numCourses = 2, prerequisites = [[1,0],[0,1]]
Output: false
Explanation: There are a total of 2 courses to take.
To take course 1 you should have finished course 0, and to take course 0 you should also have
finished course 1. So it is impossible.


Constraints:

1 <= numCourses <= 2000
0 <= prerequisites.length <= 5000
prerequisites[i].length == 2
0 <= ai, bi < numCourses
All the pairs prerequisites[i] are unique.
 */

package grinder.graph.kahn;

import java.util.*;

public class CourseSchedule {
    public static boolean canFinish(int numCourses, int[][] prerequisites) {
        Map<Integer,Integer>indirect=new HashMap<>();
        Map<Integer, List<Integer>>graph=new HashMap<>();
        Deque<Integer>deque = new ArrayDeque<>();
        int numOfCourses = 0;

        for (int[]row : prerequisites){
            int a = row[0];
            int b = row[1];
            indirect.put(a, indirect.getOrDefault(a,0)+1);
            indirect.putIfAbsent(b, 0);
            graph.computeIfAbsent(b,k->new ArrayList<>()).add(a);
        }

        for (Map.Entry<Integer,Integer>entry : indirect.entrySet()){
            if (entry.getValue()<1){
                deque.add(entry.getKey());
            }
        }

        while (!deque.isEmpty()){
            int current = deque.pop();
            numOfCourses++;
            List<Integer>courses = graph.getOrDefault(current,new ArrayList<>());
            for (int course : courses){
                indirect.put(course,(indirect.get(course))-1);
                if(indirect.get(course) == 0){
                    deque.add(course);
                }
            }
        }
        return numOfCourses == indirect.size();
    }

    public static void main(String[] args) {
        int numCourse = 2;
        int[][] prerequisites = {{0,10}};
        System.out.println(canFinish(numCourse,prerequisites));

    }
}
