package comp_p.pay_pal;

import java.util.*;

public class MatrixValidator {
    /**
     * Returns true iff:
     *  1. matrix is non‐null and square (N×N),
     *  2. every entry is in [0..N-1],
     *  3. each row is a permutation of 0..N-1,
     *  4. each column is a permutation of 0..N-1.
     */
    public static boolean isValidMatrix(int[][] matrix) {
        if (matrix == null) return false;
        int n = matrix.length;
        if (n == 0) return false;

        // Check square and range
        for (int i = 0; i < n; i++) {
            if (matrix[i] == null || matrix[i].length != n) return false;
        }

        // Check rows
        for (int i = 0; i < n; i++) {
            boolean[] seen = new boolean[n];
            for (int j = 0; j < n; j++) {
                int v = matrix[i][j];
                if (v < 0 || v >= n || seen[v]) {
                    return false;
                }
                seen[v] = true;
            }
        }

        // Check columns
        for (int j = 0; j < n; j++) {
            boolean[] seen = new boolean[n];
            for (int i = 0; i < n; i++) {
                int v = matrix[i][j];
                if (v < 0 || v >= n || seen[v]) {
                    return false;
                }
                seen[v] = true;
            }
        }

        return true;
    }

    // --- Test harness ---
    public static void main(String[] args) {
        List<int[][]> tests = new ArrayList<>();
        List<Boolean> expected = new ArrayList<>();

        // 1) Valid Latin-square of size 3
        tests.add(new int[][] {
                {0, 1, 2},
                {2, 0, 1},
                {1, 2, 0}
        });
        expected.add(true);

        // 2) Row 1 has duplicate '1'
        tests.add(new int[][] {
                {0, 1, 1},
                {1, 0, 2},
                {2, 1, 0}
        });
        expected.add(false);

        // 3) Column 0 has two '2's
        tests.add(new int[][] {
                {0, 1, 2},
                {2, 0, 1},
                {2, 1, 0}
        });
        expected.add(false);

        // 4) Not square
        tests.add(new int[][] {
                {0, 1},
                {1, 0, 2}
        });
        expected.add(false);

        // 5) Contains out‐of‐range value '3'
        tests.add(new int[][] {
                {0, 1, 3},
                {1, 2, 0},
                {2, 0, 1}
        });
        expected.add(false);

        // Run tests
        for (int i = 0; i < tests.size(); i++) {
            boolean result = isValidMatrix(tests.get(i));
            System.out.printf("Test %d: expected=%-5b  got=%-5b  → %s%n",
                    i+1, expected.get(i), result,
                    (result == expected.get(i) ? "PASS" : "FAIL"));
        }
    }
}

