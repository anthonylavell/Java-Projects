package com.modernjava.funcprogramming;

import com.modernjava.InstructorFactory;

import java.util.Arrays;

public class ConstructorReferenceExample {
    public static void main(String[] args) {
        InstructorFactory instructorFactory = Instructor::new;
        Instructor instructor = instructorFactory.getInstructor("Mike", 10,"software " +
                "Developer", "M",true, Arrays.asList("Java Programming","C++ " +
                "Programming","Python Programming"));
        System.out.println(instructor);
    }
}
