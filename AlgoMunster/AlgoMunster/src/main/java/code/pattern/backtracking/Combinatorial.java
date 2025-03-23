package code.pattern.backtracking;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;
import java.util.stream.Collectors;

public class Combinatorial {
    public static void main(String[] args) {
        letterCombination(4);
    }

    public static List<String> letterCombination(int n) {
        // WRITE YOUR BRILLIANT CODE HERE
        List<String>listOfChars = new ArrayList<>();
        //findLetterComb(n,listOfChars,"");
        Stack<Character> stackOfChars = new Stack<>();
        findLetterComb2(n,listOfChars,new Stack<>());
        System.out.println(listOfChars.size());
        return listOfChars;
    }

    private static void findLetterComb(int n, List<String>listOfChars, String str){
        if(str.length() == n){
            listOfChars.add(str);
            return;
        }
        findLetterComb(n,listOfChars,str+'a');
        findLetterComb(n,listOfChars,str+'b');
    }

    private static void findLetterComb2(int n,List<String>listOfChars, Stack<Character>stackOfChars) {
        if(stackOfChars.size() == n){
            String tempStr = stackOfChars.stream().map(s -> s.toString()).collect(Collectors.joining());
            listOfChars.add(tempStr);
            return;
        }
        for(char ch : new char[] {'a','b'}){
            stackOfChars.add(ch);
            findLetterComb2(n,listOfChars,stackOfChars);
            stackOfChars.pop();
        }
    }
}
