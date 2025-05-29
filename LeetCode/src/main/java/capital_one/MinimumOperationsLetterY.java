/*
You are given a **0-indexed** n x n grid where n is odd, and grid[r][c] is 0, 1, or 2.
We say that a cell belongs to the Letter **Y** if it belongs to one of the following:
* The diagonal starting at the top-left cell and ending at the center cell of the grid.
* The diagonal starting at the top-right cell and ending at the center cell of the grid.
* The vertical line starting at the center cell and ending at the bottom border of the grid.
The Letter **Y** is written on the grid if and only if:
* All values at cells belonging to the Y are equal.
* All values at cells not belonging to the Y are equal.
* The values at cells belonging to the Y are different from the values at cells not belonging to the Y.
Return *the ****minimum**** number of operations needed to write the letter Y on the grid given that in
one operation you can change the value at any cell to* 0*,* 1*,* *or* 2*.*
 */

package capital_one;

public class MinimumOperationsLetterY {
    public int minimumOperationsToWriteY(int[][] grid) {
        int n = grid.length;
        int[][] group = new int[n][n]; // 1 for Y, 0 for non-Y
        // Mark Y-shape cells
        for (int i = 0; i <= n / 2; i++) {
            group[i][i] = 1; // Left diagonal
            group[i][n - 1 - i] = 1; // Right diagonal
        }
        for (int i = n / 2; i < n; i++) {
            group[i][n / 2] = 1; // Vertical line from center to bottom
        }

        // Count frequency of values in Y and non-Y regions
        int[][] yFreq = new int[3][1];
        int[][] nonYFreq = new int[3][1];
        int yCount = 0, nonYCount = 0;

        for (int r = 0; r < n; r++) {
            for (int c = 0; c < n; c++) {
                int val = grid[r][c];
                if (group[r][c] == 1) {
                    yFreq[val][0]++;
                    yCount++;
                } else {
                    nonYFreq[val][0]++;
                    nonYCount++;
                }
            }
        }

        // Try all combinations of distinct values for Y and non-Y regions
        int minOps = Integer.MAX_VALUE;
        for (int yVal = 0; yVal < 3; yVal++) {
            for (int nonYVal = 0; nonYVal < 3; nonYVal++) {
                if (yVal == nonYVal) continue; // Must be different
                int ops = (yCount - yFreq[yVal][0]) + (nonYCount - nonYFreq[nonYVal][0]);
                minOps = Math.min(minOps, ops);
            }
        }

        return minOps;
    }
}
