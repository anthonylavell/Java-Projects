package code.pattern.backtracking;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class LetterCombinationsOfAPhoneNumber {
    private static Map<Character,String> mapOfStr;
    public static void main(String[] args) {
        String str = "234";
        List<String>listOfStr = letterCombinationsOfPhoneNumber(str);
        System.out.println(listOfStr);

    }
    public static List<String> letterCombinationsOfPhoneNumber(String digits) {
        mapOfStr = Map.of('2',"abc",'3',"def",'4',"ghi",
                '5',"jkl",'6',"mno",'7',"pqrs",'8',"tuv",
                '9',"wxyz");
        List<String>listOfStr = new ArrayList<>();
        findLetterCombinations(digits,"",0,listOfStr);
        return listOfStr;
    }

    private static void findLetterCombinations(String digits,String storeStr,int size,List<String>listOfStr) {
        if(digits.length() - size == 0){
            if(storeStr.length() > 0 && storeStr.length()== size){
                listOfStr.add(storeStr);
            }
            return;
        }
        String phoneStr =mapOfStr.get(digits.charAt(size));
        for(char ch :phoneStr.toCharArray()){
            findLetterCombinations(digits,storeStr+ch,size+1,listOfStr);
        }
    }

}
