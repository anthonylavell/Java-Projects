package grinder.backtracking;

import java.util.ArrayList;
import java.util.List;

public class GenerateParentheses {
    public static void main(String[] args) {
        int n = 8;
        //List<String> listOfStr = new ArrayList<>(Arrays.asList("((()))","(()())","(())()","()(())","()()()"));
        generateParenthesis(n);
    }

    public static List<String> generateParenthesis(int n) {
        List<String>listOfParenthesis = new ArrayList<>();
        isPair("",n,0,0,listOfParenthesis);
        return listOfParenthesis;
    }
    private static void isPair(String str,int num, int openP, int closeP,List<String> ans){
        if(str.length() == num * 2){
            ans.add(str);
            return;
        }
        if(openP < num){
            isPair(str+"(",num,openP+1,closeP,ans);
        }

        if(closeP < openP ){
            isPair(str+")",num,openP,closeP+1,ans);
        }
    }
}
