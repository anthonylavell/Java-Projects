package wayfair.array;

import java.util.Arrays;

public class GridTraveler {
    public static void main(String[] args) {
        System.out.println(uniquePaths(3,3));
    }
    public static int uniquePaths(int m, int n) {
        // **** sanity check(s) ****
        if (m == 1 && n == 1) return 1;
        if (m == 0 || n == 0) return 0;

        // **** memoization ****
        int[][] memo = new int[m][n];

        // **** loop (no recursion) ****
        for (int i = 0;  i < m; i++) {

            for (int j = 0; j < n; j++) {

                // **** save distance to target ****
                if (i == 0 || j == 0)       // top row or left column
                    memo[i][j] = 1;
                else
                    memo[i][j] = memo[i - 1][j] + memo[i][j - 1];
            }
        }

        // ???? ????
        System.out.println("<<< memo: ");
        for (int k = 0; k < m; k++)
            System.out.println(Arrays.toString(memo[k]));

        // **** return answer ****
        return memo[m - 1][n - 1];

    }
}
