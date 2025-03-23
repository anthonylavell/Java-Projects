package practice.test;

import practice.array.Palindromic;

public class TestPalindromic {
    public static void main(String[] args){
       // String str = "babad";
        //String str = "cbbd";
        //String str = "beiefb";
        //String str = "babab";
        //String str = "bbbaaacccbcbeeiizzz";
        //String str ="";
        //String str ="a";
        //String str ="abc";
        String str = "abcdbbfcba";
        //System.out.println(str.substring(1, str.length()).indexOf(str.charAt(1)));
        //System.out.println(new StringBuffer(str).reverse().toString().equals("dbbc"));
        System.out.println(Palindromic.longestPalindrome(str));
    }
}
