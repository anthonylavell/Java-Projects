package com.modernjava.javaimprovements;

import java.time.LocalDate;

public class SwitchExpressionEnhancementExample {
    public static void main(String[] args) {
        String month="JANUARY";
        String quarter = switch(month){
            case "JANUARY","FEBURARY","MARCH" -> {
                var isLeapYear = LocalDate.now().isLeapYear();
                yield (isLeapYear ? "FIRST QUARTER - LEAP YEAR": "FIRST QUARTER");
            }
            case "APRIL","MAY","JUNE" -> "SECOND QUARTER";
            default -> "UNKNOWN QUARTER";
        };
        System.out.println("quarter = " + quarter);

    }
}
