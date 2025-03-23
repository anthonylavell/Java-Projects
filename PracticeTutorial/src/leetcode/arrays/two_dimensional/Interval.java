package leetcode.arrays.two_dimensional;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class Interval {
    public static int[][] merge(int[][] intervals) {
        if(intervals.length <=1 ){
            return intervals;
        }
        Arrays.sort(intervals, Comparator.comparingInt(o -> o[0]));
        List<List<Integer>> list2D = new ArrayList<>();
        int startIndex = intervals[0][0];
        int endIndex = intervals[0][1];
        for(int row = 0; row < intervals.length; row++){
            if(row >=intervals.length-1) {
                list2D.add(new ArrayList<>(Arrays.asList(startIndex,
                        endIndex)));

            }else if(endIndex < intervals[(row+1)][0] || startIndex > intervals[(row+1)][1]){
                list2D.add(new ArrayList<>(Arrays.asList(startIndex,
                        endIndex)));
                startIndex = intervals[row+1][0];
                endIndex = intervals[row+1][1];
            }else {
                if(intervals[row+1][0] < startIndex){
                    startIndex = intervals[row+1][0];
                }
                if(intervals[row+1][1] > endIndex){
                    endIndex = intervals[row+1][1];
                }
            }
        }
        int [][] temp2DArray = new int[list2D.size()][list2D.get(0).size()];
        for(int row = 0; row < list2D.size(); row++){
            temp2DArray[row][0]=list2D.get(row).get(0);
            temp2DArray[row][1]=list2D.get(row).get(1);
        }
        return temp2DArray;

    }
}
