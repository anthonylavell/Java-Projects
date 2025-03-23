package arraysandstrings.array.two_dimensional;

import java.util.*;

public class CourseSchedule {
    public static void main(String[] args) {
        int numCourses = 2;
        //int[][] prerequisites = {{1,0},{0,2},{2,1}}; //
        //int[][] prerequisites = {{0,1},{1,3},{2,1},{1,5}}; //false
        //int[][] prerequisites = {{0,1}}; //true
        int[][] prerequisites = {{1,0}}; //true
        System.out.println(prerequisites.length);
        //System.out.println(canFinish(numCourses,prerequisites));
        int [] num = null;
        boolean isNumNull = num == null;
    }
    public static boolean canFinish(int numCourses, int[][] prerequisites) {
        Map<Integer, List<Integer>> mapOfInts = new HashMap<>();
        int [] inDegreeArray = new int[numCourses];
        Queue<Integer> queueOfInts = new ArrayDeque<>();
        int numOfPopElements = 0;

        for(int [] pre : prerequisites){
            if(!mapOfInts.containsKey(pre[0]) || mapOfInts.get(pre[0]) == null){
                mapOfInts.put(pre[0],new ArrayList<>());
            }
            if(!mapOfInts.containsKey(pre[1])){
                mapOfInts.put(pre[1],new ArrayList<>());
            }
            mapOfInts.get(pre[0]).add(pre[1]);
            inDegreeArray[pre[1]]++;
        }

        for(Integer key : mapOfInts.keySet()){
            if(inDegreeArray[key] == 0){
                queueOfInts.add(key);
            }
        }

        while (!queueOfInts.isEmpty()){
            int key = queueOfInts.poll();
            numOfPopElements++;
                for (int count: mapOfInts.get(key)){
                        if(--inDegreeArray[count] == 0){
                            queueOfInts.add(count);
                        }
                }
        }
        return numOfPopElements == mapOfInts.size();

    }
}
