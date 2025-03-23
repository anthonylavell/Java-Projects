package com.modernjava.funcprogramming;

import java.util.List;
import java.util.function.BiConsumer;
import java.util.function.BiPredicate;

public class BiPredicateExample {
    public static void main(String[] args) {
        List<Instructor> instructors = Instructors.getAll();
        //all instructor who teaches onLine

        BiPredicate<Boolean, Integer> p3 =
                (online, experience) -> online == true && experience>10;
        BiPredicate<String,String> p4 = (title,gender) -> ( title.contains(
                "Programming") && gender.equalsIgnoreCase("M"));

        //BiConsumer print name and course
        BiConsumer<String, List<String>> biConsumer =
                (name, course) -> System.out.println("name is: "+name+" courses: "+course);


        instructors.forEach(instructor -> {
            if(p3.test(instructor.isOnlineCourses(), instructor.getYearsOfExperience()))
                biConsumer.accept(instructor.getName(), instructor.getCourses());
        });

        instructors.forEach(instructor -> {
            if(p4.test(instructor.title, instructor.gender))
            biConsumer.accept(instructor.getName(),instructor.courses);
        });


    }
}
