package grinder.backtracking;

import java.util.*;

public class WordBreak {
    private static Set<String> memoization = new HashSet<>();
    public static void main(String[] args) {
        String str = "cars";
        List<String> wordDict = new ArrayList<>(Arrays.asList("car","ca","rs"));
        System.out.println(wordBreak(str,wordDict));
    }
    public static boolean wordBreak(String str, List<String> wordDict) {
        if(memoization.contains(str)){
            return false;
        }
        if(str.isEmpty()){
            return true;
        }
        for(String word : wordDict){
            if(str.startsWith(word)){
                if(wordBreak( str.substring(word.length()) ,wordDict)){
                    return true;
                }
            }
        }
        memoization.add(str);
        return false;
    }


}
