package arraysandstrings.string;

import java.util.*;

public class WordBreak {
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
        List<String> wordDict = new ArrayList<>(Arrays.asList("cats","dog","sand","and","cat"));
        List<String> wordDict1 = new ArrayList<>(Arrays.asList("leet","code"));
        String str = "catsandog";
        //System.out.println(wordDict1.contains("l"));
        str = "leetcode";
        System.out.println(wordBreak(str,wordDict1));
    }
}
