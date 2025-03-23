package string.testcase;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import string.ConvertToRoman2;

import static org.junit.jupiter.api.Assertions.*;

class ConvertToRoman2Test {
    @Test
    public void onePlaceTest(){
        int num = 9;
        Assertions.assertEquals("IX", ConvertToRoman2.roman(num));
    }

    @Test
    public void tenthPlaceTest(){
        int num = 9;
        assertEquals("IX",ConvertToRoman2.roman(num));
    }

    @Test
    public void hundredthPlaceTest(){
        int num = 900;
        assertEquals("CM",ConvertToRoman2.roman(num));
        num = 400;
        assertEquals("CD",ConvertToRoman2.roman(num));
    }

    @Test
    public void thousandthPlaceTest(){
        int num = 1000;
        assertEquals("M",ConvertToRoman2.roman(num));
        num = 3999;
        assertEquals("MMMCMXCIX",ConvertToRoman2.roman(num));
    }

}