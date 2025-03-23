package com.modernjava.streams;

import com.modernjava.funcprogramming.Instructor;
import com.modernjava.funcprogramming.Instructors;

import java.util.LinkedHashMap;
import java.util.List;
import java.util.stream.Collectors;

public class GroupingByExample3 {
    public static void main(String[] args) {
        //grouping by length of string and also checking the the names contains e
        //and only return those name which has e in it
        List<String> names = List.of("Sid","Tony","Gene","Rajeev");
        LinkedHashMap<Integer,List<String>> result = names
                .stream()
                .collect(Collectors.groupingBy(String::length,LinkedHashMap::new,
                        Collectors.filtering(s-> s.contains("e"),
                                Collectors.toList())));
        System.out.println("result = "+result);
        System.out.println("---------------------");
        //instructor grouping by Senior(>10) and Junior(<10) and filter them
        //on online courses
        LinkedHashMap<String, List<Instructor>> instructorByExperienceAndOnline =
                Instructors.getAll()
                .stream()
                .collect(Collectors.groupingBy(instructor ->
                        instructor.getYearsOfExperience() >10 ?
                                "Senior": "Junior",
                        LinkedHashMap::new,
                        Collectors.filtering(s -> s.isOnlineCourses(),
                        Collectors.toList())
                ));
        instructorByExperienceAndOnline.forEach((key, value) -> {
            System.out.println("key = "+key+" value = "+ value);

        });
    }
}
