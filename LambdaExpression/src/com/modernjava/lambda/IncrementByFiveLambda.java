package com.modernjava.lambda;

public class IncrementByFiveLambda {
    public static void main(String[] args) {
        IncrementByFive incrementByFive = (num) -> num+5;
        System.out.println(incrementByFive.incrementByFive(2));
    }
}
