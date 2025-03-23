package practice.lambda.stream.intermediate.alloperations;

import abstractclass.IStudent;
import concrete.Students;

import java.util.List;
import java.util.stream.Collectors;

public class StreamOperationsExample {
    public static void main(String[] args) {
        long countOfCourse = Students.getAll().stream()
                .map(IStudent::getCourses)
                .flatMap(List::stream)
                .distinct()
                .count();

        System.out.println(countOfCourse);
        System.out.println("---------------------------------------");

        List<String> listOfCourse = Students.getAll().stream()
                .map(IStudent::getCourses)
                .flatMap(List::stream)
                .sorted()
                .collect(Collectors.toList());
        System.out.println(listOfCourse);
        System.out.println("---------------------------------------");
        //anyMatch, allMatch and nonMatch
       boolean matchOfCourse = Students.getAll().stream()
                .map(IStudent::getCourses)
                .flatMap(List::stream)
                .noneMatch( (s) -> s.toLowerCase().startsWith("j") );
        System.out.println(matchOfCourse);

    }
}
