package comp_p.hubspot;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class MeetingRoomsIITest {

    @Test
    void testMinMeetingRooms() {
        int[][] intervals = {{15,20},{5,10},{0,30} };
        assertEquals(2,MeetingRoomsII.minMeetingRooms(intervals));

        int[][] intervals2 = {{7,10},{2,4} };
        assertEquals(1,MeetingRoomsII.minMeetingRooms(intervals2));

        int[][] intervals3 = {{2,11},{6,16},{11,16} };
        assertEquals(2,MeetingRoomsII.minMeetingRooms(intervals3));

        int[][] intervals4 = {{9,10},{4,9},{4,17} };
        assertEquals(2,MeetingRoomsII.minMeetingRooms(intervals4));

        int[][] intervals5 = {{15,30},{15,20},{5,10},{0,30} };
        assertEquals(3,MeetingRoomsII.minMeetingRooms(intervals5));

        int[][] intervals6 = {{2,15},{36,45},{9,29},{16,23},{4,9} };
        assertEquals(2,MeetingRoomsII.minMeetingRooms(intervals6));
    }
}