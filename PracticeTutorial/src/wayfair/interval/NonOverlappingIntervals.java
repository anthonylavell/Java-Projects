package wayfair.interval;

import java.util.Arrays;
import java.util.Comparator;

public class NonOverlappingIntervals {
    public static void main(String[] args) {
        int [][] intervals = {{1,2},{2,3},{3,4},{1,3}};
        int [][] intervals2 ={{1,2},{2,3},{3,4},{2,5},{2,4}};
        int [][] intervals3 ={{2,5}};
        int [][] intervals4 = {{0,2},{1,3},{2,4},{3,5},{4,6}};
        int [][] intervals5 ={{-52,31},{-73,-26},{82,97},{-65,-11},{-62,-49},{95,99},{58,95},{-31,49},{66,98},{-63,2},{30,47},{-40,-26}};
        System.out.println(eraseOverlapIntervals(intervals5));
    }

    public static int eraseOverlapIntervals(int[][] intervals) {
       int count = 0;
       sortTwoDimensionalArray(intervals);
       int endCounter = 0;
       for(int i = 1; i < intervals.length; i++){
           if(intervals[endCounter][1] > intervals[i][0]){
               count++;
               if(intervals[i][1] < intervals[endCounter][1]){
                   endCounter=i;
               }
           }else {
               endCounter=i;
           }
       }

        return count;
    }

    private static void sortTwoDimensionalArray(int[][] intervals){
        Arrays.sort(intervals, new Comparator<int[]>() {
            @Override
            //arguments to this method represent the arrays to be sorted
            public int compare(int[] o1, int[] o2) {
                //get the item ids which are at index 0 of the array
                Integer itemIdOne = o1[0];
                Integer itemIdTwo = o2[0];
                // sort on item id
                return itemIdOne.compareTo(itemIdTwo);
            }
        });

    }
}
