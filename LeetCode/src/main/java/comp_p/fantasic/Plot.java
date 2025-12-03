/*
Your task is to print a 2D ASCII graph that contains all points.

Requirements:

The graph must include all points, so:

Calculate the minimum and maximum X

Calculate the minimum and maximum Y

Represent the graph as a grid of characters:

Use "." for empty space

Use "*" for a point

The origin (0,0) should appear in the correct relative location
(not necessarily the bottom-left unless coordinates include it).

The graph’s Y-axis prints top to bottom (highest Y row printed first).

If multiple points overlap, still print "*".
input
[(1,1), (2,3), (4,0), (2,1)]
Outcome
GRAPH coordinates:                     JAVA array:

   y=3  . * . .         row 0 →  . * . .
   y=2  . . . .         row 1 →  . . . .
   y=1  * * . .         row 2 →  * * . .
   y=0  . . . *         row 3 →  . . . *
        x=1 2 3 4           col=0 1 2 3

 */
package comp_p.fantasic;

import java.util.Arrays;

public class Plot {
    public static char[][] coordinate(int[][]coords){
        int minimumX = Integer.MAX_VALUE;
        int minimumY = Integer.MAX_VALUE;
        int maximumX = Integer.MIN_VALUE;
        int maximumY = Integer.MIN_VALUE;
        for (int[] coord : coords){
            int x = coord[0];
            int y = coord[1];
            minimumX = Math.min(minimumX,x);
            minimumY = Math.min(minimumY,y);
            maximumX = Math.max(maximumX,x);
            maximumY = Math.max(maximumY,y);
        }
        int height = (maximumX-minimumX) +1;
        int width = (maximumY-minimumY) +1;
        char[][] graph = new char[height][width];
        for (int index = 0; index < coords.length; index++){
            Arrays.fill(graph[index],'.');
        }
        for (int[] coord : coords){
            int x = coord[0];
            int y = coord[1];
            int col = x - minimumX;
            int row = maximumY - y;
            graph[row][col] = '*';
        }
        return graph;
    }

    public static void main(String[] args) {
        int[][] coord = {{1,1}, {2,3}, {4,0}, {2,1}};
        System.out.println(Arrays.deepToString(coordinate(coord)));

    }
}
