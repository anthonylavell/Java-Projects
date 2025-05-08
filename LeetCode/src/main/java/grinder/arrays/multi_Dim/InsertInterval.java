package grinder.arrays.multi_Dim;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class InsertInterval {
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
