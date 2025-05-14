package grinder.stacks;

import java.util.Stack;

public class EvaluateReversePolishNotation {
    public static void main(String[] args) {
        String [] tokens = {"4","-2","/","2","-3","-","-"};
        int total = Integer.parseInt(tokens[0]);
        System.out.println(evalRPN(tokens));
    }

    public static int evalRPN(String[] tokens) {
        Stack<Integer>stack= new Stack<>();
        for (int index = 0; index < tokens.length; index++){
            int total = 0;
            if (tokens[index].equals("+") || tokens[index].equals("-") || tokens[index].equals("/") || tokens[index].equals("*")){
                int num = stack.pop();
                int num2 = stack.pop();
                total = getSum(tokens[index],num2,num );
            }else {
                total = Integer.parseInt(tokens[index]);
            }
            stack.add(total);
        }
        return stack.pop();
    }

    private static int getSum(String symbol, int num2, int num){
        return switch (symbol) {
            case "/" ->  num2/= num;
            case "*" ->  num2*= num;
            case "-" ->  num2-= num;
            default ->   num2+=num;
        };
    }
}
