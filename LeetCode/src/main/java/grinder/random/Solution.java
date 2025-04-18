package grinder.random;

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
