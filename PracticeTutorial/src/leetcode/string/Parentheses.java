package leetcode.string;

import java.util.Stack;

public class Parentheses {
    public static boolean isValid(String s) {
        if(s.length() == 1 || s == null){
            return false;
        }
        Stack<Character> stack = new Stack();
        for(int i = 0;  i < s.length(); i++) {
            if(stack.empty() && (s.charAt(i) == '}' || s.charAt(i) == ')' || s.charAt(i) == ']')){
                return false;
            }
            if (s.charAt(i)== '{' || s.charAt(i) == '(' || s.charAt(i) == '[') {
                stack.add(s.charAt(i));
            } else {
                    if((stack.peek() == '{' && s.charAt(i) =='}') || (stack.peek() == '[' && s.charAt(i) ==']') || (stack.peek() == '(' && s.charAt(i) ==')')  ){
                        stack.pop();
                    }else {
                        break;
                    }
            }
        }
        return stack.empty();
    }

    public static boolean isValid2(String s) {
        if (s.length() == 1 || s == null) {
            return false;
        }
        int pos = -1;
        char [] stringOfCharacters = new char[s.length()];
        for(char ch : s.toCharArray()) {
            if (ch == '{') {
                stringOfCharacters[++pos] = '}';
            } else if (ch == '(') {
                stringOfCharacters[++pos] = ')';
            } else if (ch == '['){
                stringOfCharacters[++pos] = ']';
            } else {
                if (pos < 0 || ch != stringOfCharacters[pos]) {
                    return false;
                }
                pos--;
            }
        }
        return pos == -1;
    }

}
