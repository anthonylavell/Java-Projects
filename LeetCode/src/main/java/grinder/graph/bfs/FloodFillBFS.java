package grinder.graph.bfs;

import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Deque;

public class FloodFillBFS {
    public static void main(String[] args) {
        int [][] image = {{1,1,1},{1,1,0},{1,0,1}};
        int sr = 1, sc = 1, color = 2;
        System.out.println(Arrays.deepToString(floodFill(image,sr,sc,color)));
    }

    public static int[][] floodFill(int[][] image, int sr, int sc, int color) {
        int orgColor = image[sr][sc];
        int[][] dir = {{-1, 0}, {1, 0}, {0, -1}, {0, 1}};
        Deque<int[]> deque = new ArrayDeque<>();
        deque.add(new int[]{sr, sc});
        image[sr][sc] = color;
        while (!deque.isEmpty()) {
            int size = deque.size();
            int[] nodes = deque.pop();
            while (size-- > 0) {
                for (int index = 0; index < dir.length; index++) {
                    int row = nodes[0] + dir[index][0];
                    int col = nodes[1] + dir[index][1];
                    if (row < 0 || row >= image.length || col < 0 || col >= image[row].length || image[row][col] != orgColor || orgColor== color) {
                        continue;
                    }
                    deque.add(new int[]{row, col});
                    image[row][col] = color;
                }
            }
        }
            return image;
    }
}
