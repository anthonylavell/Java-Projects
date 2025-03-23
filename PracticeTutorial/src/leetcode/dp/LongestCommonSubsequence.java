package leetcode.dp;

public class LongestCommonSubsequence {
    public static void main(String[] args) {
        String text1 = "abcde";
        String text2 = "ceboota";
        String text3 = "pmjghexybyrgzczy";
        String text4 = "hafcdqbgncrcbihkd";
        String text5 = "mhunuzqrkzsnidwbun";
        String text6 = "szulspmhwpazoxijwbq";
        System.out.println(longestCommonSubsequence(text1,text2));
    }

    public static int longestCommonSubsequence(String text1, String text2) {
        int total = 0;
        int [][] dp = new int[text1.length()+1][text2.length()+1];
        for(int row = 1; row < dp.length; row++){
            for(int col = 1; col < dp[row].length; col++){
                if(text1.charAt(row-1) == text2.charAt(col-1)){
                    dp[row][col] = dp[row-1][col-1] +1;
                }else {
                    dp[row][col] = Math.max(dp[row][col-1],dp[row-1][col]);
                }
                total = Math.max(total,dp[row][col]);
            }
        }
        return total;
    }
}
