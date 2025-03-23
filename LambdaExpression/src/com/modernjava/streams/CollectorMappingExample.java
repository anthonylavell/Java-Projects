package com.modernjava.streams;

import com.modernjava.funcprogramming.Instructor;
import com.modernjava.funcprogramming.Instructors;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

import static java.lang.System.out;
public class CollectorMappingExample {
    public static void main(String[] args) {
        //map
        List<String> namesList = Instructors.getAll()
                                    .stream()
                                    .map(Instructor::getName)
                                    .collect(Collectors.toList());
        namesList.forEach(System.out::println);
        out.println("-----------------------");
        namesList = Instructors.getAll()
                            .stream()
                            .collect( Collectors.mapping(Instructor::getName,
                                    Collectors.toList()));
        namesList.forEach(System.out::println);
        out.println("-----------------------");
        //Instructors by their years of experience
       Map<Integer,List<String>> mapYearsOfExperienceAndNames = Instructors.getAll()
                    .stream()
                    .collect(Collectors.groupingBy(Instructor::getYearsOfExperience
                    , Collectors.mapping(Instructor::getName,Collectors.toList())));
       mapYearsOfExperienceAndNames.forEach((key, value) -> {
           out.println("Key= "+key+" Value = "+value);
       });
    }

}
