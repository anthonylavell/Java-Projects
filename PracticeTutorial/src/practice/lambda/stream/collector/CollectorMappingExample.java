package practice.lambda.stream.collector;

import abstractclass.IStudent;
import concrete.Students;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class CollectorMappingExample {
    public static void main(String[] args) {
        //map
        List<String> namesList = Students.getAll().stream()
                    .map(IStudent::getName)
                    .collect(Collectors.toList());
        namesList.forEach(System.out::println);
        System.out.println("-------------------------------");

        //mapping
        namesList = Students.getAll().stream()
                .collect(Collectors.mapping(IStudent::getName,Collectors.toList()));
        namesList.forEach(System.out::println);
        System.out.println("-------------------------------");

        //Students by age
        Map<Integer,List<String>> mapOfAgeandNames = Students.getAll().stream()
                .collect(Collectors.groupingBy(IStudent::getAge,
                        Collectors.mapping(IStudent::getName, Collectors.toList())));
        mapOfAgeandNames.forEach((key, value) ->
                System.out.println("Key: "+key+" Value: "+value)
        );
        System.out.println("--------------------------------");

    }
}
