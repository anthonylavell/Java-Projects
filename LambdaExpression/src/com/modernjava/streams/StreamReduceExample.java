package com.modernjava.streams;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

import static java.lang.System.out;

public class StreamReduceExample {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1,2,3,4,5,6,7,8,9);
        int results =   numbers.stream()
                                //0+1=1     //10+5=15   //36+9=45
                                //1+2=3     //15+6=21
                                //3+3=6     //21+7=28
                                //6+4=10    //28+8=36
                                .reduce(0,(a,b)->a+b);
        int results1 = numbers.stream().reduce(1,(a,b)-> a*b);
        out.println(results);
        out.println(results1);
        out.println("--------------------------------");
        Optional results3 = numbers.stream().reduce((a, b) -> a+b);
        if(results3.isPresent())
            out.println(results3);

    }
}
