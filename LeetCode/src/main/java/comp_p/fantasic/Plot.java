package comp_p.fantasic;

import java.util.Arrays;

public class Plot {
    public static char[][] coordinate(int[][]coords){
        int minX = Integer.MAX_VALUE;
        int minY = Integer.MAX_VALUE;
        int maxX = Integer.MIN_VALUE;
        int maxY = Integer.MIN_VALUE;

        for (int[] coord : coords ){
            int x = coord[0];
            int y = coord[1];
            minX = Math.min(minX,x);
            minY = Math.min(minY,y);
            maxX = Math.max(maxX,x);
            maxY = Math.max(maxY,y);
        }
        int width = maxX  - minX +1;
        int height = maxY  - minY +1;

        char[][] graph = new char[height][width];
        for (int index =0; index < height; index++){
            Arrays.fill(graph[index],'.');
        }
        for (int[] coord : coords){
            int x = coord[0];
            int y = coord[1];
            int col = x - minX;
            int row = maxY - y; //reverse Y so higher values print first
            graph[row][col] = '*';
        }
        return graph;
    }

    public static void main(String[] args) {
        int[][] coord = {{1,1}, {2,3}, {4,0}, {2,1}};
        System.out.println(Arrays.deepToString(coordinate(coord)));
    }
}
