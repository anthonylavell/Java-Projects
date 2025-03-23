package practice.method_reference_operator;

import utility.AddNumbers;

import java.util.function.Function;

public class MethodReferenceExample {
    public static void main(String[] args) {
        Function<Integer,Integer> addBy2 = AddNumbers::byTwo;
        System.out.println("addByTwo = " + addBy2.apply(5));
        Function<Integer,Integer> addBy4  = AddNumbers::byFour;
        System.out.println("addByFour = " + addBy4.apply(9));
        Function<String,String> lowerCase = String::toLowerCase;
        System.out.println("lowerCase = " + lowerCase.apply("ANTHONY"));

    }
}
