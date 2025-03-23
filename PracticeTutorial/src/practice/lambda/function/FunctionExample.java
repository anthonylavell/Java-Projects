package practice.lambda.function;

import abstractclass.IStudent;
import concrete.Students;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.function.Function;

public class FunctionExample {
    public static void main(String[] args) {
        Function<Integer,Double> sqrt = n -> Math.sqrt(n);

        Function<String, String> lowercaseFunction = (s) -> s.toLowerCase();

        Function<String, String> concatFunction = s -> s.concat(" In Java");

        System.out.println(lowercaseFunction.andThen(concatFunction).apply("Programming"));
        System.out.println(lowercaseFunction.compose(concatFunction).apply("Programming"));
        Function<List<IStudent>, Map<String, Integer>> mapFunction  = ( students ->
        { Map<String, Integer> map = new HashMap<>();
        students.forEach( student -> {
            map.put(student.getName(), student.getAge());
        });

                return map;
        });
        System.out.println(mapFunction.apply(Students.getAll()));
    }
}
