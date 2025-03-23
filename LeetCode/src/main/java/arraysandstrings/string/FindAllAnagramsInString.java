package arraysandstrings.string;

import java.util.ArrayList;
import java.util.List;

public class FindAllAnagramsInString {
    public static void main(String[] args) {
        String s = "cbaebabacd", p = "abc";
        String s3 = "abacbabc";
        String p3 = "abc";
        String s4 = "abaacbabc";
        String s5 = "acdcaeccdec";
        String p5 = "c";
        System.out.println(findAnagrams(s,p));
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
            if(letters[s.charAt(right++) - 'a']-- >= 1){
                count--;
            }
            if(count == 0){
                listOfInt.add(left);
            }
            if((right-left) == p.length() && letters[s.charAt(left++) - 'a']++ >= 0){
                count++;
            }
        }
        return listOfInt;
    }
}
