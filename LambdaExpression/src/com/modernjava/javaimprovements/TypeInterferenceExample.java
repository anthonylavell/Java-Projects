package com.modernjava.javaimprovements;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class TypeInterferenceExample {
    public static void main(String[] args) {
        //String
        //String name = "Tony";
        var name = "Mike";
        System.out.println("name = " + name);

        var dateTime = LocalDateTime.now();
        System.out.println("dateTime = " + dateTime);

        HashMap<Integer,String> map = new HashMap<>();
        var map1 = new HashMap<Integer,String>();

        //integer array
        int[] numbers = {1,2,3,4,5};
        var numbers2 = new int []{1,2,3,4,5};

        //List
        List<String> names = new ArrayList<>();
        names.add("Tony");
        names.add("Syed");
        System.out.println("names = " + names);

        var names2 = new ArrayList<>();
        names.add("Anthony");
        names.add("Alvin");
        names2.add(14);
        System.out.println("names2 = " + names2);

        //
        var integers = List.of(1,2,3,4,5);
        integers.forEach(System.out::println);

        //int num = 99999999L;
        var num = 99999999999L;
        var result = 9/2;
        System.out.println("result = " + result);
        var result2 = 9/2.0;
        result2 = 11d/2;
        System.out.println("result2 = " + result2);
        var idiomOfTheDay = "A blessing in disguise";
        printString(idiomOfTheDay);


    }

    public static void printString (String toPrint){
        System.out.println("toPrint = " + toPrint);
    }
}
