package comp_p.pay_pal;

public class SudokuSolver {
    public static void solveSudoku(char[][] board) {
        findNumber(board);

    }
    public static boolean findNumber(char[][] board){
        for(int row=0;row<board.length;row++){
            for(int col=0;col<board[0].length;col++){
                if(board[row][col] == '.'){     // if cells are vacant
                    for(int num=1;num<=9;num++){
                        if(isValid(board,row,col,(char)(num+'0') )){
                            board[row][col] = (char)(num+'0');
                            if(findNumber(board))
                                return true;
                            board[row][col] = '.';
                        }
                    }
                    return false;
                }
            }
        }

        return true;

    }
    public static boolean isValid(char[][] board,int sr,int sc,char store) {
        // row check
        for (int col = 0; col < board[0].length; col++) {
            if (board[sr][col] == store)
                return false;
        }
        // col check
        for (int row = 0; row < board.length; row++) {
            if (board[row][sc] == store)
                return false;
        }
        // grid check
        int rLen = sr / 3;
        int cLen = sc / 3;
        for (int row = rLen * 3; row < rLen * 3 + 3; row++) {
            for (int col = cLen * 3; col < cLen * 3 + 3; col++) {
                if (board[row][col] == store)
                    return false;
            }
        }
        return true;
    }


}
