package grinder.arrays.multi_Dim;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class InsertInterval {

    public static int[][] insert2(int[][] intervals, int[] newInterval) {
        List<int[]>listOfTimes = new ArrayList<>();
        int [] sTime = new int[intervals.length+1];
        int [] eTime = new int[intervals.length+1];
        sTime[sTime.length-1] = newInterval[0];
        eTime[eTime.length-1] = newInterval[1];
        for (int row = 0; row < intervals.length; row++){
            sTime[row] = intervals[row][0];
            eTime[row] = intervals[row][1];
        }
        Arrays.sort(sTime);
        Arrays.sort(eTime);
        int startIdx = 0;
        for (int endIdx = 1; endIdx <= sTime.length; endIdx++){
            if (endIdx==sTime.length || sTime[endIdx]>eTime[endIdx-1]){
                listOfTimes.add(new int[]{sTime[startIdx],eTime[endIdx-1]});
                startIdx = endIdx;
            }
        }
        return listOfTimes.toArray(new int[0][]);
    }

    public static void main(String[] args) {
        int [][] intervals = {{}};
        int [] newInterval = {2,5};
        System.out.println(Arrays.deepToString(insert(intervals,newInterval)));

    }

    public static int[][] insert(int[][] intervals, int[] newInterval) {
        List<List<Integer>> lists = new ArrayList<>();
        int start = newInterval[0];
        int end = newInterval[1];

        for (int index = 0; index <= intervals.length; index++){
            if(index == intervals.length || end < intervals[index][0]){
                lists.add(new ArrayList<>(Arrays.asList(start,end)));
                if (index < intervals.length) {
                    start = intervals[index][0];
                    end = intervals[index][1];
                }
            } else if (start > intervals[index][1]) {
                lists.add(new ArrayList<>(Arrays.asList(intervals[index][0],intervals[index][1])));
            } else {
                start = Math.min(start,intervals[index][0]);
                end = Math.max(end,intervals[index][1]);
            }
        }
        int[][] insertInterval= new int[lists.size()][lists.get(0).size()];
        for (int index = 0; index <= lists.size(); index++){
            insertInterval[index][0] = lists.get(index).get(0);
            insertInterval[index][1] = lists.get(index).get(1);
        }
        return insertInterval;
    }
}
