/*
Write a function to find the longest common prefix string amongst an array of strings.

If there is no common prefix, return an empty string "".



Example 1:

Input: strs = ["flower","flow","flight"]
Output: "fl"
Example 2:

Input: strs = ["dog","racecar","car"]
Output: ""
Explanation: There is no common prefix among the input strings.
 */
package arraysandstrings.array;

public class LongestCommonPrefix {
    public static String longestCommonPrefix(String[] strs) {
        if (strs[0].isEmpty()){
            return "";
        }
        StringBuilder prefix = new StringBuilder();
        String firstStr = strs[0];
        for (int row = 0; row < strs[0].length(); row++) {
            char ch = firstStr.charAt(row);
            for (int col = 1; col < strs.length; col++) {
                if (row >= strs[col].length() || strs[col].charAt(row) != ch) {
                    return prefix.toString();
                }
            }
            prefix.append(ch);
        }
        return prefix.toString();
    }

    public static void main(String[] args) {
        String[] strs = {""};
        System.out.println(longestCommonPrefix(strs));
    }
}
