package practice.lambda.methodreference;

import abstractclass.IStudent;

import java.util.function.Function;
import java.util.function.Predicate;

public class MethodReferenceExample {
    public static void main(String[] args) {
        Function<Integer,Double> sqrt = (num)-> Math.sqrt(num);
        Function<Integer,Double> sqrt2 = Math::sqrt;
        Predicate<IStudent> p1 = (student) -> student.onlineClass();
        Predicate<IStudent> p2 = IStudent::onlineClass;
    }
}
