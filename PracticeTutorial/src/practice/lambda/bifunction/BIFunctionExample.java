package practice.lambda.bifunction;

import abstractclass.IStudent;
import concrete.Students;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.function.BiFunction;
import java.util.function.Predicate;

public class BIFunctionExample {
    public static void main(String[] args) {
        BiFunction<Integer,Integer,String> greaterThan20 =
                ((firstNum, secondNum) ->{
                    Integer total = firstNum+secondNum;
                    return (total > 20) ? "The total is greater than 20" :"The total is" +
                            " least than 20";
                }
        );
        Integer firstNum = 10;
        Integer secondNum = 5;
        System.out.println(greaterThan20.apply(firstNum,secondNum));
        System.out.println("-------------------------------------------");

        BiFunction<List<IStudent>,Predicate<IStudent>, Map<String, Double>> biFunc =
                ((listOfStudent, studentGPA) -> {
                    Map<String,Double> mapOfStudentsGPA = new HashMap<>();
                    listOfStudent.forEach((student) -> {
                        if (studentGPA.test(student)) {
                            mapOfStudentsGPA.put(student.getName(), student.getGPA());
                        }
                    }
                );
                    return mapOfStudentsGPA;
                });
        List<IStudent>listOfStudents = Students.getAll();
        Predicate<IStudent> students = (student) -> student.getGPA() > 3.4;
        System.out.println(biFunc.apply(listOfStudents,students));
    }
}
