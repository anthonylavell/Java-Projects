package practice.lambda.stream.collector;

import abstractclass.IStudent;
import concrete.Students;

import java.util.stream.Collectors;

public class CollectorSummingAveragingExample {
    public static void main(String[] args) {
        int sum = Students.getAll().stream()
                .collect(Collectors.summingInt(IStudent::getAge));
        System.out.println("sum = " + sum);
        System.out.println("------------------");
        double average = Students.getAll().stream()
                .collect(Collectors.averagingDouble(IStudent::getGPA));
        System.out.println("average = " + average);
    }
}
