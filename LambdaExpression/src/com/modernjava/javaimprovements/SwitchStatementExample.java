package com.modernjava.javaimprovements;

public class SwitchStatementExample {
    public static void main(String[] args) {
        String month="JANUARY";
        String quarter ="";
        switch (month){
            case "JANUARY":
                quarter ="First Quarter";
                break;
            case "FEBURARY":
                quarter ="First Quarter";
                break;
            case "March":
                quarter ="First Quarter";
                break;
            case "April":
                quarter ="Second Quarter";
            case "May":
                quarter ="Second Quarter";
                break;
            case "June":
                quarter ="Second Quarter";
                break;
            default:
                 quarter = "UNKNOWN QUARTER";
                 break;
        }
        System.out.println("quarter = " + quarter);
    }
}
