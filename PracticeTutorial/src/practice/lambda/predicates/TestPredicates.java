package practice.lambda.predicates;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class TestPredicates {
    public static void main(String[] args) {
       List<Integer> listOfAges = new ArrayList<Integer>(Arrays.asList(14,23,10,35,30));
       Integer num1 = 14;
       Integer num2 = 24;
       /* compareNum(num1,(num)-> num > num2);
        compareNum(num1,(num)-> num < num2);
        compareNum(listOfAges,(num)-> num < num2);*/

       /* compareNum(num1, new Predicate<Integer>() {
            @Override
            public boolean test(Integer integer) {
                return integer > num2;
            }
        });*/

       /* IntPredicate greaterThan15 = i -> i > 15;
        IntPredicate lessThan100 = i -> i <100;
        System.out.println(greaterThan15.test(10));
        int a = 25;
        System.out.println(greaterThan15.test(a+5));
        System.out.println(greaterThan15.and(lessThan100).test(50));
        System.out.println(greaterThan15.and(lessThan100).test(15));*/

        Random random = new Random();
        Supplier<Integer> randomSupplier = () -> random.nextInt(100);
        for(int i =0; i < 5; i++){
            System.out.println(randomSupplier.get());
        }
    }

    public static void compareNum(Integer num,Predicate<Integer>ages) {
        //for (Integer i : listOfAge){
            if (ages.test(num)) {
                System.out.println(num);
            }else{
                System.out.println("No");
            }
        // }
    }

    public static void compareNum(List <Integer> listOfAge,Predicate<Integer>ages) {
        for (Integer age : listOfAge){
            if (ages.test(age)) {
                System.out.println(age);
            }else{
                System.out.println("No");
            }
         }
    }
}


