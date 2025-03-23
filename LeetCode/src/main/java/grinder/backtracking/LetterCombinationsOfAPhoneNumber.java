package grinder.backtracking;

import java.util.ArrayList;
import java.util.List;

public class LetterCombinationsOfAPhoneNumber {
    private static String [] arrayOfStr;
    public static void main(String[] args) {
        String str = "234";
        List<String>listOfStr = letterCombinations(str);
        System.out.println(listOfStr);

    }
    public static List<String> letterCombinations(String digits) {
        arrayOfStr = new String[] {"","","abc","def","ghi","jkl","mno","pqrs","tuv","wxyz"};
        List<String>listOfStr = new ArrayList<>();
        findLetterCombinations(digits,"",0,listOfStr);
        return listOfStr;
    }

    protected static void findLetterCombinations(String digits,String storeStr,int size,List<String>listOfStr) {
        if(digits.length() - size == 0){
            if(storeStr.length() > 0 && storeStr.length()== size){
                listOfStr.add(storeStr);
            }
            return;
        }
        String phoneStr =arrayOfStr[digits.charAt(size)-'0'];
        for(char ch :phoneStr.toCharArray()){
            findLetterCombinations(digits,storeStr+ch,size+1,listOfStr);
        }
    }

}
