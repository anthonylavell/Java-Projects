package grinder.arrays.multi_Dim;

import java.util.Arrays;

public class NonOverlappingIntervals {
    public static void main(String[] args) {
        int[][] intervals4 =  {{-52,31},{-73,-26},{82,97},{-65,-11},{-62,-49},{95,99},{58,95},{-31,49},{66,98},{-63,2},{30,47},{-40,-26}};
        System.out.println(eraseOverlapIntervals(intervals4));
    }
    public static int eraseOverlapIntervals(int[][] intervals) {
        int[] sTime = new int[intervals.length];
        int[] eTime = new int[intervals.length];
        int count = 0;
        int eCount = 0;
        Arrays.sort(intervals,(a,b) -> Integer.compare(a[1], b[1]));
        for (int index = 0; index < intervals.length; index++){
            sTime[index] = intervals[index][0];
            eTime[index] = intervals[index][1];
        }
        for (int sCount = 1; sCount < sTime.length; sCount++){
            if (eTime[eCount]>sTime[sCount]){
                count++;
            }else {
                eCount = sCount;
            }
        }
        return count;
    }
}
