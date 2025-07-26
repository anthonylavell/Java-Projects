package comp_p.pay_pal;

import java.util.*;

enum Move { UP, DOWN, LEFT, RIGHT, STILL; }

public class DanceCollision {

    /**
     * Determines if any two dancers collide at any time step.
     *
     * @param startPositions list of length N, where startPositions.get(i) = new int[]{x_i, y_i}
     * @param moves          list of length N, where moves.get(i) is a List<Move> of length T
     * @return true if any collision occurs at any time step 0…T; false otherwise
     */
    public static boolean hasCollision(List<int[]> startPositions,List<List<Move>> moves) {
        int n = startPositions.size();
        if (n == 0) return false;
        int t = moves.get(0).size();  // assume all move-lists have equal length

        // Initialize current positions
        int[][] pos = new int[n][2];
        for (int i = 0; i < n; i++) {
            pos[i][0] = startPositions.get(i)[0];
            pos[i][1] = startPositions.get(i)[1];
        }

        // Check collision at time 0
        if (checkCollision(pos)) return true;

        // Simulate each time step
        for (int step = 0; step < t; step++) {
            for (int i = 0; i < n; i++) {
                Move m = moves.get(i).get(step);
                switch (m) {
                    case UP:    pos[i][1]++; break;
                    case DOWN:  pos[i][1]--; break;
                    case LEFT:  pos[i][0]--; break;
                    case RIGHT: pos[i][0]++; break;
                    case STILL: /* no change */ break;
                }
            }
            if (checkCollision(pos)) return true;
        }

        return false;
    }

    // Helper method: returns true if any two dancers share the same (x,y)
    private static boolean checkCollision(int[][] pos) {
        Set<String> seen = new HashSet<>();
        for (int[] p : pos) {
            String key = p[0] + "#" + p[1];
            if (!seen.add(key)) {
                return true;
            }
        }
        return false;
    }

    // Example usage and simple tests
    public static void main(String[] args) {
        List<int[]> sp1 = List.of(
                new int[]{0,0},
                new int[]{2,0}
        );
        List<List<Move>> mv1 = List.of(
                List.of(Move.RIGHT, Move.RIGHT),
                List.of(Move.LEFT,  Move.LEFT)
        );
        // They meet at (1,0) after step 1
        System.out.println(hasCollision(sp1, mv1)); // true

        List<int[]> sp2 = List.of(
                new int[]{0,0},
                new int[]{0,1},
                new int[]{1,1}
        );
        List<List<Move>> mv2 = List.of(
                List.of(Move.UP,    Move.RIGHT, Move.DOWN),
                List.of(Move.RIGHT, Move.UP,    Move.LEFT),
                List.of(Move.LEFT,  Move.DOWN,  Move.RIGHT)
        );
        // All move without colliding
        System.out.println(hasCollision(sp2, mv2)); // false
    }
}
