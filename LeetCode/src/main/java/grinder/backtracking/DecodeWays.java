package grinder.backtracking;

import java.util.Arrays;

public class DecodeWays {

    public static void main(String[] args) {
        String str = "226";
        //char[] ch = str.toCharArray();
        //System.out.println(ch.length);
        System.out.println(numDecodings(str));
    }
    public static int numDecodings(String str) {
        int[] memo = new int[str.length()];
        Arrays.fill(memo,-1);
         return isNumDecodings(str,0,memo);
    }
    private static int isNumDecodings(String str, int startIndex,int[] memo){
        if(startIndex == str.length()){
            return 1;
        }
        if(memo[startIndex] != -1){
            return memo[startIndex];
        }
        int ways = 0;
        if(str.charAt(startIndex) == '0'){
            return ways;
        }
        //single digit
        ways+= isNumDecodings(str,startIndex+1, memo);

        //two digit
        if(startIndex +2 <= str.length() && Integer.parseInt(str.substring(startIndex,startIndex+2) )<= 26){
            ways+=isNumDecodings(str,startIndex + 2, memo);
        }
        memo[startIndex]=ways;
        return ways;
    }
}
