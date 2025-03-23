package wayfair.dp.test;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import wayfair.dp.UniquePath;

import static org.junit.jupiter.api.Assertions.*;

class UniquePathTest {
    @Test
    public void testUniquePaths(){
        int m = 3, n = 7;
        int result = 28;
        Assertions.assertEquals(result, UniquePath.uniquePaths(m,n));

        int m2 = 3, n2 = 2;
        int result2 = 3;
        Assertions.assertEquals(result2, UniquePath.uniquePaths(m2,n2));

        int m3 = 3, n3 = 3;
        int result3 = 6;
        Assertions.assertEquals(result3, UniquePath.uniquePaths(m3,n3));
    }

}