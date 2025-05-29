/*
Given a matrix of integers, with each element containing either o 1, or 2,
your task is to find the longest diagonal segment which matches the following
pattern: 1, 2, 0, 2, 0, 2, 0, (where the first element is 1, and then 2 and are
repeating infinitely), and return the length of this diagonal segment.

The diagonal segment:

• May start and end at any matrix element

• May go toward any possible diagonal direction
 */

package capital_one;

public class DiagonalPattern {
    public static void main(String[] args) {
        // Example matrix. You can test with different matrices.
        int[][] matrix = {
                {1, 2, 0, 2},
                {2, 1, 2, 0},
                {0, 2, 1, 2},
                {2, 0, 2, 1}
        };

        int longestSegment = longestDiagonalSegment(matrix);
        System.out.println("Longest diagonal segment length: " + longestSegment);
    }

    public static int longestDiagonalSegment(int[][] matrix) {
        if (matrix == null || matrix.length == 0) return 0;

        int rows = matrix.length;
        int cols = matrix[0].length;
        int maxLen = 0;
        int[][] directions = { {1, 1}, {1, -1}, {-1, 1}, {-1, -1} };

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                if (matrix[i][j] == 1) {
                    for (int[] dir : directions) {
                        int len = 1;
                        int expectedIndex = 1;
                        int x = i + dir[0];
                        int y = j + dir[1];

                        while (x >= 0 && x < rows && y >= 0 && y < cols) {
                            int expectedVal = (expectedIndex % 2 == 1) ? 2 : 0;

                            if (matrix[x][y] == expectedVal) {
                                len++;
                                expectedIndex++;
                                x += dir[0];
                                y += dir[1];
                            } else {
                                break;
                            }
                        }
                        maxLen = Math.max(maxLen, len);
                    }
                }
            }
        }
        return maxLen;
    }
}
