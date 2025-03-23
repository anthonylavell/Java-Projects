package wayfair.interval.test;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import wayfair.interval.MeetingRooms;

import static org.junit.jupiter.api.Assertions.*;

class MeetingRoomsTest {
    @Test
    public void testCanAttendMeetingsTrue(){
        int[][] intervals = {{0,30},{5,10},{15,20}};
        Assertions.assertFalse(MeetingRooms.canAttendMeetings(intervals));

        int[][] intervals2 = {{7,10},{2,4}};
        Assertions.assertTrue(MeetingRooms.canAttendMeetings(intervals2));

        int[][] intervals3 = {{5,10},{10,20},{11,19}};
        Assertions.assertFalse(MeetingRooms.canAttendMeetings(intervals3));

        int[][] intervals4 = {{5,10},{10,20},{6,9}};
        Assertions.assertFalse(MeetingRooms.canAttendMeetings(intervals4));

        int[][] intervals5 = {{5,8},{6,8}};
        Assertions.assertFalse(MeetingRooms.canAttendMeetings(intervals5));
    }

}