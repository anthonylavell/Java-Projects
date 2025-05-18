package grinder.random;

import java.util.*;

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

        int numCourses = 2;
        int [][]prerequisites = {{0,1}};
        System.out.println(canFinish(numCourses,prerequisites));

    }

    public static boolean canFinish(int numCourses, int[][] prerequisites) {
        int popCount = 0;
        Map<Integer, List<Integer>>graph = new HashMap<>();
        Map<Integer,Integer>indirect = new HashMap<>();
        Deque<Integer>queue = new ArrayDeque<>();
        for (int[]row : prerequisites){
            graph.computeIfAbsent(row[1], k->new ArrayList<>()).add(row[0]);
            indirect.putIfAbsent(row[1],0);
            indirect.put(row[0],(indirect.getOrDefault((row[0]),0))+1);
        }
        for (Map.Entry<Integer,Integer> entry:indirect.entrySet()){
            if (entry.getValue() < 1){
                queue.add(entry.getKey());
            }
        }
        while (!queue.isEmpty()){
            int key = queue.pop();
           popCount++;
            List<Integer>list = graph.getOrDefault(key,new ArrayList<>());
            for (Integer current : list ){
                if (indirect.containsKey(current)){
                    indirect.put(current,indirect.get(current)-1);
                    if (indirect.get(current) < 1){
                        queue.add(current);
                    }
                }
            }
        }
        return popCount== graph.size();
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
