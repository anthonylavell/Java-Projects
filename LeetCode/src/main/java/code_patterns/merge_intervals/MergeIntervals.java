package code_patterns.merge_intervals;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/*
Given an array of intervals where intervals[i] = [starti, endi],
merge all overlapping intervals, and return an array of the
non-overlapping intervals that cover all the intervals in the input.
 */
public class MergeIntervals {
    public static void main(String[] args) {
        int[][] intervals = {
                {1,3},
                {2,6},
                {8,10},
                {15,18}
        };

        int[][] intervals2 = {
                {1,4},
                {4,5}
        };

        int[][] intervals3 = {
                {1,6},
                {2,8},
                {3,8},
                {4,10},
                {7,11}
        };

        int[][] intervals4 = {
                {1,6},
                {2,8},
                {3,8},
                {4,10},
                {7,11},
                {12,13}
        };

        int[][] intervals5 = {
                {15,18}
        };

        int[][] intervals6 = {
                {1,4},
                {4,5},
                {0,1}
        };

        int[][] intervals7 = {{2,3},{4,5},{6,7},{8,9},{1,10}};
        int[][] intervalsResult2 = merge(intervals);
    }

    public static int[][] merge(int[][] intervals) {
        List<int[]> tempList = new ArrayList<>();
        int [] start = new int[intervals.length];
        int [] end = new int[intervals.length];
        int sTime = 0;
        int eTime = 0;
        for(int index = 0; index < intervals.length; index++){
            start[index] = intervals[index][0];
            end[index] = intervals[index][1];
        }
        Arrays.sort(start);
        Arrays.sort(end);
        for (int index = 1; index < start.length; index++){
            if(end[eTime] < start[index]) {
                tempList.add(new int[]{start[sTime],end[eTime]});
                sTime = index;
            }

            if (index == start.length-1){
                tempList.add(new int[]{start[sTime],end[index]});
            }
            eTime++;
        }

        return (intervals.length < 2) ? intervals : tempList.toArray(new int[tempList.size()][2]);
    }

    public static int[][] merge2(int[][] intervals) {
        int[][] tempArray = new int[intervals.length][intervals[0].length];
        int [] start = new int[intervals.length];
        int [] end = new int[intervals.length];
        int counter = 0;
        int sTime = 0;
        int eTime = 0;
        for(int index = 0; index < intervals.length; index++){
            start[index] = intervals[index][0];
            end[index] = intervals[index][1];
        }
        Arrays.sort(start);
        Arrays.sort(end);
       for (int index = 1; index < start.length; index++){
            if(end[eTime] < start[index]) {
                tempArray[counter][0] = start[sTime];
                tempArray[counter][1] = end[eTime];
                sTime = index;
                counter++;
                }

            if (index == start.length-1){
                tempArray[counter][0] = start[sTime];
                tempArray[counter][1] = end[index];
                counter++;
            }
            eTime++;
        }

       int [][] resultArray = new int[counter][2];
       for(int index = 0; index < counter; index++){
           resultArray[index][0] = tempArray[index][0];
           resultArray[index][1] = tempArray[index][1];
       }

        return (intervals.length < 2) ? intervals : resultArray;
    }
}
