package arraysandstrings.string.valid_parentheses;

import java.util.Stack;

public class ValidParentheses {
    public static void main(String[] args) {
        String str = "(])";
        System.out.println(isValid(str));
    }
    public static boolean isValid(String str) {
        Stack<Character> stackOfChar = new Stack();
        for(char ch: str.toCharArray()){
            if(!stackOfChar.empty() && ch == '}' || ch == ')' || ch == ']'){
                if(stackOfChar.peek() == '{' && ch == '}'){
                        stackOfChar.pop();
                } else if(stackOfChar.peek() == '(' && ch == ')') {
                        stackOfChar.pop();
                } else if(stackOfChar.peek() == '['&& ch == ']') {
                        stackOfChar.pop();
                }else {
                    stackOfChar.push(ch);
                    break;
                }
            }else {
                stackOfChar.push(ch);
            }
        }
        return stackOfChar.empty();
    }
}
