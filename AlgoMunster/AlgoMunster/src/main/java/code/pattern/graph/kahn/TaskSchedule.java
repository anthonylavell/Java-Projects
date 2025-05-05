/*
For this problem, given a list of tasks and a list of requirements,
compute a sequence of tasks that can be performed, such that we complete
every task once while satisfying all the requirements.

Each requirement will be in the form of a list [a, b], where task a needs
to be completed first before task b can be completed,

There is guaranteed to be a solution.

Examples
Example 1
Input:
tasks = ["a", "b", "c", "d"]
requirements = [["a", "b"], ["c", "b"], ["b", "d"]]
Output: ["a", "c", "b", "d"]
 */
package code.pattern.graph.kahn;

import java.util.*;

public class TaskSchedule {
    public static void main(String[] args) {
        /*List<String> tasks = Arrays.asList("a", "b", "c", "d");
        List<List<String>> requirements = Arrays.asList(
                new ArrayList<>(Arrays.asList("a", "b")),
                new ArrayList<>(Arrays.asList("c", "b")),
                new ArrayList<>(Arrays.asList("b", "d"))
        );*/
        List<String> tasks = Arrays.asList("abbreviate","bricks","cardinals","dextrous","fibre","green","height");
        List<List<String>> requirements = Arrays.asList(
                new ArrayList<>(Arrays.asList("abbreviate","bricks")),
                new ArrayList<>(Arrays.asList("cardinals", "bricks")),
                new ArrayList<>(Arrays.asList("dextrous", "bricks")),
                new ArrayList<>(Arrays.asList("bricks","fibre")),
                new ArrayList<>(Arrays.asList("green","fibre"))
        );
        System.out.println(taskScheduling(tasks,requirements));
    }

    public static List<String> taskScheduling(List<String> tasks, List<List<String>> requirements) {
        List<String>schedule = new ArrayList<>();
        Map<String,Integer>indirect = new HashMap<>();
        Map<String,String> graph = new HashMap<>();
        Deque<String> deque = new ArrayDeque<>();
        for (String task : tasks){
            indirect.put(task, 0);
        }

        for (List<String> row : requirements){
            graph.put(row.get(0),row.get(1));
            indirect.put(row.get(1),indirect.get(row.get(1))+1);
        }
        for (Map.Entry<String,Integer>key : indirect.entrySet()){
            if (key.getValue() < 1){
                deque.add(key.getKey());
            }
        }

        while (!deque.isEmpty()) {
            int size = deque.size();
            while (size-- > 0) {
                String str = deque.pop();
                schedule.add(str);
                String key = graph.getOrDefault(str,"");
                if(!key.isEmpty()){
                    indirect.put(key, indirect.get(key) -1);
                    if (indirect.get(key) < 1){
                        deque.add(key);
                    }
                }

            }
        }
        return schedule;
    }
}
