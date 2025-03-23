package wayfair.interval.test;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import wayfair.interval.NonOverlappingIntervals;

import static org.junit.jupiter.api.Assertions.*;

class NonOverlappingIntervalsTest {

    @Test
    void testEraseOverlapIntervals() {
        int [][] intervals = {{1,2},{2,3},{3,4},{1,3}};
        int result = 1;
        Assertions.assertEquals(result, NonOverlappingIntervals.eraseOverlapIntervals(intervals));
        int [][] intervals2 ={{1,2},{2,3},{3,4},{2,5},{2,4}};
        int result2 = 2;
        Assertions.assertEquals(result2, NonOverlappingIntervals.eraseOverlapIntervals(intervals2));
        int [][] intervals3 ={{2,5}};
        int result3 = 0;
        Assertions.assertEquals(result3, NonOverlappingIntervals.eraseOverlapIntervals(intervals3));
        int [][] intervals4 = {{0,2},{1,3},{2,4},{3,5},{4,6}};
        int result4 = 2;
        Assertions.assertEquals(result4, NonOverlappingIntervals.eraseOverlapIntervals(intervals4));
        int [][] intervals5 ={{-52,31},{-73,-26},{82,97},{-65,-11},{-62,-49},{95,99},{58,95},{-31,49},{66,98},{-63,2},{30,47},{-40,-26}};
        int result5 = 7;
        Assertions.assertEquals(result5, NonOverlappingIntervals.eraseOverlapIntervals(intervals5));
    }
}