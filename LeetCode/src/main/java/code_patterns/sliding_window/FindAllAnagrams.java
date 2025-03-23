package code_patterns.sliding_window;

import java.util.*;

public class FindAllAnagrams {
    public static void main(String[] args) {
        String s = "cbaebabacd";
        String p = "abc";
        System.out.println(findAnagrams(s,p));
        //System.out.println();
    }

    public static List<Integer> findAnagrams(String s, String p) {
        int[] letters = new int[26];
        List<Integer> listOfInt = new ArrayList<>();
        int left = 0;
        int right = 0;
        int count = p.length();
        for(char ch : p.toCharArray()){
            letters[ch-'a']++;
        }
        while (right < s.length()){
            if(letters[s.charAt(right++) - 'a']-- >=1){
                count--;
            }
            if(count == 0){
                listOfInt.add(left);
            }
            if(right-left == p.length() && letters[s.charAt(left++) - 'a']++ >=0){
                count++;
            }
        }
        return listOfInt;
    }
}
