/*
    Determine if a 9 x 9 Sudoku board is valid. Only the filled cells need to be validated
    according to the following rules:

Each row must contain the digits 1-9 without repetition.
Each column must contain the digits 1-9 without repetition.
Each of the nine 3 x 3 sub-boxes of the grid must contain the digits 1-9 without repetition.
Note:

A Sudoku board (partially filled) could be valid but is not necessarily solvable.
Only the filled cells need to be validated according to the mentioned rules.


Example 1:
Input: board =
[["5","3",".",".","7",".",".",".","."]
,["6",".",".","1","9","5",".",".","."]
,[".","9","8",".",".",".",".","6","."]
,["8",".",".",".","6",".",".",".","3"]
,["4",".",".","8",".","3",".",".","1"]
,["7",".",".",".","2",".",".",".","6"]
,[".","6",".",".",".",".","2","8","."]
,[".",".",".","4","1","9",".",".","5"]
,[".",".",".",".","8",".",".","7","9"]]
Output: true
Example 2:

Input: board =
[["8","3",".",".","7",".",".",".","."]
,["6",".",".","1","9","5",".",".","."]
,[".","9","8",".",".",".",".","6","."]
,["8",".",".",".","6",".",".",".","3"]
,["4",".",".","8",".","3",".",".","1"]
,["7",".",".",".","2",".",".",".","6"]
,[".","6",".",".",".",".","2","8","."]
,[".",".",".","4","1","9",".",".","5"]
,[".",".",".",".","8",".",".","7","9"]]
Output: false
Explanation: Same as Example 1, except with the 5 in the top left corner being
modified to 8. Since there are two 8's in the top left 3x3 sub-box, it is invalid.


Constraints:

board.length == 9
board[i].length == 9
board[i][j] is a digit 1-9 or '.'.
 */
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

        for (int row = 0; row < board.length; row+=3){
            for (int col = 0; col < board[row].length; col+= 3){
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
