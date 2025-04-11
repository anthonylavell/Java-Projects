package capital_one;
//help
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
