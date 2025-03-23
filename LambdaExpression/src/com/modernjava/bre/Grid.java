package com.modernjava.bre;

public class Grid {
    public static void main(String[] args) {
        //String [][] grid = {{'p','p','f'}
                       // ,{'p','p','f'}};
    }
    public static Character signals( String [][] grid){
        char result =' ';
        for(int row = 0; row < grid.length; row++){
            char tempCh = grid[row][0].charAt(0);
            if(tempCh == 'P'|| tempCh == 'F'){
                for(int col = 1; col < grid[row].length; col++){
                    char colCh = grid[row][col].charAt(0);
                    if(tempCh != colCh){
                        break;
                    }else if(col == grid[row].length-1){
                        result = tempCh;
                    }
                }
            }
        }

        if(result == ' '){
            for(int col = 0; col < grid[0].length; col++){
                char tempCh = grid[0][col].charAt(0);
                if(tempCh == 'P'|| tempCh == 'F'){
                    for(int row = 1; row < grid.length; row++){
                        char ch = grid[row][col].charAt(0);
                        if(tempCh != ch){
                            break;
                        }else if(col == grid.length-1){
                            result = tempCh;
                        }
                    }
                }
            }
        }
        return result;

    }
}
