package practice.java8interfaces.defaults;

import practice.java8interfaces.abstractclass.ICalculator;

public class MathOperationsExample implements ICalculator {
    public static void main(String[] args) {
        MathOperationsExample mathOperationsExample = new MathOperationsExample();
        System.out.println("Sum: "+mathOperationsExample.sum(2,4));
        System.out.println("Sum: "+mathOperationsExample.divide(4,2));

        //our implementation using Lambda expression for sum and divide
        ICalculator calculator = (num1, num2) -> num1%num2;
        System.out.println("Calculator override using lambda " + calculator.sum(2,4));

        System.out.println("Subtract: "+ mathOperationsExample.subtract(4,2));
        System.out.println("Multiply: "+ ICalculator.multiply(4,2));
    }

    @Override
    public int sum(int num1, int num2) {
        return 0;
    }


}
