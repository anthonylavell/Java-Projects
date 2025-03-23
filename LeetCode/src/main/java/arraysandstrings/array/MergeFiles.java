package arraysandstrings.array;

import java.util.Collections;
import java.util.List;
import java.util.PriorityQueue;

public class MergeFiles {
  public static int minimumTime(int numOfSubFiles, List<Integer> files){
      Collections.sort(files);
      int result = (files.get(0) + files.get(1));
      int sum = result;
      for(int count = 2; count < (numOfSubFiles); count++){
          int total =  files.get(count);
         result += files.get(count);
         sum+=result;

      }
      return sum;
  }
    public static int minimumTime2(int numOfSubFiles, List<Integer> files) {
        // create a min heap
        PriorityQueue<Integer> priorityQueue
                = new PriorityQueue<>();

        for (int i = 0; i < numOfSubFiles; i++) {

            // add sizes to priorityQueue
            priorityQueue.add(files.get(i));
        }

        // variable to count total computations
        int count = 0;

        while (priorityQueue.size() > 1) {
            // pop two smallest size element
            // from the min heap
            int temp = priorityQueue.poll() + priorityQueue.poll();

            // add the current computations
            // with the previous one's
            count += temp;

            // add new combined file size
            // to priority queue or min heap
            priorityQueue.add(temp);
        }

        return count;
    }




}
