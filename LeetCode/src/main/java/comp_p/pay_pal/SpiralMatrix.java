package comp_p.pay_pal;

import java.util.Arrays;

public class SpiralMatrix {

    /**
     * Generates an n×n matrix filled with the numbers 1 to n*n in spiral order.
     *
     * @param n the size of the matrix
     * @return an n×n spiral matrix
     */
    public static int[][] generateSpiralMatrix(int n) {
        int[][] matrix = new int[n][n];
        int top = 0, bottom = n - 1;
        int left = 0, right = n - 1;
        int num = 1;

        while (top <= bottom && left <= right) {
            // Traverse from left to right on the top row
            for (int j = left; j <= right; j++) {
                matrix[top][j] = num++;
            }
            top++;

            // Traverse from top to bottom on the right column
            for (int i = top; i <= bottom; i++) {
                matrix[i][right] = num++;
            }
            right--;

            if (top <= bottom) {
                // Traverse from right to left on the bottom row
                for (int j = right; j >= left; j--) {
                    matrix[bottom][j] = num++;
                }
                bottom--;
            }

            if (left <= right) {
                // Traverse from bottom to top on the left column
                for (int i = bottom; i >= top; i--) {
                    matrix[i][left] = num++;
                }
                left++;
            }
        }

        return matrix;
    }

    // Simple test harness
    public static void main(String[] args) {
        int[][] m3 = generateSpiralMatrix(3);
        System.out.println("3×3 Spiral Matrix:");
        for (int[] row : m3) {
            System.out.println(Arrays.toString(row));
        }

        int[][] m4 = generateSpiralMatrix(4);
        System.out.println("\n4×4 Spiral Matrix:");
        for (int[] row : m4) {
            System.out.println(Arrays.toString(row));
        }
    }
}

