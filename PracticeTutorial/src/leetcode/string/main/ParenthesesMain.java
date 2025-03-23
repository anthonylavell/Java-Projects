package leetcode.string.main;

import leetcode.string.Parentheses;

public class ParenthesesMain {
    public static void main(String[] args) {
        //String s = "(){}[]";
        //String s = "({}[])";
        //String s = "({[]})";
        String s = "({[])}";
        //String s = "(]";
        //String s = "";
        //String s = "}(";
        System.out.println(Parentheses.isValid2(s));
    }
}
