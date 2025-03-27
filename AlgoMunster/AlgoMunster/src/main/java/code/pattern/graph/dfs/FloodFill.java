package code.pattern.graph.dfs;
/*
In computer graphics, an uncompressed raster image is presented as a matrix of numbers. Each entry of the matrix represents the color of a pixel. A flood fill algorithm takes a coordinate r, c and a replacement color, and replaces all pixels connected to r, c that have the same color (i.e., the pixels connected to the given coordinate with same color and all the other pixels connected to the those pixels of the same color) with the replacement color. (e.g. MS-Paint's paint bucket tool).

Input
r: row
c: column
replacement: replacement color
image: an 2D array of integers representing the image
Output
the replaced image

Examples
Example 1:
Input:

r = 2
c = 2
replacement = 9
arr = [[0,1,3,4,1],[3,8,8,3,3],[6,7,8,8,3],[12,2,8,9,1],[12,3,1,3,2]]
Output: [[0,1,3,4,1],[3,9,9,3,3],[6,7,9,9,3],[12,2,9,9,1],[12,3,1,3,2]]

Explanation:

From

0 1 3 4 1
3 8 8 3 3
6 7 8 8 3
12 2 8 9 1
12 3 1 3 2
to

0 1 3 4 1
3 9 9 3 3
6 7 9 9 3
12 2 9 9 1
12 3 1 3 2
 */

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.List;

public class FloodFill {

    public static class Coordinate {
        int sr;
        int sc;

        public Coordinate(int r, int c) {
            this.sr = r;
            this.sc = c;
        }
    }

    public static List<List<Integer>> floodFill(int sr, int sc, int replacement, List<List<Integer>> image) {
        // WRITE YOUR BRILLIANT CODE HERE
        int numRows = image.size();
        int numCols = image.get(0).size();
        bfs(image, new Coordinate(sr, sc), replacement, numRows, numCols);
        return image;
    }

    private static List<Coordinate> getNeighbors(List<List<Integer>> image, Coordinate node, int rootColor, int numRows, int numCols) {
        List<Coordinate> neighbors = new ArrayList<>();
        int[] deltaRow = {-1, 0, 1, 0};
        int[] deltaCol = {0, 1, 0, -1};
        for (int i = 0; i < deltaRow.length; i++) {
            int neighborRow = node.sr + deltaRow[i];
            int neighborCol = node.sc + deltaCol[i];
            if ( (0 <= neighborRow && neighborRow < numRows) && (0 <= neighborCol && neighborCol < numCols) ){
                if (image.get(neighborRow).get(neighborCol) == rootColor) {
                    neighbors.add(new Coordinate(neighborRow, neighborCol));
                }
            }
        }
        return neighbors;
    }

    private static void bfs(List<List<Integer>> image, Coordinate root, int replacementColor, int numRows, int numCols) {
        ArrayDeque<Coordinate> queue = new ArrayDeque<>();
        queue.add(root);
        boolean[][] visited = new boolean[numRows][numCols];
        int rootColor = image.get(root.sr).get(root.sc);
        image.get(root.sr).set(root.sc, replacementColor); // replace root color
        visited[root.sr][root.sc] = true;
        while (queue.size() > 0) {
            Coordinate node = queue.pop();
            List<Coordinate> neighbors = getNeighbors(image, node, rootColor, numRows, numCols);
            for (Coordinate neighbor : neighbors) {
                if (visited[neighbor.sr][neighbor.sc]) continue;
                image.get(neighbor.sr).set(neighbor.sc, replacementColor); // replace color
                queue.add(neighbor);
                visited[neighbor.sr][neighbor.sc] = true;
            }
        }
    }
}
