package wayfair.interval;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class MergeIntervals {
    public static void main(String[] args) {
        int[][] intervals = {{1,3},{8,10},{15,18},{2,6}};
        int[][] intervals2 = {{1,4},{4,5}};
        int[][] intervals7 = {{2,11},{6,16},{11,16}};
        int[][] intervals3 = {{5,8},{6,8}};
        System.out.println(Arrays.deepToString(merge(intervals3)));
    }

    public static int[][] merge(int[][] intervals) {
        sortTwoDimensionalArray(intervals);
        List<List<Integer>>listOfInt = new ArrayList<>();
        int start = intervals[0][0];
        int end = intervals[0][1];
        for(int i = 1; i < intervals.length; i++){
            if(intervals[i][0] <= end){
                end = Math.max(end,intervals[i][1]);
            }else {
                listOfInt.add(new ArrayList<>(Arrays.asList(start,end)));
                start = intervals[i][0];
                end = intervals[i][1];
            }
        }
        if(listOfInt.isEmpty() || listOfInt.get(listOfInt.size()-1).get(0) != start){
            listOfInt.add(new ArrayList<>(Arrays.asList(start,end)));
        }
        int[][] merge = new int[listOfInt.size()][listOfInt.get(0).size()];
        for(int i = 0; i < listOfInt.size(); i++){
            merge[i][0]=listOfInt.get(i).get(0);
            merge[i][1]=listOfInt.get(i).get(1);
        }
        return merge;
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
