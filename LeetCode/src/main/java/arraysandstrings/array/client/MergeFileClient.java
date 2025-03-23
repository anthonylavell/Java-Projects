package arraysandstrings.array.client;

import arraysandstrings.array.MergeFiles;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MergeFileClient {
    public static void main(String[] args) {

        int num = 4;
        List<Integer> files = new ArrayList<>(Arrays.asList(4,8,6,12));
        //System.out.println(MergeFiles.minimumTime(num,files));
         System.out.println(MergeFiles.minimumTime2(num,files));

         /*PriorityQueue<Integer> pq
                = new PriorityQueue<Integer>(files);
       while (!pq.isEmpty()){
            System.out.println("First poll "+ pq.poll() + " Second poll "+pq.poll());
        }*/


    }
}
