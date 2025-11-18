package arraysandstrings.string;

import java.util.*;

public class WordBreak {
    public static boolean wordBreak2(String s, List<String> wordDict) {
        Set<String>setOfStrings = new HashSet<>(wordDict);
        boolean[]dp = new boolean[s.length()+1];
        dp[0]=true;
        for (int right = 1; right < dp.length; right++){
            for (int left = 0; left < right; left++){
                if (dp[left] && setOfStrings.contains(s.substring(left,right))){
                    dp[right]=true;
                    break;
                }
            }
        }
        return dp[s.length()];
    }


    public static void main(String[] args) {
        List<String> wordDict = new ArrayList<>(Arrays.asList("cats","dog","sand","and","cat"));
        List<String> wordDict1 = new ArrayList<>(Arrays.asList("leet","code"));
        String str = "catsandog";
        //System.out.println(wordDict1.contains("l"));
        str = "leetcode";
        System.out.println(wordBreak2(str,wordDict1));
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
