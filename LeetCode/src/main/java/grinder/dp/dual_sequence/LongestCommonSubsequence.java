/*
Given two strings text1 and text2, return the length of their longest
common subsequence. If there is no common subsequence, return 0.

A subsequence of a string is a new string generated from the original
string with some characters (can be none) deleted without changing the
relative order of the remaining characters.

For example, "ace" is a subsequence of "abcde".
A common subsequence of two strings is a subsequence that is common to
both strings.



Example 1:

Input: text1 = "abcde", text2 = "ace"
Output: 3
Explanation: The longest common subsequence is "ace" and its length is 3.
Example 2:

Input: text1 = "abc", text2 = "abc"
Output: 3
Explanation: The longest common subsequence is "abc" and its length is 3.
Example 3:

Input: text1 = "abc", text2 = "def"
Output: 0
Explanation: There is no such common subsequence, so the result is 0.


Constraints:

1 <= text1.length, text2.length <= 1000
text1 and text2 consist of only lowercase English characters.
 */
package grinder.dp.dual_sequence;

public class LongestCommonSubsequence {
    public static void main(String[] args) {
        String text1 = "abcde", text2 = "ace";
        System.out.println(longestCommonSubsequence(text1,text2));
    }

    public static int longestCommonSubsequence(String text1, String text2) {
        int[][] dp = new int[text1.length()+1][text2.length()+1];
        for (int row = 1; row< dp.length; row++){
            char rowCh = text1.charAt(row-1);
            for (int col = 1; col < dp[row].length; col++){
                char colCh = text2.charAt(col-1);
                dp[row][col] = (rowCh == colCh) ? dp[row-1][col-1] + 1 : Math.max(dp[row][col-1], dp[row-1][col]);
            }
        }
        return dp[text1.length()][text2.length()];
    }
}
