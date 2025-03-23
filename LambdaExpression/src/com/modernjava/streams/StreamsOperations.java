package com.modernjava.streams;

import com.modernjava.funcprogramming.Instructor;
import com.modernjava.funcprogramming.Instructors;

import java.util.List;
import java.util.stream.Collectors;

public class StreamsOperations {
    public static void main(String[] args) {
        //count distinct
        Long count = Instructors.getAll()
                .stream()
                .map(Instructor::getCourses)
                .flatMap(List::stream)
                .distinct()
                .count();
        System.out.println(count);

        //distinct sorted
        List<String> courses = Instructors.getAll()
                .stream()
                .map(instructor -> instructor.getCourses())
                .flatMap(List::stream)
                .distinct()
                .sorted()
                .collect(Collectors.toList());
        courses.forEach(System.out::println);

        //anymatch. allmatch and nonmatch
        boolean match = Instructors.getAll()
                .stream()
                .map(Instructor::getCourses)
                .flatMap(List::stream)
                .noneMatch(s-> s.startsWith("J"));
        System.out.println(match);
    }
}
