package arraysandstrings.array.two_dimensional;

import java.util.*;

public class CourseScheduleII {
    public static void main(String[] args) {
        Set<Integer> setOfInt = new HashSet<>(4);
        int numCourses = 2;
        findOrder(numCourses,new int[0][0]);
    }
    public static int[] findOrder(int numCourses, int[][] prerequisites) {
        int[] storedCourses = new int[numCourses];
        Queue<Integer> queueOfCourse = new ArrayDeque<>();
        Map<Integer, List<Integer>> mapOfInt = new HashMap<>();
        int[] arrayOfInts = new int[numCourses];
        for(int[] pre : prerequisites){
            if(!mapOfInt.containsKey(pre[1])){
                mapOfInt.put(pre[1],new ArrayList<>());
            }
            if(!mapOfInt.containsKey(pre[0])){
                mapOfInt.put(pre[0],new ArrayList<>());
            }
            mapOfInt.get(pre[1]).add(pre[0]);
            storedCourses[pre[0]]++;
        }

        for(int index = numCourses-1; index >=0; index--){
            if(!mapOfInt.containsKey(index)){
                mapOfInt.put(index,new ArrayList<>());
            }
            if(storedCourses[index] == 0){
                queueOfCourse.add(index);
            }
        }
        int count = 0;
        while (!queueOfCourse.isEmpty()){
            int course = queueOfCourse.poll();
            arrayOfInts[count++] = course;
            for (int index : mapOfInt.get(course)){
                if(--storedCourses[index] == 0){
                    queueOfCourse.add(index);
                }

            }
        }

        return (count == storedCourses.length) ? arrayOfInts: new int []{};

    }
}
