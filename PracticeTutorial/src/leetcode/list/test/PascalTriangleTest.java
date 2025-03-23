package leetcode.list.test;

import leetcode.list.two_dimensional.PascalTriangle;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class PascalTriangleTest {
    public  List<List<Integer>> generate = new ArrayList<>();
    @BeforeEach
    public void setUpResult(){

        generate.add(new ArrayList<>(Arrays.asList(1)));
        generate.add( new ArrayList<>(Arrays.asList(1,1)));
        generate.add( new ArrayList<>(Arrays.asList(1,2,1)));
        generate.add(  new ArrayList<>(Arrays.asList(1,3,3,1)));
        generate.add(  new ArrayList<>(Arrays.asList(1,4,6,4,1)));
    }
    @Test
    public void testPascalTriangleOfFive(){
       int numRow = 5;
        Assertions.assertEquals(generate, PascalTriangle.generate(numRow));
    }

    @Test
    public void testPascalTriangleOfSix(){
        generate.add(  new ArrayList<>(Arrays.asList(1,5,10,10,5,1)));
        int numRow = 6;
        Assertions.assertEquals(generate,PascalTriangle.generate(numRow));
    }

}