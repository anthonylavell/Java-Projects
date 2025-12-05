package code_patterns.sliding_window;
/*
Given two strings needle and haystack, return the index of the
first occurrence of needle in haystack, or -1 if needle is not part of haystack.



Example 1:

Input: haystack = "sadbutsad", needle = "sad"
Output: 0
Explanation: "sad" occurs at index 0 and 6.
The first occurrence is at index 0, so we return 0.
Example 2:

Input: haystack = "leetcode", needle = "leeto"
Output: -1
Explanation: "leeto" did not occur in "leetcode", so we return -1.


Constraints:

1 <= haystack.length, needle.length <= 104
haystack and needle consist of only lowercase English characters.
 */
public class FirstOccurrenceInAString {
    public static int strStr(String haystack, String needle) {
        int leftIdex = 0;
        for (int rightIdex =1; rightIdex <= haystack.length(); rightIdex++){
            if(rightIdex-leftIdex == needle.length()){
                if (haystack.substring(leftIdex,rightIdex).equals(needle)){
                    return leftIdex;
                }
                leftIdex++;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        String haystack = "sadbutsad", needle = "sad";
        System.out.println(strStr(haystack,needle));
    }
}
