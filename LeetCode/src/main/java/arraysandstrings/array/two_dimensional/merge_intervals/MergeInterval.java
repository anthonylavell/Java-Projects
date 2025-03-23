package arraysandstrings.array.two_dimensional.merge_intervals;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MergeInterval {
    public static int[][] merge(int[][] intervals) {
        List<int[]>listOfArrays = new ArrayList<>();
        int [] start = new int[intervals.length];
        int [] end = new int[intervals.length];
        for(int i = 0; i < intervals.length; i++){
            start[i] = intervals[i][0];
            end[i] = intervals[i][1];
        }
        Arrays.sort(start);
        Arrays.sort(end);
        int sTime = start[0];
        int eTime = end[0];
        for(int i = 1; i <= intervals.length; i++){
            if(i == intervals.length){
                listOfArrays.add(new int[]{sTime,eTime});
            }else if(eTime >= start[i]) {
                    eTime = end[i];
            }else {
                listOfArrays.add(new int[]{sTime,eTime});
                sTime = start[i];
                eTime = end[i];
            }
        }
        return listOfArrays.toArray(new int[0][]);
    }

    public int[][] merge2(int[][] intervals) {
        Arrays.sort(intervals, (a, b) -> a[0] - b[0]);
        List<int[]>listOfArrays = new ArrayList<>(intervals.length);
        listOfArrays.add(new int[] {intervals[0][0],intervals[0][1]});
        int counter = 0;
        for (int index = 1; index < intervals.length; index++) {
            if (listOfArrays.get(counter)[1] >= intervals[index][0]) {
                if (listOfArrays.get(counter)[1] < intervals[index][1]) {
                    listOfArrays.get(counter)[1] = intervals[index][1];
                }
            } else {
                listOfArrays.add(new int[] {intervals[index][0],intervals[index][1]});
                counter++;
            }
        }

        return listOfArrays.toArray(new int[0][]);
    }
}

