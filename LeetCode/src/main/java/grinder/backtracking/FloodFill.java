package grinder.backtracking;

public class FloodFill {
    public static void main(String[] args) {
        int [][] image = {{0,0,0},{0,0,0}};
        int sr = 1, sc = 0, color = 2;
        floodFill(image,sr,sc,color);
    }
    public static int[][] floodFill(int[][] image, int sr, int sc, int color) {
        helpFloodFill(image,sr,sc,color,image[sr][sc]);
        return image;
    }
    private static void helpFloodFill(int[][] image, int sr, int sc, int color, int target) {
        if((sr > image.length-1 || sr < 0) || (sc > image[sr].length-1 || sc < 0) || (image[sr][sc] != target || image[sr][sc] == color)){
            return ;
        }
        image[sr][sc] = color;
        helpFloodFill(image,sr+1,sc,color,target);
        helpFloodFill(image,sr-1,sc,color,target);
        helpFloodFill(image,sr,sc+1,color,target);
        helpFloodFill(image,sr,sc-1,color,target);
    }
}
