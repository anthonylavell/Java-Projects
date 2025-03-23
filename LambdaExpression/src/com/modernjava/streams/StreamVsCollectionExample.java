package com.modernjava.streams;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamVsCollectionExample {
    public static void main(String[] args) {
        List<String> names = new ArrayList<>();
        names.add("Mike");
        names.add("Syed");
        names.add("Rajeev");
        System.out.println("------------------");
        System.out.println(names);

        names.remove("Syed");
        System.out.println("-------------------");
        System.out.println(names);
        System.out.println("-------------------");
        for(String name: names){
            System.out.println(name);
        }
        System.out.println("-------------------1");
        names.forEach(System.out::println);
        System.out.println("-------------------2");
        names.forEach(System.out::println);
        System.out.println("-------------------3");
        names.forEach(System.out::println);
        System.out.println("-------------------4");
        names.forEach(System.out::println);
        System.out.println("-------------------5");

        //Stream<String> namesStream = new Stream("Mike", "Syed","Rajeev");
        Stream<String> namesStream = names.stream();
        namesStream.forEach(System.out::println);

        List<String>list2 =
                names.stream().filter(s->s.startsWith("M")).collect(Collectors.toList());
    }
}
