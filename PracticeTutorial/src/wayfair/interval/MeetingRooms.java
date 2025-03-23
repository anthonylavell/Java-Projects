package wayfair.interval;

import java.util.Arrays;
import java.util.Comparator;

public class MeetingRooms {
    public static void main(String[] args) {
        int[][] intervals = {{5,10},{10,20},{6,9}};
        int[][] intervals2 = {{7,10},{2,4}};
        int[][] intervals5 = {{5,8},{6,8}};
        System.out.println(canAttendMeetings(intervals2));
    }

    public static boolean canAttendMeetings(int[][] intervals) {
        //sortTwoDimensionalArray(intervals);
        int[] start = new int[intervals.length];
        int[] end = new int[intervals.length];
        int index = 0;
        for (int[] cur : intervals) {
            start[index] = cur[0];
            end[index++] = cur[1];
        }
        Arrays.sort(start);
        Arrays.sort(end);
        for(int row = 1; row <intervals.length;row++){
                //int lastMeetingEndTime = intervals[row][intervals[0].length-1];
                if(end[row-1]>start[row]){
                    return false;
                }
        }
        return true;
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
