/*
Given a triangle array, return the minimum path sum from top to bottom.

For each step, you may move to an adjacent number of the row below. More formally,
if you are on index i on the current row, you may move to either index i or index i + 1
on the next row.
Example 1:

Input: triangle = [[2],[3,4],[6,5,7],[4,1,8,3]]
Output: 11
Explanation: The triangle looks like:
   2
  3 4
 6 5 7
4 1 8 3
The minimum path sum from top to bottom is 2 + 3 + 5 + 1 = 11 (underlined above).
Example 2:

Input: triangle = [[-10]]
Output: -10

Constraints:

1 <= triangle.length <= 200
triangle[0].length == 1
triangle[i].length == triangle[i - 1].length + 1
-104 <= triangle[i][j] <= 104
 */
package grinder.dp.bottom_up;

import java.util.Arrays;
import java.util.List;

public class Triangle {
    public static void main(String[] args) {
        List<List<Integer>> triangle = Arrays.asList(
                Arrays.asList(2),
                Arrays.asList(3,4),
                Arrays.asList(6,5,7),
                Arrays.asList(4,1,8,3)
        );
        List<List<Integer>> triangle2 = Arrays.asList(
                Arrays.asList(-1),Arrays.asList(2,3),Arrays.asList(1,-1,-3)
        );

        List<List<Integer>> triangle3 = Arrays.asList(
                Arrays.asList(-1),Arrays.asList(3,2),Arrays.asList(1,-2,-1)
        );
        System.out.println(minimumTotal(triangle3));

    }

    public static int minimumTotal(List<List<Integer>> triangle) {
        int triLen = triangle.size()-1;
        int[]dp = new int[triangle.get(triLen).size()];
        for (int row = triLen; row>=0;row--){
            for (int col = 0; col < triangle.get(row).size(); col++){
                int num = triangle.get(row).get(col);
                dp[col] = (row==triLen) ? num : num + Math.min(dp[col],dp[col+1]);
            }
        }
        return dp[0];
    }

}
