package practice.lambda.stream.intermediate.alloperations;

import abstractclass.IStudent;
import concrete.Students;

public class StreamMapFilerReduceExample {
    public static void main(String[] args) {
        int totalAgeOfAllStudent = Students.getAll().stream()
                                .filter(IStudent::onlineClass)
                                .map(IStudent::getAge)
                                .reduce(0,Integer::sum);
        System.out.println("total = " + totalAgeOfAllStudent);
    }
}
