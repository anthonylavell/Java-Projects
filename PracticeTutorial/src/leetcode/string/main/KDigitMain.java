package leetcode.string.main;

import leetcode.string.KDigit;

public class KDigitMain {
    public static void main(String[] args) {
        //String num = "12341";
        //String num = "1432219";
        //String num = "10200";
        String num = "10";
        //String num = "112";
        //String num = "999999999991";
        int k = 1;
        System.out.println(KDigit.removeKdigits(num,k));
    }
}
