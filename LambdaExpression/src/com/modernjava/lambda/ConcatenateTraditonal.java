package com.modernjava.lambda;

public class ConcatenateTraditonal implements IConcatenate {

    @Override
    public String sconcat(String a, String b) {
        return a+" "+b;
    }

    public static void main(String[] args) {
        ConcatenateTraditonal concatenateTraditonal = new ConcatenateTraditonal();
        System.out.println(concatenateTraditonal.sconcat("Hello","World"));
    }
}
