package com.modernjava.streams;

import com.modernjava.funcprogramming.Instructor;
import com.modernjava.funcprogramming.Instructors;

import java.util.Comparator;
import java.util.Optional;
import java.util.stream.Collectors;

public class CollectorMinMaxExample {
    public static void main(String[] args) {
        //instructor with minimum years of experience
        Optional<Instructor> instructor = Instructors.getAll()
                                            .stream()
                                            .collect(Collectors.minBy(Comparator.comparing(
                                                    Instructor::getYearsOfExperience
                                            )));
        if(instructor.isPresent())
            System.out.println("instructor =="+instructor.get());
        System.out.println("---------------------------");
        instructor = Instructors.getAll()
                .stream()
                .min(Comparator.comparing(Instructor::getYearsOfExperience));
        if(instructor.isPresent())
            System.out.println("instructor =="+instructor);

         instructor = Instructors.getAll()
                .stream()
                .collect(Collectors.maxBy(Comparator.comparing(
                        Instructor::getYearsOfExperience
                )));
        if(instructor.isPresent())
            System.out.println("instructor =="+instructor.get());
        System.out.println("---------------------------");
        instructor = Instructors.getAll()
                .stream()
                .max(Comparator.comparing(Instructor::getYearsOfExperience));
        if(instructor.isPresent())
            System.out.println("instructor =="+instructor);
    }
}
