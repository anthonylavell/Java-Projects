package com.modernjava.defaults;

public class MathOperationsExample implements Calcultor {
    public static void main(String[] args){
        MathOperationsExample mathOperationsExample = new MathOperationsExample();
        System.out.println("Sum: "+mathOperationsExample.sum(2,4));
        //System.out.println("Divide: "+mathOperationsExample.divide(4,2));
        //our implementation using Lambda expression for sum and divide
        Calcultor calcultor = (num1, num2) -> num1+num2;
        System.out.println("Calculator override using lambda "+ calcultor.sum(3,2));

        System.out.println("Subtract: "+ mathOperationsExample.subtract(4,2));
        System.out.println("Multiply: "+ Calcultor.multiply(4,2));
    }

    @Override
    public int sum(int num1, int num2) {
        return num1+num2;
    }

}
