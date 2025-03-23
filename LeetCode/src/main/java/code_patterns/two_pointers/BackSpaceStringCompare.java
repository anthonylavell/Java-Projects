package code_patterns.two_pointers;

import java.util.Stack;

public class BackSpaceStringCompare {
    public static void main(String[] args) {
        String str = "y#fo##f";
        String str2 = "y#f#o##f";

        System.out.println(backspaceCompare(str,str2));

    }
    public static boolean backspaceCompare(String s, String t) {
       s=findLetters2(s);
        t=findLetters2(t);
        return s.equals(t);
    }

    private static String findLetters(String str){
        char [] chars = str.toCharArray();
        int leftIndex = -1;
        for(int rightIndex = 0; rightIndex < chars.length; rightIndex++){
            if(chars[rightIndex] == '#'){
                chars[rightIndex] =' ';
                if(leftIndex > -1 && chars[leftIndex] != ' '){
                    chars[leftIndex] =' ';
                }

                    while (leftIndex-1 > -1 && (chars[leftIndex] == ' ' )){
                        leftIndex--;
                    }

            }else {
                if (chars[++leftIndex] == ' '){
                    leftIndex = rightIndex;
                }
            }
        }
        return new String(chars).replaceAll("\\s+","");
    }

    private static String findLetters2(String str){
        Stack<Character>stackOfChars = new Stack<>();
        StringBuilder temp = new StringBuilder();
        for(char ch : str.toCharArray()){
            if(ch == '#'){
                if(!stackOfChars.isEmpty()){
                    stackOfChars.pop();
                }
            }else {
                stackOfChars.add(ch);
            }
        }
        while (!stackOfChars.empty()){
            temp.append(stackOfChars.pop());
        }
        return temp.toString();
    }
}
