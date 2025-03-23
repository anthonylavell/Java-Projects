package practice.lambda.stream.collector;

import abstractclass.IStudent;
import concrete.Students;

import java.util.Comparator;
import java.util.Optional;
import java.util.stream.Collectors;

public class CollectorMinMaxExample {
    public static void main(String[] args) {
        Optional<IStudent> studentsGPAByMin = Students.getAll().stream()
                .collect(Collectors.minBy(Comparator.comparing(IStudent::getGPA)));
        if (studentsGPAByMin.isPresent()) {
            System.out.println("studentsGPAByMin = " + studentsGPAByMin);
        }
        System.out.println("-------------------------");

        studentsGPAByMin = Students.getAll().stream()
                .min(Comparator.comparing(IStudent::getGPA));
        if (studentsGPAByMin.isPresent()) {
            System.out.println("studentsGPAByMin = " + studentsGPAByMin);
        }
        System.out.println("-------------------------");

        Optional studentsGPAByMax = Students.getAll().stream()
                .collect(Collectors.maxBy(Comparator.comparing(IStudent::getGPA)));
        if (studentsGPAByMax.isPresent()) {
            System.out.println("studentsGPAByMax = " + studentsGPAByMax);
        }
        System.out.println("-------------------------");
        studentsGPAByMax = Students.getAll().stream()
                .max(Comparator.comparing(IStudent::getGPA));
        if(studentsGPAByMax.isPresent()){
        System.out.println("studentsGPAByMax = " + studentsGPAByMax);
        }
                                
    }
}