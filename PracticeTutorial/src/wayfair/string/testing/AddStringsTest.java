package wayfair.string.testing;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import wayfair.string.AddStrings;

class AddStringsTest {
    @Test
    public void testAddStrings(){
        String num1 = "189";
        String num2 = "234";
        String result = "423";
        Assertions.assertEquals(result, AddStrings.addStrings(num1,num2));

        String num3 = "3876620623801494171";
        String num4 = "6529364523802684779";
        String result2 = "10405985147604178950";
        Assertions.assertEquals(result2, AddStrings.addStrings(num3,num4));

        String num5 = "189";
        String num6 = "34";
        String result3 = "223";
        Assertions.assertEquals(result3, AddStrings.addStrings(num5,num6));

        String num7 = "89";
        String num8 = "234";
        String result4 = "323";
        Assertions.assertEquals(result4, AddStrings.addStrings(num7,num8));
    }
}