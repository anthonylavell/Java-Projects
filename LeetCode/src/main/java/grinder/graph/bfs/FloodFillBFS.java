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
        int[][] dir = {{1,0},{-1,0},{0,-1},{0,1}};
        int orgColor = image[sr][sc];
        Deque<int[]> visited = new ArrayDeque<>();
        visited.add(new int[] {sr,sc});
        image[sr][sc] = color;
        while (!visited.isEmpty()){
            int size = visited.size();
            while (size-- > 0){
                int [] tempArray = visited.pop();
                for (int [] row : dir ){
                    int x = tempArray[0] + row[0];
                    int y = tempArray[1] + row[1];
                    if(orgColor!=color && x >= 0 && x < image.length && y >= 0 && y < image[0].length && image[x][y] == orgColor){
                        visited.add(new int[] {x,y});
                        image[x][y] = color;
                    }
                }
            }
        }
        return image;
    }
}
