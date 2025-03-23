package leetcode.string;

import java.util.Stack;

public class KDigit {
    public static String removeKdigits(String num, int k) {
        if(num.length() == k){
            return "0";
        }
        int size = num.length()-k;
        String resultStr ="";
        Stack<Character> stack = new Stack<>();
        int count = 0;
        while (count < num.length() ){
            if(stack.empty() || (k < 1 && stack.size() < size) || stack.peek() <= num.charAt(count)){
                stack.add(num.charAt(count));
                count++;
            }else if(stack.peek() > num.charAt(count)) {
                k--;
                stack.pop();
            }
        }

        while (stack.size() > size){
            stack.pop();
        }
        while (stack.firstElement() == '0' && stack.size()>1){
            stack.remove(0);
        }

        for(char ch : stack){
            resultStr+=ch;
        }

        return resultStr;
    }
}
