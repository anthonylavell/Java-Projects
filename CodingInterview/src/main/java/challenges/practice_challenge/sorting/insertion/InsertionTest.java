package challenges.practice_challenge.sorting.insertion;

import java.util.Arrays;

import static junit.framework.TestCase.*;
public class InsertionTest {

    @org.junit.Test
    public void sort() {
        int [] sortArray ={0, 1, 2, 4, 5, 6, 44, 63, 87, 99, 283};
        int [] unSortNum = {99,44,6,2,1,5,63,87,283,4,0};
        assertEquals(Arrays.toString(sortArray),Arrays.toString(Insertion.sort(unSortNum)));

    }
}