package arraysandstrings.array.two_dimensional;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class InsertInterval {
    public static void main(String[] args) {
        int[][] intervals = {{1,3},{6,9},{10,14},{2,7}};
        Arrays.sort(intervals, Comparator.comparingInt(o -> o[0]));
        System.out.println(Arrays.deepToString(intervals));

    }
    public static int[][] insert(int[][] intervals, int[] newInterval) {
        if(newInterval.length == 0){
            return intervals;
        }
        List<List<Integer>> listOfArrays = new ArrayList<>();
        int start = newInterval[0];
        int end = newInterval[1];
        listOfArrays.add(new ArrayList<>(Arrays.asList(start,end)));
        int index = 0;
        for(int row = 0; row < intervals.length; row++){
            if((intervals[row][1] < start)){
                listOfArrays.add(index++,new ArrayList<>(Arrays.asList(intervals[row][0],intervals[row][1])));
            }  else if((intervals[row][0] > end)) {
                listOfArrays.add(new ArrayList<>(Arrays.asList(intervals[row][0],intervals[row][1])));
            }else {
                start = Math.min(start,intervals[row][0]);
                end = Math.max(end,intervals[row][1]);
                listOfArrays.set(index,new ArrayList<>(Arrays.asList(start,end)));
            }

        }
        if(listOfArrays.size()>0){
            intervals = new int[listOfArrays.size()][2];
            for(int row = 0; row < intervals.length; row++){
                intervals[row][0] = listOfArrays.get(row).get(0);
                intervals[row][1] = listOfArrays.get(row).get(1);
            }
        }
        return intervals;
    }
}
