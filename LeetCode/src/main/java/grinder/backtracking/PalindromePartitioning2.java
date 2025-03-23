/*
Given a string s, partition s such that every
substring of the partition is a palindrome.
Return all possible palindrome partitioning of s.

Example 1:
Input: s = "aab"
Output: [["a","a","b"],["aa","b"]]
 */

package grinder.backtracking;

import java.util.ArrayList;
import java.util.List;

public class PalindromePartitioning2 {
    public static void main(String[] args) {
        String str = "aab";
        partition(str);
    }
    public static List<List<String>> partition(String str) {
        List<List<String>> listOfPartition = new ArrayList<>();
        findPalindrome(str,0,new ArrayList<>(),listOfPartition);
        return listOfPartition;
    }

    private static void findPalindrome(String str, int start, List<String>part, List<List<String>>ans){
        if (str.length() == start){
            ans.add(new ArrayList<>(part));
        }
        for(int end = start; end < str.length(); end++){
            if(isPalindrome(str.substring(start,end+1))){
                part.add(str.substring(start,end+1));
                findPalindrome(str,end+1,part,ans);
                part.remove(part.size()-1);
            }
        }
    }

    private static boolean isPalindrome(String str){
        int left = 0;
        int right = str.length()-1;
        while (left < right){
            if(str.charAt(left) != str.charAt(right)){
                return false;
            }
            left++;
            right--;
        }
        return true;
    }
}
