package grinder.strings;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class FindCommonCharacters {
    public static void main(String[] args) {
        String [] words = {"cool"};
        //System.out.println(commonChars(words));
        System.out.println((char)(3));
    }

    public static List<String> commonChars(String[] words) {
        List<String> listOfStrings = new ArrayList<>();
        int [] letters = new int[26];
        Arrays.fill(letters,Integer.MAX_VALUE);
        for (String word : words){
            int [] foundL = new int[26];
            for (char ch : word.toCharArray()){
                foundL[ch-'a']++;
            }
            for (int index = 0; index < letters.length; index++){
                letters[index] = Math.min(letters[index],foundL[index] );
            }
        }
        for (int index = 0; index < letters.length; index++){
            for (int fIndex = 0; fIndex < letters[index]; fIndex++){
                char ch = (char) ('a'+index);
                listOfStrings.add(ch+"");
            }
        }
        return listOfStrings;
    }
}
