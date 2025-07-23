package comp_p.pay_pal;

import java.util.HashSet;
import java.util.Set;

public class ValidSudoku {
    public static void main(String[] args) {
        char[][] board = {
                {'5','3','.','.','7','.','.','.','.'},
                {'6','.','.','1','9','5','.','.','.'},
                {'.','9','8','.','.','.','.','6','.'},
                {'8','.','.','.','6','.','.','.','3'},
                {'4','.','.','8','.','3','.','.','1'},
                {'7','.','.','.','2','.','.','.','6'},
                {'.','6','.','.','.','.','2','8','.'},
                {'.','.','.','4','1','9','.','.','5'},
                {'.','.','.','.','8','.','.','7','9'}};

        char[][] board2 ={
                {'.','.','.','.','5','.','.','1','.'},
                {'.','4','.','3','.','.','.','.','.'},
                {'.','.','.','.','.','3','.','.','1'},
                {'8','.','.','.','.','.','.','2','.'},
                {'.','.','2','.','7','.','.','.','.'},
                {'.','1','5','.','.','.','.','.','.'},
                {'.','.','.','.','.','2','.','.','.'},
                {'.','2','.','9','.','.','.','.','.'},
                {'.','.','4','.','.','.','.','.','.'}};


        char[][] board3 = {
                {'9','.','.','6','.','.','.','.','.'},
                {'.','.','.','.','6','.','.','.','.'},
                {'.','.','.','.','.','1','.','3','.'},
                {'.','.','.','.','.','.','.','.','8'},
                {'.','.','.','.','.','8','.','.','.'},
                {'.','.','.','4','.','.','2','.','.'},
                {'.','.','.','.','.','.','.','.','1'},
                {'6','.','.','.','1','.','.','.','.'},
                {'.','.','.','.','.','.','.','.','.'}};
        System.out.println(isValidSudoku(board2));
    }
    public static boolean isValidSudoku(char[][] board) {
        if (!isValidRows(board) || !isValidCols(board)){
            return false;
        }

        for (int row = 0; row < 7; row+=3){
            for (int col = 0; col < 7; col+= 3){
                if(!isValidThreeByThree(board,row,col)){
                    return false;
                }
            }
        }
        return true;
    }
    private static boolean isValidRows(char[][] board){
        for (int row = 0; row < board.length;row++){
            Set<Character>trackRow = new HashSet<>();
            for (int col = 0; col < board[row].length; col++) {
                if (board[row][col] != '.') {
                    if (!trackRow.add(board[row][col])) {
                        return false;
                    }
                }
            }
        }
        return true;
    }

    private static boolean isValidCols(char[][] board){
        for (int col = 0; col < board.length;col++){
            Set<Character>trackCol = new HashSet<>();
            for (int row = 0; row < 9; row++) {
                if (board[row][col] != '.') {
                    if (!trackCol.add(board[row][col])) {
                        return false;
                    }
                }
            }
        }
        return true;
    }

    private static boolean isValidThreeByThree(char[][] board, int sr, int sc){
        Set<Character>track = new HashSet<>();
        for (int row = sr; row < (sr+3); row++ ){
            for (int col = sc; col < (sc+3); col++) {
                if (board[row][col] != '.') {
                    if (!track.add(board[row][col])) {
                        return false;
                    }
                }
            }
        }
        return true;
    }
}
