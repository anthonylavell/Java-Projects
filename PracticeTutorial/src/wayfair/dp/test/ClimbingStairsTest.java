package wayfair.dp.test;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import wayfair.dp.ClimbingStairs;

import static org.junit.jupiter.api.Assertions.*;

class ClimbingStairsTest {
    @Test
    public void testClimbStairs(){
        int n =10;
        int result = 89;
        Assertions.assertEquals(result, ClimbingStairs.climbStairs(n));

        int n2 = 5;
        int result2 = 8;
        Assertions.assertEquals(result2,ClimbingStairs.climbStairs(n2));

        int n3 =1;
        int result3 = 1;
        Assertions.assertEquals(result3,ClimbingStairs.climbStairs(n3));

        int n4 =2;
        int result4 = 2;
        Assertions.assertEquals(result4,ClimbingStairs.climbStairs(n4));
    }

}