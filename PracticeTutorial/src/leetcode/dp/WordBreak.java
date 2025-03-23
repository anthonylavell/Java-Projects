package leetcode.dp;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class WordBreak {
    public static void main(String[] args) {
        String s = "leetcode";
        String s2 = "applepenapple";
        String s3 = "leetcodepen";
        List<String> wordDict = new ArrayList<>(Arrays.asList("leet","code"));
        System.out.println(wordDict.contains('e'));
        List<String> wordDict2 = new ArrayList<>(Arrays.asList("apple","pen"));
        String s4 = "catsandog";
        List<String> wordDict3 = new ArrayList<>(Arrays.asList("cats","dog","sand","and","cat"));
        String s5 = "aaaaaaa";
        List<String> wordDict5 = new ArrayList<>(Arrays.asList("aaaa","aaa"));
        System.out.println(wordBreak(s5,wordDict5));
    }
    public static boolean wordBreak(String s, List<String> wordDict) {
        boolean [] dp = new boolean[s.length()+1];
        dp[dp.length-1] = true;
        for(int i = s.length()-1; i >=0; i--){
            char ch = s.charAt(i);
           for (int x = 0; x <wordDict.size(); x++){
               String tempWord = wordDict.get(x);
               if(ch == tempWord.charAt(0) && (i+tempWord.length()<=s.length())){
                   if(dp[i]){
                       break;
                   }
                   String tempStr = s.substring(i,(i+tempWord.length()));
                   if(!dp[i] && tempStr.equals(tempWord)){
                       dp[i] = dp[i+tempWord.length()];
                   }
               }
           }
        }
        return dp[0];
    }
}
