package arraysandstrings.string;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class WordBreak {
    public static void main(String[] args) {
        List<String> wordDict = new ArrayList<>(Arrays.asList("cats","dog","sand","and","cat"));
        List<String> wordDict1 = new ArrayList<>(Arrays.asList("leet","code"));
        String str = "catsandog";
        System.out.println(wordDict1.contains("l"));
        str = "leetcode";
       wordBreak(str,wordDict1);
    }
    public static boolean wordBreak(String s, List<String> wordDict) {
        boolean [] dp = new boolean[s.length()+1];
        dp[dp.length-1] = true;
        for(int index = s.length()-1; index >= 0; index--){
            char letter = s.charAt(index);
            for(int row = 0; row < wordDict.size(); row++ ){
                String word = wordDict.get(row);
                if(letter == word.charAt(0) && index + word.length() <= s.length()){
                    if(dp[index]){
                        break;
                    }
                    String tempWord = s.substring(index, index+word.length());
                    if(tempWord.equals(word)){
                        dp[index] = dp[index+word.length()];
                    }
                }
            }
        }
        return dp[0];
    }
}
