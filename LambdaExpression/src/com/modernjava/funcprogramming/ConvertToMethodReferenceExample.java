package com.modernjava.funcprogramming;

import java.util.function.Predicate;

public class ConvertToMethodReferenceExample {
    public static void main(String[] args) {
        Predicate<Instructor> p2 =
                ConvertToMethodReferenceExample::greatThanTenYearsOfExperience;
                Instructors.getAll().forEach(instructor -> {
                    if(p2.test(instructor)){
                        System.out.println(instructor);
                    }
                });

    }

    public static boolean greatThanTenYearsOfExperience(Instructor instructor){
        return (instructor.getYearsOfExperience() > 10);
    }

    public static boolean greatThanFiveYearsButLessThanTenYearsOfExperience(Instructor instructor){
        return (instructor.getYearsOfExperience()> 5 && instructor.getYearsOfExperience() < 10);
    }
}
