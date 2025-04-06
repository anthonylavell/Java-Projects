package grinder.graph.bfs;

import java.util.*;

public class SlidingPuzzle {
    public static void main(String[] args) {
        int [][] board = {{1,2,3},{4,0,5}};
        int [][] board2 = {{1,2,3},{5,4,0}};
        int [][] board3 = {{4,1,2},{5,0,3}};
        System.out.println(slidingPuzzle(board3));
    }

    public static int slidingPuzzle(int[][] board) {
        String initialState = boardToString(board);
        String target = "123450";
        int [][] dirs = { {0,1},{0,-1},{1,0},{-1,0} };
        Map<String,int[][]> store = new HashMap<>();
        store.put(initialState,board);
        Deque<String>dequeKey = new ArrayDeque<>();
        dequeKey.add(initialState);
        for(int level = 0; !dequeKey.isEmpty(); level++){
            int size = dequeKey.size();
            while (size-- > 0){
                String mapKey = dequeKey.pop();
                int[][]spotBoard = store.get(mapKey);
                if(mapKey.equals(target)){
                    return level;
                }
                for (int[] dir : dirs) {
                    int origRow = mapKey.indexOf('0')/3;
                    int origCol = mapKey.indexOf('0')%3;
                    int row =  origRow+ dir[0];
                    int col = origCol + dir[1];

                    if (row < 0 || row >= spotBoard.length || col < 0 || col >= spotBoard[row].length) {
                        continue;
                    }
                    int[][] tempBoard = new int[2][3];
                    tempBoard[0] = new int[]{spotBoard[0][0], spotBoard[0][1], spotBoard[0][2]};
                    tempBoard[1] = new int[]{spotBoard[1][0], spotBoard[1][1], spotBoard[1][2]};

                    tempBoard[origRow][origCol] = tempBoard[row][col];
                    tempBoard[row][col] = 0;
                    String visitStr = boardToString(tempBoard);
                    if (!store.containsKey(visitStr)) {
                        dequeKey.add(visitStr);
                        store.put(visitStr, tempBoard);
                    }

                }
            }
        }
        return -1;
    }

    private static String boardToString(int[][] board){
        StringBuilder sb = new StringBuilder();
        for (int[] row : board) {
            for (int val : row) {
                sb.append(val);
            }
        }
        return sb.toString();
    }
}
