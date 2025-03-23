package string.testcase;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import string.ConvertToRoman;

import static org.junit.jupiter.api.Assertions.*;

class ConvertToRomanTest {

    @Test
    public void onePlaceTest(){
        int num = 9;
        assertEquals("IX",getRomanNumber(num));
    }

    @Test
    public void tenthPlaceTest(){
        int num = 9;
        assertEquals("IX",getRomanNumber(num));
    }

    @Test
    public void hundredthPlaceTest(){
        int num = 900;
        assertEquals("CM",getRomanNumber(num));
        num = 400;
        assertEquals("CD",getRomanNumber(num));
    }

    @Test
    public void thousandthPlaceTest(){
        int num = 1000;
        assertEquals("M",getRomanNumber(num));
        num = 3999;
        assertEquals("MMMCMXCIX",getRomanNumber(num));
    }

    private String getRomanNumber(int num){
        String result ="";
        while (num > 0){
            result+= ConvertToRoman.roman(num);
            String tempStr = String.valueOf(num).substring(1);
            num = (tempStr.isEmpty())?0:Integer.parseInt(tempStr);
        }
        return result;
    }

}