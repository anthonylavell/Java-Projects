package com.modernjava.lambda;

public class IncrementByFiveTraditional implements IncrementByFive {
    @Override
    public int incrementByFive(int num) {
        return num +5;
    }

    public static void main(String[] args) {
        IncrementByFiveTraditional inc = new IncrementByFiveTraditional();
        System.out.println(inc.incrementByFive(2));
    }
}
