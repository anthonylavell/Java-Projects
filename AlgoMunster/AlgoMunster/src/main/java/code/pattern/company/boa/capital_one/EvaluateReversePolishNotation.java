package code.pattern.company.boa.capital_one;

import java.util.Stack;

public class EvaluateReversePolishNotation {
    public static void main(String[] args) {
        String[] tokens = {"2","1","+","3","*"};
        String[] tokens2 = {"4","13","5","/","+"};
        String[] tokens3 = {"10","6","9","3","+","-11","*","/","*","17","+","5","+"};
        String[] tokens4 = {"18"};
        System.out.println(evalRPN(tokens4));
    }
    public static int evalRPN(String[] tokens) {
        Stack<Integer> numbers = new Stack<>();
        for (String token : tokens){
            int num;
            switch (token){
                case "+","-","*","/" ->{
                    num = getTotal(token, numbers.pop(), numbers.pop());
                }
                default -> {
                    num = Integer.parseInt(token);
                }
            }
            numbers.add(num);
        }
        return numbers.pop();
    }

    private static int getTotal(String sign, int num, int num2){
        switch (sign){
            case "+"-> {
                return num2 + num;
            }
            case "-"->{
                return num2 - num;
            }
            case "*"-> {
                return num2 * num;
            }
            default -> {
                return num2 / num;
            }
        }
    }
}
