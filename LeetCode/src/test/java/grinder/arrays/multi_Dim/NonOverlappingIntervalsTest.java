package grinder.arrays.multi_Dim;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class NonOverlappingIntervalsTest {

    @Test
    void testEraseOverlapIntervals() {
        int[][] intervals= {{1,2},{2,3},{3,4},{1,3}};
        assertEquals(1, NonOverlappingIntervals.eraseOverlapIntervals(intervals));

        int[][] intervals2 = {{1,2},{1,2},{1,2}};
        assertEquals(2, NonOverlappingIntervals.eraseOverlapIntervals(intervals2));

        int[][] intervals3 = {{1,2},{2,3}};
        assertEquals(0, NonOverlappingIntervals.eraseOverlapIntervals(intervals3));

        int[][] intervals4 =  {{-52,31},{-73,-26},{82,97},{-65,-11},{-62,-49},{95,99},{58,95},{-31,49},{66,98},{-63,2},{30,47},{-40,-26}};
        assertEquals(7, NonOverlappingIntervals.eraseOverlapIntervals(intervals4));

        int[][] intervals5 =  {{0,2},{1,3},{2,4},{3,5},{4,6}};
        assertEquals(2, NonOverlappingIntervals.eraseOverlapIntervals(intervals5));


    }
}