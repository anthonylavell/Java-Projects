package grinder.random;

import java.util.PriorityQueue;

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

        int [] A = {-1, -3};
        System.out.println(number(A));
    }

    public static int number(int[]A){
        PriorityQueue<Integer> queue = new PriorityQueue<>();
        for (int num : A) {
            if (num > 0) {
                queue.add(num);
            }
        }
        int prev = -1;
       for (int index = 0; !queue.isEmpty(); index++){
           int num = queue.poll();
            if(index > 0 && num - prev > 1){
                return prev +1;
            }
            prev = num;
        }

        return (prev != -1) ? prev + 1 : 1;
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
