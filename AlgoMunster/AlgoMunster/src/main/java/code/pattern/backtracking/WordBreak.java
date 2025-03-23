/*
Given a string and a list of words, determine if the string can be constructed from
concatenating words from the list of words. A word can be used multiple times.
Input:

target = "algomonster"
words = ["algo", "monster"]
Output: true

Input:

target = "aab"
words = ["a", "c"]
Output: false
 */

package code.pattern.backtracking;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class WordBreak {
    private static Set<String> memorize = new HashSet<>();
    public static boolean wordBreak(String str, List<String> words) {
        if(memorize.contains(str)){
            return false;
        }

        if(str.isEmpty()){
            return true;
        }

        for(String word: words){
            if(str.startsWith(word)){
                if(wordBreak(str.substring(word.length()),words)){
                    return true;
                }
            }
        }
        memorize.add(str);
        return false;
    }

}
