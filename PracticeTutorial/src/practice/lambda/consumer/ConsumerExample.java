package practice.lambda.consumer;

import abstractclass.IStudent;
import concrete.Students;

import java.util.List;
import java.util.function.Consumer;

public class ConsumerExample {
    public static void main(String[] args) {
        Consumer<IStudent> c1 = System.out::println;
        List<IStudent> listOfStudents = Students.getAll();
        listOfStudents.forEach( c1::accept );
        System.out.println("----------------------------------------------------------");
        Consumer<IStudent> c2 = ( (student) ->{
            if(student.getGPA()>3.4)
                c1.accept(student);
        });
        listOfStudents.forEach(c2::accept);

        System.out.println("----------------------------------------------------------");
        Consumer<IStudent> c3 = ((student) -> System.out.println(student.getGPA()));
        Consumer<IStudent> c4 = (student -> System.out.println(student.getName()));
        listOfStudents.forEach(c4.andThen(c3));
    }
}
