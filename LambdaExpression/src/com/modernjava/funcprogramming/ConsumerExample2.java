package com.modernjava.funcprogramming;

import java.util.List;
import java.util.function.Consumer;

public class ConsumerExample2 {
    public static void main(String[] args) {
        List<Instructor> instructors = Instructors.getAll();
        //Looping through all the instructor and printing out the values of instructor
        Consumer<Instructor> c1 = (s1) -> System.out.println(s1);
        instructors.forEach(c1);

        //Looping through all the instructor and only printing out their name
        System.out.println("------------------------------------");
        Consumer<Instructor> c2 = (s1) -> System.out.println(s1.getName());
        instructors.forEach(c2);

        ////Looping through all the instructor and printing out their name and
        // their course
        System.out.println("------------------------------------");
        Consumer<Instructor> c3 = (s1) -> System.out.println(s1.getCourses());
        instructors.forEach(c2.andThen(c3));

        ////Looping through all the instructor and printing out their name if their
        // years of experience is greater than 10
        System.out.println("------------------------------------");
        instructors.forEach(s1 -> {
            if(s1.yearsOfExperience>10){
                c1.accept(s1);
            }
        });
        ////Looping through all the instructor and printing out their name if their
        // years of experience is greater than 5 and course online
        System.out.println("------------------------------------");
        instructors.forEach(s1 -> {
            if(s1.yearsOfExperience > 5 && !s1.onlineCourses){
                c2.andThen(c1).accept(s1);
            }
        });
    }
}
