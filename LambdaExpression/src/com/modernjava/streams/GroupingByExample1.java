package com.modernjava.streams;

import com.modernjava.funcprogramming.Instructor;
import com.modernjava.funcprogramming.Instructors;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class GroupingByExample1 {
    public static void main(String[] args) {
        //group List of name by their length
        List<String> names = List.of("Sid","Tony","Gene","Rajeev");
        Map<Integer,List<String>> result = names
                                        .stream()
                                        .collect(Collectors.groupingBy(String::length));
        result.forEach((key, value) ->{
            System.out.println("key = "+key+" value = "+value);
        });
        System.out.println("---------------------");
        //grouping by instructors by their gender
        Map<String, List<Instructor>> instructorByGender = Instructors.getAll()
                                        .stream()
                                        .collect(Collectors.groupingBy(Instructor::getGender));
        instructorByGender.forEach((key, value) ->{
            System.out.println("key = "+key+" value = "+value);
        });
        System.out.println("---------------------");
        //grouping by experience where > 10 years of experience is classified
        //as Senior and others are junior
        Map<String, List<Instructor>> instructorsByExperience = Instructors.getAll()
                                            .stream()
                                            .collect(Collectors.groupingBy(instructor ->
                                                    instructor.getYearsOfExperience() > 10 ? "Senior" : "Junior"));
        instructorsByExperience.forEach((key, value) ->{
            System.out.println("key = "+key+" value = "+value);
        });
    }

}
