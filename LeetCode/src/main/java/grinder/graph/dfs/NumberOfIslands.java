package grinder.graph.dfs;

import org.json.JSONArray;
import org.json.JSONObject;

public class NumberOfIslands {
    public static void main(String[] args) {
        JSONObject jsonObject = new JSONObject(getLeetCode());
        JSONObject leetCode = jsonObject.getJSONObject("data");
        JSONArray leetCodeGrid =  leetCode.getJSONArray("grid");
        int rowLen = leetCodeGrid.length();
        char [][] grid = new char[rowLen][leetCodeGrid.getJSONArray(0).length()];
        for (int row = 0; row < leetCode.getJSONArray("grid").length(); row++){
            JSONArray rowVals = leetCodeGrid.getJSONArray(row);
            for (int col = 0; col < rowVals.length(); col++){
                grid[row][col] = (char)('0' + rowVals.getInt(col));
            }
        }
        numIslands(grid);
    }

    public static int numIslands(char[][] grid) {
        int totalIsLands = 0;
        for (int row =0; row < grid.length; row++){
            for (int col = 0; col < grid[row].length; col++){
                if(grid[row][col] != '0'){
                    findIslands(grid,row,col);
                    totalIsLands++;
                }
            }
        }
        int i =0;
        return totalIsLands;
    }
    private static void findIslands(char[][] grid, int sr, int sc){
        if(sr < 0 || sr >= grid.length || sc < 0 || sc >=grid[sr].length || grid[sr][sc] == '0'){
            return;
        }
        grid[sr][sc] = '0';
        findIslands(grid,sr+1,sc);
        findIslands(grid,sr-1,sc);
        findIslands(grid,sr,sc+1);
        findIslands(grid,sr,sc-1);

    }

    private static String getLeetCode(){
        return """
                {"data" :{
                "grid": [
                          ['1','1','1','1','0'],
                          ['1','1','0','1','0'],
                          ['1','1','0','0','0'],
                          ['0','0','0','0','0']
                        ]
                }}
                """;
    }
}
