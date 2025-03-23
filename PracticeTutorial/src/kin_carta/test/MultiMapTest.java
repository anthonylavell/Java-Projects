package kin_carta.test;

import kin_carta.MultiMap;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class MultiMapTest {
    private MultiMap map;
    @BeforeEach
    public void setUp(){
        map = new MultiMap<>();
    }

    @Test
    public void testNoInput(){
        String result ="{}";
        Assertions.assertEquals(result,map.toString());
    }

    @Test
    public void testOneInput(){
        map.add("5",14);
        String result ="{5=[14]}";
        Assertions.assertEquals(result,map.toString());
    }

    @Test
    public void testMultiplyInput(){
        map.add("1",14);
        map.add("1",20);
        map.add("1",25);
        map.add("1",30);
        map.add("2",18);
        map.add("2",24);
        map.add("2",29);
        map.add("3",15);
        map.add("3",22);
        map.add("3",28);
        String result ="{1=[14, 20, 25, 30], 2=[18, 24, 29], 3=[15, 22, 28]}";
        Assertions.assertEquals(result,map.toString());
    }

}