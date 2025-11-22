package grinder;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Practice {

    public static boolean wordBreak(String s, List<String> wordDict) {
        Set<String>setWordDict = new HashSet<>(wordDict);
        int len = s.length();
        boolean[]dp = new boolean[len+1];
        dp[0] = true;
        for (int end = 1; end <= len; end++){
            for (int start = 0; start <end; start++){
                if (dp[start] && setWordDict.contains(s.substring(start,end))){
                    dp[end] =true;
                    break;
                }
            }
        }
        return dp[len];
    }
    public static void main(String[] args) {
        /*String s = "applepenapple";
        List<String> wordDict = List.of("apple","pen");*/
        String s =  "catsandog";
        List<String> wordDict = List.of("cats","dog","sand","and","cat");
        System.out.println(wordBreak(s,wordDict));

    }
}
