package grinder.random;

import java.util.Stack;

public class Solution {

    public static void main(String[] args) {
        /*JSONObject jsonObject = new JSONObject(getLeetCode());
        JSONObject leetCode = jsonObject.getJSONObject("data");
        int sc = leetCode.getInt("sc");
        int sr = leetCode.getInt("sr");
        int color = leetCode.getInt("color");
        JSONArray leetCodeImage =  leetCode.getJSONArray("image");
        int rowLen = leetCodeImage.length();
        int[][] image = new int[rowLen][leetCodeImage.getJSONArray(0).length()];
        for (int row = 0; row < leetCode.getJSONArray("image").length(); row++){
            JSONArray rowVals = leetCodeImage.getJSONArray(row);
            for (int col = 0; col < rowVals.length(); col++){
                image[row][col] = rowVals.getInt(col);
            }
        }
        floodFill(image,sr,sc,color);*/

        System.out.println(evaluateReversePolishNotation("1 2 + 4 -"));

    }

    public static int evaluateReversePolishNotation(String expression) {
        int total = 0;
        Stack<Integer> stack = new Stack<>();
        for(char ch : expression.toCharArray()){
            if(ch == '+' || ch == '-'){
                int num2 = stack.pop();
                int num = stack.pop();
                total = (helper(num,num2,ch));
            }else if (ch != ' ') {
                total = ch-'0';
            }else {
                continue;
            }
            stack.add(total);
        }
        return stack.pop(); // Placeholder return statement
    }

    private static int helper(int num, int num2, char sign){
        return ((sign == '+') ? (num + num2) : (num - num2));
    }

    public static int[][] floodFill(int[][] image, int sr, int sc, int color) {
        findAdjacentPixel(image,sr,sc,color,image[sr][sc]);
        return image;
    }

    private static void findAdjacentPixel(int[][] image, int sr, int sc, int color,int orgColor){
        if(sr >= image.length || sr < 0 || sc < 0 || sc >= image[sr].length || image[sr][sc] == color){
            return;
        }
        if(image[sr][sc] == orgColor){
            image[sr][sc] = color;
            findAdjacentPixel(image,sr+1,sc,color,orgColor);
            findAdjacentPixel(image,sr-1,sc,color,orgColor);
            findAdjacentPixel(image,sr,sc+1,color,orgColor);
            findAdjacentPixel(image,sr,sc-1,color,orgColor);
        }
}

    private static String getLeetCode(){
        return  """
               {"data" :{
               "image":[[0,0,0],[0,0,0],[0,0,0]],
               "sr":0,
               "sc":0,
               "color":0
               }}
               """ ;
            }

}
