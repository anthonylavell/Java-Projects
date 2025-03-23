package wayfair.interval;

import java.util.Arrays;

public class MeetingRooms2 {
    public static void main(String[] args) {
        int[][] intervals = {{0,30},{5,10},{15,20}};
        int[][] intervals2 = {{7,10},{2,4}};
        int[][] intervals3 = {{5,8},{6,8}};
        int[][] intervals4 = {{2,4},{6,8},{7,10},{11,15}};
        int[][] intervals5 = {{0,10},{9,20},{20,30}};
        int[][] intervals6 = {{9,10},{4,9},{4,17}};
        int[][] intervals7 = {{2,11},{6,16},{11,16}};
        System.out.println(minMeetingRooms(intervals3));
    }

    public static int minMeetingRooms(int[][] intervals) {
        int [] sTimeArray = new int[intervals.length];
        int [] eTimeArray = new int[intervals.length];
        int count =1;
        for(int i = 0; i < intervals.length; i++){
            sTimeArray[i] = intervals[i][0];
            eTimeArray[i] = intervals[i][1];
        }
        Arrays.sort(sTimeArray);
        Arrays.sort(eTimeArray);
        int endCounter = 0;
        for(int i = 1; i < sTimeArray.length; i++){
           if(eTimeArray[endCounter] > sTimeArray[i]){
               count++;
           }else {
               endCounter++;
           }
        }
        return count;
    }
}
