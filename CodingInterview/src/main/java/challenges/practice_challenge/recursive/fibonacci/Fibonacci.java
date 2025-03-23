package challenges.practice_challenge.recursive.fibonacci;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Fibonacci {
    public static int fibonacciIterative(int number){ // O{n)
        List<Integer> fib = new ArrayList<>(Arrays.asList(0,1));
        for(int i = 2; i <= number; i++){
            fib.add( fib.get((i-1)) + fib.get((i-2)));
        }
       return fib.get(number);
    }

    public static int fibonacciRecursive(int num){ // 0(2^n)
        if(num <2){
            return num;
        }
        return fibonacciRecursive(num-1) + fibonacciRecursive(num-2);
    }

}
