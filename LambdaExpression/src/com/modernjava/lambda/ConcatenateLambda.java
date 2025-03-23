package com.modernjava.lambda;

public class ConcatenateLambda {
    public static void main(String[] args) {
        IConcatenate concatenate = (a,b) -> a+" "+b;
        String concatenateStr = concatenate.sconcat("Hello", "World");
        System.out.println(concatenate.sconcat("Hello","Tony"));
        System.out.println("concatenateStr = " + concatenateStr);
    }
}
