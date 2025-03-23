package com.modernjava.funcprogramming;

import java.util.List;
import java.util.function.BiConsumer;

public class BiConsumerExample2 {
    public static void main(String[] args) {
        List<Instructor> instructors = Instructors.getAll();
        //print out name and gender of instructors.
        BiConsumer<String,String> biConsumer = (name,gender) -> System.out.println(
                "name is :"+name+" and gender is: "+gender);
        instructors.forEach(instructor -> System.out.println(instructor.getName()+" "+
                instructor.yearsOfExperience));
        instructors.forEach(instructor ->
                biConsumer.accept(instructor.getName(), instructor.getGender())
        );
        //print out name and list of courses
        System.out.println("------------------------------------------");
        BiConsumer<String, List<String>> biConsumer2 =
                (name, bullshit) -> System.out.println("name is "+ name+ " courses "+ bullshit);
        instructors.forEach(instructor ->
                biConsumer2.accept(instructor.getName(), instructor.getCourses()));
        System.out.println("------------------------------------------");
        //print out name and gender of all instructors who teaches online
        instructors.forEach(instructor -> {
            if(instructor.isOnlineCourses()){
                biConsumer.accept(instructor.getName(),instructor.getGender());
            }
        });
    }
}
