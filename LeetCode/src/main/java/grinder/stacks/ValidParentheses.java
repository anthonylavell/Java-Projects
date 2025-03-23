/*
Given a string s containing just the characters '(', ')', '{', '}', '[' and ']',
determine if the input string is valid.

An input string is valid if:

Open brackets must be closed by the same type of brackets.
Open brackets must be closed in the correct order.
Every close bracket has a corresponding open bracket of the same type.
 */
package grinder.stacks;

import java.util.HashMap;
import java.util.Map;
import java.util.Stack;

public class ValidParentheses {
    public static void main(String[] args) {
        String str = "()";
        System.out.println(isValid(str));
    }
    public static boolean isValid(String str) {
        Stack<Character> stackOfChar = new Stack<>();
        for(char ch : str.toCharArray()){
            if(ch == '}' || ch == ']' || ch == ')'){
                if(stackOfChar.empty()){
                    return false;
                }
                char tempChar = stackOfChar.pop();
                if(ch == '}' && tempChar != '{' || ch == ']' && tempChar != '[' || ch == ')' && tempChar != '('){
                    return false;
                }
            }else {
                stackOfChar.add(ch);
            }
        }
        return stackOfChar.empty();
    }

    public static boolean isValid2(String str) {
        Stack<Character> stackOfChar = new Stack<>();
        Map<Character,Character> mapOfChar = getCharacterMap();
        for(char ch : str.toCharArray()){
            if(mapOfChar.containsKey(ch)){
                if(stackOfChar.empty() || mapOfChar.get(ch)!= stackOfChar.pop()){
                    return false;
                }
            }else {
                stackOfChar.add(ch);
            }

        }
        return stackOfChar.empty();
    }
    private static Map<Character,Character> getCharacterMap(){
        Map<Character,Character> mapOfChar = new HashMap<>(3);
        mapOfChar.put('}','{');
        mapOfChar.put(']','[');
        mapOfChar.put(')','(');
        return mapOfChar;
    }
}
