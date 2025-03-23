package practice.lambda.stream.terminal.count;

import abstractclass.IStudent;
import concrete.Students;

import java.util.stream.Collectors;

public class CountingExample {
    public static void main(String[] args) {
        //count the numbers of instructors who teaches online courses
        //stream.count
        long count = Students.getAll().stream()
                .filter(IStudent::onlineClass)
                .count();
        System.out.println("count = " + count);
        System.out.println("-------------------------");

        //collectors.counting
        count = Students.getAll().stream()
                .filter(IStudent::onlineClass)
                .collect(Collectors.counting());
        System.out.println("count2 = " + count);
        System.out.println("--------------------");

    }
}
