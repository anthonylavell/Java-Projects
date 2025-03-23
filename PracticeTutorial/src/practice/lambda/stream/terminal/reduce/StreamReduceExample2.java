package practice.lambda.stream.terminal.reduce;

import concrete.Students;

import java.util.Optional;

public class StreamReduceExample2 {
    public static void main(String[] args) {
        Optional student = Students.getAll().stream()
                        .reduce((num, num2)->(num.getGPA() > num2.getGPA()) ? num : num2
                        );
        if(student.isPresent())
        System.out.println("student = " + student.get());
    }
}
