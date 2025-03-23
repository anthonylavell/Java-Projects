package practice.lambda.stream.intermediate.filter;

import abstractclass.IStudent;
import concrete.Students;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class StreamFilterExample {
    public static void main(String[] args) {
        Predicate<String>p1 = ((s)->s.toLowerCase().startsWith("c"));
        Predicate<IStudent>ageGreaterThan21 = ( student -> student.getAge() > 21 );
        List<String> listOfNames = Arrays.asList("Clara","Alvin","Lashawn","James",
                "Charles");
        List<String> listOfResults = listOfNames.stream()
                            .filter( (s) -> p1.test(s) )
                            .collect(Collectors.toList());
        System.out.println(listOfNames);
        System.out.println("----------------------------");

        System.out.println(listOfResults);
        System.out.println("----------------------------");

        List<IStudent>listOfStudentsByAge = Students.getAll().stream()
                                .filter(s -> s.getAge() > 21)
                                .sorted(Comparator.comparing(IStudent::getName))
                                .collect(Collectors.toList());
        listOfStudentsByAge.forEach(System.out::println);
        System.out.println("----------------------------");
        List<String> listOfResults2 = listOfNames.stream()
                    .collect(Collectors.filtering( (s) -> p1.test(s), Collectors.toList()));
        System.out.println("listOfResults2 = " + listOfResults2);
        System.out.println("----------------------------");

        List<IStudent>listOfStudents2 = Students.getAll().stream()
                        .collect(Collectors.filtering( (age) -> age.getAge() >21,
                                Collectors.toList()));
       listOfStudents2.forEach(System.out::println);


    }
}
