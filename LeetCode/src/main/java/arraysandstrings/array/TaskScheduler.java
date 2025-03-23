package arraysandstrings.array;

import java.util.*;

public class TaskScheduler {
    public static void main(String[] args) {
        //char[] tasks = {'A','A','B','B','B'};
        //char[] tasks = {'A','A','A','A','A','A','B','C','D','E','F','G'};
        //char[] tasks = {'A','A','A','B','B','B','C','C','C','D','D','E'};
        char[] tasks = {'A','A','A','B','B','B'};
        int n = 2;
        System.out.println(leastInterval(tasks,n));
        PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());
    }

    public static int leastInterval(char[] tasks, int n) {
        int[] inDegreeArray = new int[26];
        PriorityQueue<Integer>  maxHeap = new PriorityQueue<>((a, b) -> b - a);
        int cycles = 0;
        for(char ch : tasks){
            inDegreeArray[ch -'A']++;
        }
       for(int i = 0; i < inDegreeArray.length; i++){
           if(inDegreeArray[i] > 0){
               maxHeap.add(inDegreeArray[i]);
           }
       }
        while (!maxHeap.isEmpty()){
            List<Integer> storage = new ArrayList<>();
            for(int index = 0; index < n+1 && !maxHeap.isEmpty() ; index++){
                    storage.add(maxHeap.poll());
            }
            for(Integer num : storage){
                if(--num > 0){
                    maxHeap.add(num);
                }
            }
            int sum = Math.abs(storage.size() - (n+1));
            cycles+= (sum == 0 || maxHeap.isEmpty()) ? storage.size() : storage.size()+sum;

        }

        return cycles;
    }

    public static int leastInterval2(char[] tasks, int n) {
        int [] numChar = new int [26];
        int countMaxChar = 0;

        int maxFreq = 0;
        for (int i = 0; i < tasks.length; i++) {
            int index = tasks[i] - 'A';
            numChar[index]++;
        }

        for (int i = 0; i < 26; i++) {
            if (maxFreq < numChar[i]) {
                maxFreq = numChar[i];
            }
        }

        for (int i = 0; i < 26; i++) {
            if (numChar[i] == maxFreq)
                countMaxChar++;
        }

        return Math.max(tasks.length, ((n + 1) * (maxFreq - 1)) + countMaxChar);
    }
}
