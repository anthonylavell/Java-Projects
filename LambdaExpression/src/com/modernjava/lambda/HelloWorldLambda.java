package com.modernjava.lambda;

public class HelloWorldLambda {
    public static void main(String [] args){
        // implementing sayHelloWorld Using Lambda
       /* HelloWorldInterface helloWorldInterface = () -> {
            return "Hello World";
        };*/
       HelloWorldInterface helloWorldInterface = () -> "Hello World";
        System.out.println(helloWorldInterface.sayHelloWorld());

    }
}
