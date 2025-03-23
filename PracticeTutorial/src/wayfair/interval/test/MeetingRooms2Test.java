package wayfair.interval.test;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import wayfair.interval.MeetingRooms2;

import static org.junit.jupiter.api.Assertions.*;

class MeetingRooms2Test {
    @Test
    public void testMinMeetingRooms(){
        int[][] intervals = {{0,30},{5,10},{15,20}};
        int result = 2;
        Assertions.assertEquals(result, MeetingRooms2.minMeetingRooms(intervals));

        int[][] intervals2 = {{7,10},{2,4}};
        int result2 = 1;
        Assertions.assertEquals(result2, MeetingRooms2.minMeetingRooms(intervals2));

        int[][] intervals3 = {{5,8},{6,8}};
        int result3 = 2;
        Assertions.assertEquals(result3, MeetingRooms2.minMeetingRooms(intervals3));

        int[][] intervals4 = {{2,4},{6,8},{7,10},{11,15}};
        int result4 = 2;
        Assertions.assertEquals(result4, MeetingRooms2.minMeetingRooms(intervals4));

        int[][] intervals5 = {{0,10},{9,20},{20,30}};
        int result5 = 2;
        Assertions.assertEquals(result5, MeetingRooms2.minMeetingRooms(intervals5));

        int[][] intervals6 = {{9,10},{4,9},{4,17}};
        int result6 = 2;
        Assertions.assertEquals(result6, MeetingRooms2.minMeetingRooms(intervals6));

    }

}