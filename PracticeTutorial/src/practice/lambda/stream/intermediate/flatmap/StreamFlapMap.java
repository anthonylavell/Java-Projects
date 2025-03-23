package practice.lambda.stream.intermediate.flatmap;

import abstractclass.IStudent;
import concrete.Students;

import java.util.List;
import java.util.stream.Collectors;

public class StreamFlapMap {
    public static void main(String[] args) {
        List<String> stringOfCourse = Students.getAll().stream()
                                .map(IStudent::getCourses)
                                .flatMap(List::stream)
                                .collect(Collectors.toList());
        System.out.println(stringOfCourse);
    }
}
