package practice.lambda.stream.learned;

import abstractclass.IStudent;
import concrete.Students;

import java.util.List;
import java.util.Map;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class StreamExample {
    public static void main(String[] args) {
        Predicate<IStudent>p1 = ( IStudent::onlineClass );
        Predicate<IStudent>p2 = ( (student) -> student.getGPA() >= 3.4 );
        List<IStudent> listOfStudents = Students.getAll();
        Map<String, Double> mapOfStudents = listOfStudents.stream()
                                        .filter(p1)
                                        .filter(p2)
                                        .collect(Collectors.toMap(IStudent::getName,IStudent::getGPA));
        System.out.println(mapOfStudents);
    }
}
