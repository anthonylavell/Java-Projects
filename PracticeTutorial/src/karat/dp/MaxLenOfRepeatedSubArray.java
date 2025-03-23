package karat.dp;

import java.util.Arrays;

public class MaxLenOfRepeatedSubArray {
    public static void main(String[] args) {
        String[] str = {"start","hey","love","ant"};
        String[] str2 = {"start","love","hey","love","ant","fam"};
        System.out.println(Arrays.toString(findRepeatedArray(str,str2)));
    }
    public static String[] findRepeatedArray(String[] str, String[] str2) {
        int[][] dp = new int[str.length+1][str2.length+1];
        int total = 0;
        int index = 0;
        for(int row = str.length -1; row >= 0; row--){
            for(int col = 0; col < str2.length; col++){
                if(str[row].equals(str2[col])){
                    dp[row][col]=1+dp[row+1][col+1];
                }
                if(total < dp[row][col]){
                    total = dp[row][col];
                    index = row;
                }
            }
        }


        return Arrays.copyOfRange(str,index,str.length);
    }
}
