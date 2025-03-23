package array.testcase;

import array.DuplicateDetect;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class DuplicateDetectTest {

    @Test
    public void returnTrue(){
        boolean result = true;
        int [] nums = new int[] {1,2,3,1,4};
        Assertions.assertEquals(result, DuplicateDetect.containsDuplicate(nums));

        int [] nums2 = new int[] {1,2,3,1};
        Assertions.assertEquals(result, DuplicateDetect.containsDuplicate(nums2));

        int [] nums3 = new int[] {1000000000,1000000000,11};
        Assertions.assertEquals(result, DuplicateDetect.containsDuplicate(nums2));
    }

    @Test
    public void returnFalse(){
        int [] nums = new int[] {1,2,3,4,5};
        boolean result = false;
        Assertions.assertEquals(result, DuplicateDetect.containsDuplicate(nums));
    }

}