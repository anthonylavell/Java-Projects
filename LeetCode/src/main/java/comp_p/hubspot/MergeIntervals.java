package comp_p.hubspot;

import java.util.*;

public class MergeIntervals {
    public static void main(String[] args) {
        int[][] intervals = {{1,3},{2,6},{8,10},{15,18}};
        int[][] intervals2 = {{2,3},{4,5},{6,7},{8,9},{1,10}};
        System.out.println(Arrays.deepToString(merge(intervals)));
        //System.out.println(Arrays.deepToString(merge(intervals2)));
    }
    public static int[][] merge(int[][] intervals) {
        int[]sTime= new int[intervals.length];
        int[]eTime= new int[intervals.length];
        List<int[]> lstOfTimes= new ArrayList<>();
        for (int index = 0; index < intervals.length; index++){
            sTime[index] = intervals[index][0];
            eTime[index] = intervals[index][1];
        }
        Arrays.sort(sTime);
        Arrays.sort(eTime);
        int sIndex = 0;
        for (int eIndex = 0; eIndex < eTime.length; eIndex++){
             if ((eIndex == sTime.length-1) || eTime[eIndex] < sTime[eIndex+1]){
                 lstOfTimes.add(new int[] {sTime[sIndex],eTime[eIndex]});
                 sIndex = eIndex+1;
             }
        }
        int[][] merge = new int[lstOfTimes.size()][2];
        for (int index = 0; index < merge.length; index++){
            merge[index] = lstOfTimes.get(index);
        }
        return merge;
    }
}
