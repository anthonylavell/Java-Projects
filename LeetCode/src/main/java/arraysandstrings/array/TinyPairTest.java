package arraysandstrings.array;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TinyPairTest {

    @Test
    void testPairs(){
        int [] a = {16,1,4,2,14};
        int [] b = {7,11,2,0,15};
        int k = 743;
        int total = 4;
        Assertions.assertEquals(total, TinyPair.pairs(a,b,k));

        int [] a2 = {1,2,3};
        int [] b2 = {1,2,3};
        k = 31;
        total = 2;
        Assertions.assertEquals(total, TinyPair.pairs(a2,b2,k));
    }

}