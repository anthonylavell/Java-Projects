package practice.lambda.stream.intermediate.map;

import abstractclass.IStudent;
import concrete.Students;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StreamMapExample {
    public static void main(String[] args) {
        List<Integer> listOfNum = new ArrayList<>(Arrays.asList(2,3,4,5,6));
        List<Integer> listOfNum2 = listOfNum.stream()
                                    .map( (x) -> x*2  )
                                    .collect(Collectors.toList());
        System.out.println(listOfNum);
        System.out.println("---------------------------------");
        System.out.println(listOfNum2);
        System.out.println("---------------------------------");

        List<String> listOfStudentsNames = Students.getAll().stream()
                                        .map(IStudent::getName)
                                        .map(String::toUpperCase)
                                        .collect(Collectors.toList());
        System.out.println(listOfStudentsNames);
    }
}
