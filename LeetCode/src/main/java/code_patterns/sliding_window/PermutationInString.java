package code_patterns.sliding_window;

import java.util.HashMap;
import java.util.Map;

/*
Given two strings s1 and s2, return true if s2 contains a permutation of s1, or false otherwise.

In other words, return true if one of s1's permutations is the substring of s2.
 */
public class PermutationInString {
    public static void main(String[] args) {
        String s1 = "a";
        String s2 = "a";
        System.out.println(PermutationInString.checkInclusion(s1,s2));
    }

    public static boolean checkInclusion(String s1, String s2) {
        if (s1.length() > s2.length()) {
            return false;
        }
        int leftIndex = 0;
        int rightIndex = 0;
        int count = 0;
        Map<Character,Integer> mapOfChars = new HashMap<>(s1.length());
        for(char ch : s1.toCharArray()){
            mapOfChars.put(ch,mapOfChars.getOrDefault(ch,0)+1);
        }
        while (rightIndex<s2.length()){
            char rightChar = s2.charAt(rightIndex);
            if(mapOfChars.containsKey(rightChar) && mapOfChars.get(rightChar) > 0){
                mapOfChars.put(rightChar,mapOfChars.get(rightChar)-1);
                count++;
                if(count== s1.length()){
                    return true;
                }
            }else{
                while (leftIndex <= rightIndex){
                    char leftChar = s2.charAt(leftIndex);
                    leftIndex++;
                    if(mapOfChars.containsKey(leftChar)){
                        if(rightChar == leftChar){
                            break;
                        }
                        count--;
                        mapOfChars.put(leftChar,mapOfChars.get(leftChar)+1);
                    }
                }
            }
            rightIndex++;
        }
        return false;
    }
}
