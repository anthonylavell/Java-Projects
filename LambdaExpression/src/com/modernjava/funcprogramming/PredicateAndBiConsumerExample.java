package com.modernjava.funcprogramming;

import java.util.List;
import java.util.function.BiConsumer;
import java.util.function.Predicate;

public class PredicateAndBiConsumerExample {
    public static void main(String[] args) {
        List<Instructor> instructors = Instructors.getAll();
        //all instructor who teaches onLine
        Predicate<Instructor>p1 = (i) -> i.isOnlineCourses()==true;

        //instructor experience is > 10
        Predicate<Instructor> p2 = (i) -> i.getYearsOfExperience() > 10;

        //BiConsumer print name and course
        BiConsumer<String, List<String>> biConsumer =
                (name, course) -> System.out.println("name is: "+name+" courses: "+course);
        instructors.forEach(instructor -> {
            if(p1.and(p2).test(instructor))
                biConsumer.accept(instructor.getName(), instructor.getCourses());
        });
    }
}
