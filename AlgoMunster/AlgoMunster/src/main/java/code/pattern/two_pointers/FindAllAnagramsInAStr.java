package code.pattern.two_pointers;

import java.util.ArrayList;
import java.util.List;

public class FindAllAnagramsInAStr {
    public static List<Integer> findAllAnagrams(String original, String check) {
        // WRITE YOUR BRILLIANT CODE HERE
        List<Integer> results = new ArrayList<>();
        int leftIndex = 0;
        int[] letters = new int[26];
        for(char ch : check.toCharArray()){
            letters[ch-'a']++;
        }
        for(int rightIndex =0; rightIndex < original.length(); rightIndex++){
            if(--letters[original.charAt(rightIndex)-'a'] < 0){
                while (letters[original.charAt(rightIndex)-'a'] < 0){
                    letters[original.charAt(leftIndex++)-'a']++;
                }
            }else if(rightIndex-leftIndex == check.length()-1){
                results.add(leftIndex);
                letters[original.charAt(leftIndex++)-'a']++;
            }
        }
        return results;
    }
}
