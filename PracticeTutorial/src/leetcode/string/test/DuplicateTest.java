package leetcode.string.test;

import leetcode.arrays.Duplicate;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class DuplicateTest {
    @Test
    public void testNonDistinctArray(){
        int [] arrOfNum = {1,2,3,1};
        Assertions.assertTrue(Duplicate.containsDuplicate(arrOfNum));
        int [] arrOfNum2 = {1,1,1,3,3,4,3,2,4,2};
        Assertions.assertTrue(Duplicate.containsDuplicate(arrOfNum2));
        int [] arrOfNum3 = {1000000000,1000000000,11};
        Assertions.assertTrue(Duplicate.containsDuplicate(arrOfNum3));

    }
    @Test
    public void testDistinctArray(){
        int [] arrOfNum = {1,2,3,4};
        Assertions.assertFalse(Duplicate.containsDuplicate(arrOfNum));
    }

}