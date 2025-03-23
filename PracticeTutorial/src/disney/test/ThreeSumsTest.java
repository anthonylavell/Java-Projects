package disney.test;

import disney.ThreeSums;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class ThreeSumsTest {

    @Test
    void testThreeSum() {
        int[] nums = {-1,0,1,2,-1,-4};
        List<List<Integer>> listOfIntegers = new ArrayList<>();
        List<Integer>list = new ArrayList<>(Arrays.asList(-1,-1,2));
        List<Integer>list2 = new ArrayList<>(Arrays.asList(-1,0,1));
        listOfIntegers.add(list);
        listOfIntegers.add(list2);
        Assertions.assertEquals(listOfIntegers,ThreeSums.threeSum(nums));

        int[] nums3 = {0,0,0};
        List<List<Integer>> listOfIntegers3 = new ArrayList<>();
        List<Integer>list3 = new ArrayList<>(Arrays.asList(0,0,0));
        listOfIntegers3.add(list3);
        Assertions.assertEquals(listOfIntegers3,ThreeSums.threeSum(nums3));
    }
}