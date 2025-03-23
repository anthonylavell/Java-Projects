package practice.lambda.joining;

import abstractclass.IStudent;
import concrete.Students;

import java.util.stream.Collectors;
import java.util.stream.Stream;

public class JoiningExample {
    public static void main(String[] args) {
        String result = Stream.of("E","F","G","H").collect(Collectors.joining());
        System.out.println("result = " + result);
        System.out.println("---------------------------");

        result = Stream.of("E","F","G","H").collect(Collectors.joining(","));
        System.out.println("result2 = " + result);
        System.out.println("---------------------");

        result = Stream.of("E","F","G","H").collect(Collectors.joining(",","{","}"));
        System.out.println("result3 = " + result);
        System.out.println("---------------------------");

        //instructors names separated by ' and prefix { and suffix }
        String namesConcatenated = Students.getAll().stream()
                                    .map(IStudent::getName)
                                    .collect(Collectors.joining(",","{","}"));

        System.out.println("namesConcatenated = " + namesConcatenated);
        System.out.println("-----------------------------------");

        String majorConcatenated = Students.getAll().stream()
                                .map(IStudent::getMajor)
                                .collect(Collectors.joining(",","{","}"));
        System.out.println("majorConcatenated = " + majorConcatenated);

    }
}
