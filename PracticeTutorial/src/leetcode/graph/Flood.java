package leetcode.graph;

public class Flood {
    private static int originalNum;
    public static int[][] floodFill(int[][] image, int sr, int sc, int newColor) {
        boolean[][] visited = new boolean[image.length][image[sr].length];
        originalNum = image[sr][sc];
        traversal(visited,image,sr,sc,newColor);
        return image;
    }
    private static void traversal(boolean[][] visited,int[][] image,int sr, int sc, int newColor){
        if(!isFeasible(visited,image,sr,sc)){
            return;
        }
        visited[sr][sc]= true;
        traversal(visited,image,sr+1,sc,newColor);
        traversal(visited,image,sr-1,sc,newColor);
        traversal(visited,image,sr,sc+1,newColor);
        traversal(visited,image,sr,sc-1,newColor);
        image[sr][sc] = newColor;
    }

    private static boolean isFeasible(boolean[][] visited, int[][] image,int sr, int sc){
        if(sr < 0 || sr > image.length-1){
            return false;
        }
        if(sc < 0 || sc > image[sr].length-1){
            return false;
        }
        if(image[sr][sc] != originalNum || visited[sr][sc]){
            return false;
        }
        return true;
    }
}
