package com.modernjava.funcprogramming;

import java.util.function.BiConsumer;

public class BiConsumerExample {
    public static void main(String[] args) {
        BiConsumer<Integer, Integer> biConsumer = (x,y) -> System.out.println("x:"+x+
                " y:"+y);
        biConsumer.accept(2,4);
        BiConsumer<Integer, Integer> biConsumer2 =
                (x,y) -> System.out.println("x+y: "+(x+y));
        biConsumer2.accept(2,4);
        BiConsumer<String,String> biConsumer3 = (x,y) -> System.out.println(x+y);
        biConsumer3.accept("Fell on", "deaf ears");

        BiConsumer biConsumer4 = (x,y) -> System.out.println("x = " + x+ " y = "+y);
        biConsumer4.accept("Anthony age",4);

    }
}
