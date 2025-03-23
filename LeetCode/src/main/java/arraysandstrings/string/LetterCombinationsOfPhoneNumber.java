package arraysandstrings.string;

import java.util.ArrayList;
import java.util.List;

public class LetterCombinationsOfPhoneNumber {
    public static void main(String[] args) {
        String digits = "22";
        letterCombinations(digits);
    }

    public static List<String> letterCombinations(String digits) {
        String[] letters = {"","1","abc","def","ghi","jkl","mno","pqrs","tuv","wxyz"};
        List<String> list = new ArrayList<>();
        helpFindLetterCombinations(digits,"",0, list,letters );
        return (list.size() < 2) ? new ArrayList<>() : list;
    }

    private static void helpFindLetterCombinations(String digits,String str,int count, List<String> list, String[] letters){
        if(count > digits.length()-1){
            list.add(str);
            return;
        }
        int num = (digits.charAt(count)-48);
        for(int i = 0; i < letters[num].length(); i++){
            helpFindLetterCombinations(digits,str+letters[num].charAt(i),count+1,list,letters);
        }
    }

}
