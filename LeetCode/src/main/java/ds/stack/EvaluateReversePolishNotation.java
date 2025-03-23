package ds.stack;

import java.util.Stack;

public class EvaluateReversePolishNotation {
    public static void main(String[] args) {
        String[] tokens = {"1","+","/","*","-","-11"};
        System.out.println(tokens[4].charAt(0) + 1);
        //evalRPN(tokens);
    }
    public static int evalRPN(String[] tokens) {
        Stack<Integer> stack = new Stack<>();
        for(String strOfInt : tokens){
            int num = 0;
            if(strOfInt.equals("+") || strOfInt.equals("-") ||strOfInt.equals("*") || strOfInt.equals("/")){
               int second = stack.pop();
               int first = stack.pop();
               num = helpEvalRPN(first,second,strOfInt);
            }else {
                num = Integer.parseInt(strOfInt);
            }
            stack.add(num);
        }
        return stack.pop();
    }

    private static int helpEvalRPN(int first, int second, String sign){
        switch (sign){
            case "+":
                return first + second;
            case "-":
                return first - second;
            case "*":
                return first * second;
            default:
                return first / second;
        }

    }
}
