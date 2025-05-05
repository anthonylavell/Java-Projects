package grinder.graph.kahn;

import java.util.*;

public class SequenceReconstruction {
    public static void main(String[] args) {
        int [] nums = {1,2,3};
        /*List<List<Integer>> sequences = Arrays.asList(
                new ArrayList<>(Arrays.asList(1,2)),
                new ArrayList<>(Arrays.asList(1,3)),
                new ArrayList<>(Arrays.asList(2,3))
        );*/
        /*int [] nums = {4,1,5,2,6,3};
       List<List<Integer>> sequences = Arrays.asList(
                new ArrayList<>(Arrays.asList(5,2,6,3)),
                new ArrayList<>(Arrays.asList(4,1,5,2))
        );*/

         List<List<Integer>> sequences = Arrays.asList(
                new ArrayList<>(Arrays.asList(1,2)),
                new ArrayList<>(Arrays.asList(1,3))
        );
        System.out.println(sequenceReconstruction(nums,sequences));

    }
    public static boolean sequenceReconstruction(int[] nums, List<List<Integer>> sequences) {
        Map<Integer,Integer> indirect = new HashMap<>(nums.length);
        Map<Integer,List<Integer>>graph = new HashMap<>();
        Deque<Integer> deque = new ArrayDeque<>();
        for (int num : nums){
            indirect.put(num,0);
        }
        for (List<Integer>row : sequences) {
            for (int index = 0; index < row.size()-1; index++) {
                if (!graph.containsKey(row.get(index))) {
                    graph.put(row.get(index), new ArrayList<>());
                }
                int i = row.get(index);
                int i2 = row.get(index+1);
                graph.get(row.get(index)).add(row.get((index+1)));
                indirect.put(row.get((index+1)), (indirect.get(row.get(index+1)) + 1));
            }
        }
        for (Map.Entry<Integer,Integer> key : indirect.entrySet()){
            if (key.getValue() < 1){
                deque.add(key.getKey());
            }
        }

        while (!deque.isEmpty()){
            if (deque.size() > 1){
                return false;
            }
            int size = deque.size();
            while (size-- > 0){
                int key = deque.pop();
                List<Integer> indirectKeys = graph.containsKey(key) ? graph.get(key) : new ArrayList<>();
                for (Integer indrectKey : indirectKeys){
                    indirect.put(indrectKey,indirect.get(indrectKey)-1);
                    if (indirect.get(indrectKey) < 1){
                        deque.add(indrectKey);
                    }
                }
            }

        }

            return true;
    }
}
