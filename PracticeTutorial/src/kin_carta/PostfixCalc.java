package kin_carta;

import java.util.Stack;

public class PostfixCalc {
    public static void main(String[] args) {
        String [] tokens = {"9","2","1","1","*","-5","+","/","+"};
        String [] tokens2 = {"10","6","9","3","+","-11","*","/","*","17","+","5","+"};
        String [] tokens3 = {"10","6","9","3","+","-11","*","/","+","17","+","5","+"};
        String [] tokens4 = {"10"};
        System.out.println(evalRPN(tokens));
    }
    public static int evalRPN(String[] tokens) {
        String operand = "+-/*";
        Stack<Integer> stack = new Stack<>();
        for(int i = 0; i < tokens.length; i++){
            if(operand.indexOf(tokens[i]) > -1){
                int left = stack.pop();
                int right = stack.pop();
               stack.add(operator(tokens[i],right,left));
            }else {
                stack.add(Integer.parseInt(tokens[i]));
            }

        }
        return stack.pop();
    }

    public static int operator(String operator, int num, int num2){
        switch (operator){
            case "+" : return num + num2;
            case "-" : return num - num2;
            case "*" : return num * num2;
            default: return num / num2;
        }
    }
}
