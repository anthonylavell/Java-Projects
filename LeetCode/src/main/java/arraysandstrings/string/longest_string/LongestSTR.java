package arraysandstrings.string.longest_string;
/*
Given a string, find the length of the longest substring without repeating characters.

Example 1:

Input: "abcabcbb"
Output: 3
Explanation: The answer is "abc", with the length of 3.
Example 2:

Input: "bbbbb"
Output: 1
Explanation: The answer is "b", with the length of 1.
Example 3:

Input: "pwwkew"
Output: 3
Explanation: The answer is "wke", with the length of 3.
             Note that the answer must be a substring, "pwke" is a subsequence and not a substring.
 */

public class LongestSTR {
    public static int lengthOfLongestSubstring(String s){
        int total = 0;
        String tempStr = "";
        for(char ch : s.toCharArray()){
            if(tempStr.indexOf(ch) >= 0){
                if(total < tempStr.length()){
                    total = tempStr.length();
                }
                tempStr=(tempStr.charAt(tempStr.length()-1) == ch) ? "" : tempStr.substring((tempStr.indexOf(ch)+1));
            }
            tempStr+=ch;
        }
        return (total < tempStr.length()) ? tempStr.length() : total;
    }
}
