package com.modernjava.javaimprovements;

public class SwitchExpressionExample2 {
    public static void main(String[] args) {
        String month="JANUARY";
        String quarter = switch(month){
            case "JANUARY","FEBURARY","MARCH" -> "FIRST QUARTER";
            case "APRIL","MAY","JUNE" -> "SECOND QUARTER";
            default -> "UNKNOWN QUARTER";
        };
        System.out.println("quarter = " + quarter);
    }
}
