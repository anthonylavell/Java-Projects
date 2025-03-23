package wayfair.interval;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class InsertInterval {
    public static void main(String[] args) {
        int[][] intervals = {{1,2},{3,5},{6,7},{8,10},{12,16}};
        int[] newInterval = {4,8};
        int[][] intervals2 = {{1,3},{6,9}};
        int[] newInterval2 = {2,5};
        int[][] intervals3 = {{1,5}};
        int[] newInterval3 = {2,7};
        int[][] intervals4 = {{1,5}};
        int[] newInterval4 = {0,0};
        int[][] intervals5 = {{1,5}};
        int[] newInterval5 = {6,8};

        System.out.println(Arrays.deepToString(insert(intervals3,newInterval3)));
    }
    public static int[][] insert(int[][] intervals, int[] newInterval) {
        int[] start = new int[intervals.length+1];
        int[] end = new int[intervals.length+1];
        for(int i = 0; i< intervals.length; i++){
            start[i] = intervals[i][0];
            end[i] = intervals[i][1];
        }
        start[start.length-1]=newInterval[0];
        end[end.length-1]=newInterval[1];
        Arrays.sort(start);
        Arrays.sort(end);
        int sIndex = start[0];
        int eIndex = end[0];
        List<List<Integer>>listOfInt = new ArrayList<>();
        for(int i = 1; i < start.length; i++){
            if(eIndex < start[i]){
                listOfInt.add(new ArrayList<>(Arrays.asList(sIndex,eIndex)));
                sIndex = start[i];
                eIndex = end[i];
            }else {
                eIndex = Math.max(eIndex,end[i]);
            }
        }
        listOfInt.add(new ArrayList<>(Arrays.asList(sIndex,eIndex)));
        int[][] totalArray = new int[listOfInt.size()][listOfInt.get(0).size()];
        for(int i = 0; i < listOfInt.size(); i++){
            totalArray[i][0] = listOfInt.get(i).get(0);
            totalArray[i][1] = listOfInt.get(i).get(1);
        }
        return totalArray;
    }
}
