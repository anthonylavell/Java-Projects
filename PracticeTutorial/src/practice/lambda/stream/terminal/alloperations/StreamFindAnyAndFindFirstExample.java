package practice.lambda.stream.terminal.alloperations;

import abstractclass.IStudent;
import concrete.Students;

import java.util.Optional;

public class StreamFindAnyAndFindFirstExample {
    public static void main(String[] args) {
        Optional<IStudent> studentOptional = Students.getAll().stream()
                                            .findAny();
        if(studentOptional.isPresent())
            System.out.println("studentOptional = " + studentOptional.get());
        System.out.println("-----------------------------------------------");
        studentOptional = Students.getAll().stream()
                        .findFirst();
        if(studentOptional.isPresent())
            System.out.println("studentOptional.get() = " + studentOptional.get());
    }
}
