package grinder.graph.dfs;

public class FloodFill {
    public static void main(String[] args) {
        //int [][] image = {{1,1,1},{1,1,0},{1,0,1}};
        int [][] image = {{0,0,0},{0,0,0}};
        int sr = 1, sc = 1, color = 2;
        //System.out.println(image.length);
        //System.out.println(image[0].length);
        int [][] newImage = floodFill(image,sr,sc,color);
    }

    public static int[][] floodFill(int[][] image, int sr, int sc, int color) {
        return helpFloodFill(image,sr,sc,color,image[sr][sc]);
    }
    private static int[][] helpFloodFill(int[][] image, int sr, int sc, int color,int orgColor) {
        if(image[sr][sc] != orgColor || image[sr][sc] == color){
            return image;
        }
        image[sr][sc] = color;
        if(sr - 1  >= 0){
            helpFloodFill(image,sr-1,sc,color,orgColor);
        }

        if(sr + 1 < image.length){
            helpFloodFill(image,sr+1,sc,color,orgColor);
        }

        if(sc - 1  >= 0){
            helpFloodFill(image,sr,sc-1,color,orgColor);
        }

        if(sc + 1 < image[0].length){
            helpFloodFill(image,sr,sc+1,color,orgColor);
        }
        return image;
    }
}
