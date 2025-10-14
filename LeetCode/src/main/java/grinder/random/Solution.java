package grinder.random;

import java.util.HashSet;
import java.util.PriorityQueue;
import java.util.Set;

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
        //System.out.println(number(A));
        int[]nums = {0,0,-1};
        System.out.println(longestConsecutive(nums));
    }
    public boolean isPalindrome(int x) {
        if (x < 0){
            return false;
        }
            return false;
    }

    public static int longestConsecutive(int[] nums) {
        int total = 0;
        Set<Integer>setOfInts = new HashSet<>();
        for (int num : nums){
            setOfInts.add(num);
        }
        for (int num : setOfInts){
            if (!setOfInts.contains(num-1)){
                int currentNum = num;
                int subTotal = 1;
                while (setOfInts.contains(currentNum+1)){
                    currentNum++;
                    subTotal++;
                }
                total = Math.max(total,subTotal);
            }
        }
        return total;
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
