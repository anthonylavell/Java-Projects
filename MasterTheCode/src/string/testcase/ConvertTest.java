package string.testcase;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import string.Convert;

import static org.junit.jupiter.api.Assertions.*;


public class ConvertTest {


    @Test
    public void leadingZero(){
        String str = "0042";
        Assertions.assertEquals(42, Convert.stringToNumber(str));
        str = "0042 00";
        assertEquals(42,Convert.stringToNumber(str));
        str = "004 2";
        assertEquals(4,Convert.stringToNumber(str));
        str = "004 200";
        assertEquals(4,Convert.stringToNumber(str));

    }

    @Test
    public void leadingCharacter(){
        String str = "w42";
        assertEquals(0,Convert.stringToNumber(str));

    }

    @Test
    public void leadingMinusSign(){
        String str = "-42";
        assertEquals(-42,Convert.stringToNumber(str));
        str = "-000000000000001";
        assertEquals(-1,Convert.stringToNumber(str));

    }

    @Test
    public void leadingPlusSign(){
        String str = "+42";
        assertEquals(42,Convert.stringToNumber(str));
    }

    @Test
    public void returnZero(){
        String str = "   00 9 8     ";
        assertEquals(0,Convert.stringToNumber(str));
        str = "--42";
        assertEquals(0,Convert.stringToNumber(str));
        str = "++42";
        assertEquals(0,Convert.stringToNumber(str));
        str = ".42";
        assertEquals(0,Convert.stringToNumber(str));
        str = "-";
        assertEquals(0,Convert.stringToNumber(str));
        str = "+";
        assertEquals(0,Convert.stringToNumber(str));
    }

    @Test
    public void returnWholeNumber(){
        String str = "-42.7";
        assertEquals(-42,Convert.stringToNumber(str));
        str = "+4.2";
        assertEquals(4,Convert.stringToNumber(str));
        str = "49w5";
        assertEquals(49,Convert.stringToNumber(str));
    }

    @Test
    public void valueGreaterThan2147483647(){
        String str = "+42";
        assertFalse(Convert.stringToNumber(str)>=2147483647);
        str="91283472332";
        assertTrue(Convert.stringToNumber(str)<=2147483647);
        str="0020000000000000000000";
        assertTrue(Convert.stringToNumber(str)<=2147483647);
    }

    @Test
    public void valueLessThanNegative2147483648(){
        String str = "-42";
        assertFalse(Convert.stringToNumber(str)<=-2147483648);
        str="-91283472332";
        assertTrue(Convert.stringToNumber(str)<=-2147483648);
    }



}