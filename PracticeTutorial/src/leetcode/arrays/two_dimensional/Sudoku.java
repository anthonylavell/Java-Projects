package leetcode.arrays.two_dimensional;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Sudoku {
    public static void main(String[] args) {
       char [][] board = {
               {'5','3','.','.','7','.'},
               {'6','.','7','1','9','5'},
               {'.','9','1','.','.','.'},
               {'8','1','.','.','6','.'},
               {'4','.','.','8','.','3'},
               {'7','.','.','.','2','.'}
       };
        System.out.println(board[0].length);
        List<List<Character>>listOfChar = new ArrayList<>();
        //System.out.println(listOfChar.contains('a'));
        System.out.println(isValidSudoku(board));
    }
    public static boolean isValidSudoku(char[][] board) {
        List<List<Character>>listOfRow = new ArrayList<>();
        List<List<Character>>listOfCol = new ArrayList<>();

        for(int row = 0; row < board.length; row++){

            List<Character>listOfChar = new ArrayList<>();
            for(int col = 0; col < board[row].length; col++){
                if(row == 0) {
                    listOfCol.add(new ArrayList<>(Arrays.asList(board[row][col])));
                }else {
                    if(board[row][col] != '.' && listOfCol.get(col).contains(board[row][col])){
                        return false;
                    }
                    listOfCol.get(col).add(board[row][col]);
                }
                if(listOfChar.contains(board[row][col]) && board[row][col] != '.'){
                    return false;
                }

                listOfChar.add(board[row][col]);

            }
            listOfRow.add(listOfChar);
        }

        int countRow = 0;
        for(int row = 1; row < listOfRow.size(); row++){
            int startCol = 0;
            int endCol = 2;
            if(row > 0 && row%3==0){
                countRow = countRow+3;
            }
            int col = 0;
            int tempRow = row-1;
            while (tempRow>=countRow ){
                if(col%3==0&& col>0){
                    startCol=col;
                    endCol=col+2;
                }
                int index = (listOfRow.get(row).get(col) == '.')? -1 : listOfRow.get(tempRow).indexOf(listOfRow.get(row).get(col));
                if(index>-1 && (index>= startCol && index<=endCol)){
                    return false;
                }
                if(col < listOfRow.get(0).size()-1){
                    col++;
                    continue;
                }
                col=0;
                startCol = 0;
                endCol = 2;
                tempRow--;

            }
        }
        return true;

    }
}
