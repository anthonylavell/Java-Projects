package comp_p.capital_one.powerday;

import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Deque;

public class MergeInterval {
    public static void main(String[] args) {

    }

    public static int[][] merge(int[][] intervals) {
        int[] sTimes = new int[intervals.length];
        int[] eTimes = new  int[intervals.length];
        Deque<int[]> queue = new ArrayDeque<>();
        int leftIdx = 0;
        for (int index = 0; index < intervals.length; index++){
            sTimes[index] = intervals[index][0];
            eTimes[index] = intervals[index][1];
        }
        Arrays.sort(sTimes);
        Arrays.sort(eTimes);
        for (int rightIdx = 1; rightIdx <= eTimes.length; rightIdx++){
            if (rightIdx==eTimes.length || eTimes[rightIdx-1] < sTimes[rightIdx]){
                queue.add(new int[]{sTimes[leftIdx],eTimes[rightIdx-1]});
                leftIdx=rightIdx;
            }
        }
        int[][] nTime = new int[queue.size()][2];
        for (int index = 0; !queue.isEmpty(); index++){
            nTime[index] = queue.poll();
        }
        return nTime;
    }
}
