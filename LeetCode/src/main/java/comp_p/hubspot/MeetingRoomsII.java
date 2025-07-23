package comp_p.hubspot;

import java.util.Arrays;
import java.util.Comparator;

public class MeetingRoomsII {
    public static void main(String[] args) {
        int[][] intervals = {{2,15},{36,45},{9,29},{16,23},{4,9} };;
        System.out.println(Arrays.deepToString(intervals));
        Arrays.sort(intervals, Comparator.comparingInt(a->a[0]));
        System.out.println(Arrays.deepToString(intervals));
        System.out.println(minMeetingRooms(intervals));
    }

    public static int minMeetingRooms(int[][] intervals) {
        int [] sTime = new int[intervals.length];
        int [] eTime = new int[intervals.length];
        int numOfRooms = 1;
        for (int index = 0; index < intervals.length; index++){
            sTime[index] = intervals[index][0];
            eTime[index] = intervals[index][1];
        }
        Arrays.sort(sTime);
        Arrays.sort(eTime);
        int endTimeIndx = 0;
        for (int index = 1; index < sTime.length; index++){
            if (eTime[endTimeIndx] > sTime[index]){
                numOfRooms++;
            }else {
                endTimeIndx++;
            }
        }
        return numOfRooms;
    }
}
