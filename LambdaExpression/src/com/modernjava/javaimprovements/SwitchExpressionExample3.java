package com.modernjava.javaimprovements;

public class SwitchExpressionExample3 {
    public static void main(String[] args) {
        String month="JANUARY";
       switch(month){
            case "JANUARY","FEBURARY","MARCH" -> System.out.println("FIRST QUARTER");
            case "APRIL","MAY","JUNE" -> System.out.println("SECOND QUARTER");
            default -> System.out.println("UNKNOWN QUARTER");
        }

    }
}
