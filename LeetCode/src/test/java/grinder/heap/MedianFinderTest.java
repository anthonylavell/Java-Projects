package grinder.heap;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MedianFinderTest {

    @Test
    void testFindMedian() {
        MedianFinder median = new MedianFinder();
        median.addNum(1);
        median.addNum(2);
        Double result = 1.5;
        Double total = median.findMedian();
        assertEquals(result,total);
        median.addNum(3);
        Double total2 = median.findMedian();
        Double result2 = 2.00;
        assertEquals(result2,total2);
    }
}