package comp_p.pay_pal;
import java.util.*;
public class NonogramSolver {
    static int[][] solution;
    static int rows, cols;

    public static void main(String[] args) {
        List<List<Integer>> rowClues = Arrays.asList(
                List.of(3),
                List.of(1, 1),
                List.of(5),
                List.of(1, 1),
                List.of(3)
        );

        List<List<Integer>> colClues = Arrays.asList(
                List.of(3),
                List.of(1, 1),
                List.of(5),
                List.of(1, 1),
                List.of(3)
        );

        if (solve(rowClues, colClues)) {
            System.out.println("Solved:");
            printSolution();
        } else {
            System.out.println("No solution found.");
        }
    }

    public static boolean solve(List<List<Integer>> rowClues, List<List<Integer>> colClues) {
        rows = rowClues.size();
        cols = colClues.size();
        solution = new int[rows][cols];

        return solveRow(0, rowClues, colClues);
    }

    private static boolean solveRow(int rowIndex, List<List<Integer>> rowClues, List<List<Integer>> colClues) {
        if (rowIndex == rows) {
            return validateCols(colClues);
        }

        List<List<Integer>> permutations = generateLinePermutations(rowClues.get(rowIndex), cols);
        for (List<Integer> perm : permutations) {
            for (int c = 0; c < cols; c++) {
                solution[rowIndex][c] = perm.get(c);
            }

            if (isPartialValid(rowIndex, colClues)) {
                if (solveRow(rowIndex + 1, rowClues, colClues)) {
                    return true;
                }
            }
        }
        return false;
    }

    private static boolean validateCols(List<List<Integer>> colClues) {
        for (int c = 0; c < cols; c++) {
            List<Integer> col = new ArrayList<>();
            for (int r = 0; r < rows; r++) {
                col.add(solution[r][c]);
            }
            if (!matchesClue(col, colClues.get(c))) return false;
        }
        return true;
    }

    private static boolean isPartialValid(int upToRow, List<List<Integer>> colClues) {
        for (int c = 0; c < cols; c++) {
            List<Integer> col = new ArrayList<>();
            for (int r = 0; r <= upToRow; r++) {
                col.add(solution[r][c]);
            }
            if (!matchesPartialClue(col, colClues.get(c))) return false;
        }
        return true;
    }

    private static boolean matchesClue(List<Integer> line, List<Integer> clue) {
        List<Integer> blocks = new ArrayList<>();
        int count = 0;
        for (int val : line) {
            if (val == 1) {
                count++;
            } else {
                if (count > 0) blocks.add(count);
                count = 0;
            }
        }
        if (count > 0) blocks.add(count);
        return blocks.equals(clue);
    }

    private static boolean matchesPartialClue(List<Integer> line, List<Integer> clue) {
        List<Integer> blocks = new ArrayList<>();
        int count = 0;
        int clueIndex = 0;
        for (int val : line) {
            if (val == 1) {
                count++;
            } else {
                if (count > 0) {
                    if (clueIndex >= clue.size() || count > clue.get(clueIndex)) return false;
                    if (count < clue.get(clueIndex)) return true; // may still be part of a block
                    clueIndex++;
                    count = 0;
                }
            }
        }
        if (count > 0) {
            if (clueIndex >= clue.size() || count > clue.get(clueIndex)) return false;
        }
        return true;
    }

    private static List<List<Integer>> generateLinePermutations(List<Integer> clues, int length) {
        List<List<Integer>> result = new ArrayList<>();
        generatePermsHelper(clues, 0, new ArrayList<>(), length, result);
        return result;
    }

    private static void generatePermsHelper(List<Integer> clues, int index, List<Integer> current, int length, List<List<Integer>> result) {
        if (index == clues.size()) {
            while (current.size() < length) current.add(0);
            result.add(new ArrayList<>(current));
            return;
        }

        int blockSize = clues.get(index);
        for (int i = current.size(); i + blockSize <= length; i++) {
            List<Integer> copy = new ArrayList<>(current);
            while (copy.size() < i) copy.add(0); // gap
            for (int j = 0; j < blockSize; j++) copy.add(1); // block
            if (copy.size() < length) copy.add(0); // space after block
            generatePermsHelper(clues, index + 1, copy, length, result);
        }
    }

    public static void printSolution() {
        for (int[] row : solution) {
            for (int cell : row) {
                System.out.print(cell == 1 ? "█" : " ");
            }
            System.out.println();
        }
    }
}
