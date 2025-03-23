package practice.lambda.predicates;

import abstractclass.IStudent;
import concrete.Students;

import java.util.List;
import java.util.function.Predicate;

public class StudentPredicates {
    public static void main(String[] args) {
        List<IStudent> students = Students.getAll();
        Predicate<IStudent> p1 = ((a) -> a.getGPA() > 3.4
             );
        Predicate<IStudent> p2 = ((a) -> a.getAge() <66);
        Predicate<IStudent> p3 = IStudent::onlineClass;
        students.forEach( (student) -> System.out.println( p1.test(student)) );
        students.forEach(student -> {
            if (p1.and(p2).test(student)) {
                System.out.println(student);
            }
        });
    }
}
