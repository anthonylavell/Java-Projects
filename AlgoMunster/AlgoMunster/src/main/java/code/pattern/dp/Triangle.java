package code.pattern.dp;

import java.util.List;

public class Triangle {
    public static int minimumTotal(List<List<Integer>> triangle) {
        // WRITE YOUR BRILLIANT CODE HERE
        int triSize = triangle.get(triangle.size()-1).size();
        int[] dp = new int[triSize];
        for (int row = triSize-1; row >=0; row--){
            for (int col = 0; col < triangle.get(row).size(); col++){
                if(row==triSize-1){
                    dp[col] = triangle.get(row).get(col);
                    continue;
                }
                dp[col] =  Math.min(dp[col], dp[col+1]) + triangle.get(row).get(col);
            }
        }
        return dp[0];
    }
}
