package practice.lambda.predicates;

import abstractclass.IStudent;
import concrete.Students;

import java.util.List;
import java.util.function.BiConsumer;
import java.util.function.BiPredicate;
import java.util.function.Predicate;

public class LearningPredicates {
    public static void main(String[] args) {
        Predicate<Integer> p1 = (a) -> a > 10;
        Predicate<Integer> p2 = (a) -> a % 2 == 0;
        Predicate<Integer> p3 = p2.and(p1);
        System.out.println("p3.test(10) = " + p3.test(15));
        System.out.println("p1.and(p2).test(30) = " + p1.and(p2).test(30));
        System.out.println("p1.and(p2).test(30) = " + p1.or(p2).test(10));
        System.out.println("p1.and(p2).test(30) = " + p1.and(p2).negate().test(10));
        System.out.println(
                "------------------------------------------------------------------------");
        BiPredicate<Integer, Integer> bP =
                (age, numOfCourseTaken) -> age > 27 && numOfCourseTaken >1;
        BiConsumer<String, List<String>> bC =
                (name, course) -> System.out.println(name+" "+ course);
       List<IStudent> students = Students.getAll();
       students.forEach(student -> {
           if(bP.test(student.getAge(),student.getCourses().size() )){
               bC.accept(student.getName(),student.getCourses());
           }
       } );
    }
}
