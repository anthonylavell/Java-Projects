package practice.modernjava.funcprogramming;

import java.util.function.Consumer;

public class ConsumerExample {
    public static void main(String[] args) {

        Consumer<Integer>consumerInteger =
               (num) -> System.out.println("Number is "+num+"\n"+num+" times 3 is: "+num*3);

            consumerInteger.accept(9);


        }

}
