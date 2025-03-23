package arraysandstrings.array.two_dimensional.merge_intervals.client;

import arraysandstrings.array.two_dimensional.merge_intervals.MergeInterval;

import java.util.Arrays;

public class MergeClient {
    public static void main(String[] args) {
        /*int[][] intervals = {{1,3},
                            {2,6},
                            {8,10},
                            {15,18}
        };*/

       /* int[][] intervals = {{1,3},
                {2,9},
                {8,10},
                {0,18}
        };*/

        /*int[][] intervals = {{1,4},
                {4,5}
        };*/

       /* int[][] intervals = { {1,4},
                {0,2},
                {3,5}
        };*/

        int[][] intervals = {{1,4},
                {0,4}
        };

        //int[][] intervals = {};
        int[][] tempArray = MergeInterval.merge(intervals);
        System.out.println(Arrays.deepToString(tempArray));
    }
}
