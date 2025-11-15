package comp_p.pay_pal;

import java.util.Comparator;
import java.util.PriorityQueue;

public class LastStoneWeight {
    public static int lastStoneWeight(int[] stones) {
        PriorityQueue<Integer>queue = new PriorityQueue<>(Comparator.reverseOrder());
        for (int stone : stones){
            queue.add(stone);
        }
        while (queue.size() > 1){
            int sum = queue.poll()- queue.poll();
            queue.add(sum);
        }
        return queue.poll();
    }

    public static void main(String[] args) {
        int [] stones = {2,7,4,1,8,1};
        System.out.println(lastStoneWeight(stones));
    }
}
