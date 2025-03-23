/*
Given a string s, partition s such that every substring of the partition is a palindrome.

Return all possible palindrome partitioning of s.

Examples
Example 1:
Input: aab
Output:
  [
  ["aa","b"],
  ["a","a","b"]
  ]
 */
package code.pattern.backtracking;

import java.util.ArrayList;
import java.util.List;

public class PartitionAStringIntoPalindromes {
    public static void main(String[] args) {
        String str = "aab";
        System.out.println(partition(str));
    }

    public static List<List<String>> partition(String str) {
        // WRITE YOUR BRILLIANT CODE HERE
        List<List<String>> ans = new ArrayList<>();
        getPartition(str,0, new ArrayList<>(), ans);
        return ans;
    }

    private static void getPartition(String str, int start, List<String>part, List<List<String>> ans){
        if(start == str.length()){
            ans.add(new ArrayList<>(part));
        }
        for(int end = start; end < str.length(); end++){
            String tempStr = str.substring(start,(end+1));
            if(isPalindrome(tempStr)){
                part.add(tempStr);
                getPartition(str,end+1,part,ans);
                part.remove(part.size()-1);
            }
        }
    }

    private static boolean isPalindrome(String str){
           int leftIndex = 0;
           int rightIndex = str.length()-1;
           while (leftIndex < rightIndex){
               if(str.charAt(leftIndex++) != str.charAt(rightIndex--)){
                   return false;
               }
           }
        return true;
    }
}
