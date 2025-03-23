package arraysandstrings.array.two_dimensional;

import java.util.Arrays;

public class MeetingRooms {
    public static void main(String[] args) {
        int [][]intervals = {{0,30},{5,10},{15,20}};
        canAttendMeetings(intervals);
    }

    public static boolean canAttendMeetings(int[][] intervals) {
        int [] start = new int[intervals.length];
        int [] end = new int[intervals.length];
        for(int i = 0; i < intervals.length; i++){
            start[i] = intervals[i][0];
            end[i] = intervals[i][1];
        }
        Arrays.sort(start);
        Arrays.sort(end);
        int startIndex = 0;
        int endIndex = 0;
        while (startIndex < start.length){
            if(startIndex == endIndex){
                startIndex++;
            }else if(end[endIndex] > start[startIndex]){
                return false;
            }else {
                endIndex++;
            }
        }

        return true;
    }
}
