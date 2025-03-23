package arraysandstrings.array.two_dimensional;

import java.util.Arrays;

public class Flood {
    public static void main(String[] args) {
        int[][] image = {
                {1,1,1},
                {1,1,0},
                {1,0,1}
        };

        int [][] image2 = {{0,0,0},{0,0,0},{0,0,0}};

        int sr = 1;
        int sc = 1;
        int color = 2;
        System.out.println("Sr:" + image.length);
        System.out.println("Sr:" + image.length);

        sr = 0;
        sc = 0;
        color = 0;
        int[][] tempImage = floodFill(image2,sr,sc,color);
        System.out.println(Arrays.deepToString(tempImage));

    }
    public static int[][] floodFill(int[][] image, int sr, int sc, int color) {
        startPixel(image,sr,sc,color,image[sr][sc]);
        return image;
    }

    private static void startPixel(int[][] image, int sr, int sc, int color,int startColor){
        if(sr < 0 || sc < 0 || sr > image.length-1 || sc > image[0].length-1 || image[sr][sc] != startColor || image[sr][sc] == color){
            return;
        }
        image[sr][sc] = color;
       startPixel(image, (sr-1), sc, color,startColor);
       startPixel(image, sr, (sc+1), color,startColor);
       startPixel(image, sr, (sc-1), color,startColor);
       startPixel(image, (sr+1), sc, color,startColor);

    }
}
