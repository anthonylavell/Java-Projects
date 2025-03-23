package practice.lambda.stream.intermediate.sort;

import abstractclass.IStudent;
import concrete.Students;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class StreamComparatorExample {
    public static void main(String[] args) {
        List<IStudent>listOfStudentsNames = Students.getAll().stream()
                                        .sorted(Comparator.comparing(IStudent::getName).reversed())
                                        .collect(Collectors.toList());
        listOfStudentsNames.forEach(System.out::println);
    }
}
