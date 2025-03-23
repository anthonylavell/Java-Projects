package wayfair.array;

public class WordSearch {
   private static boolean[][] visited = null;
    public static void main(String[] args) {
        //char[][] board = {{'A','B','C','E'},{'P','F','P','S'},{'A','D','E','E'}};
        char[][] board = {{'A','B','C','E'},{'S','E','C','S'},{'A','D','E','E'}};
        String word = "ABCB";
        System.out.println(exist(board,word));
    }
    public static boolean exist(char[][] board, String word) {
        visited = new boolean[board.length][board[0].length];
        for(int row = 0; row < board.length; row++){
            int index = 0;
            for(int col = 0; col < board[row].length; col++){
                if(word.charAt(0)== board[row][col] && getString(board,row,col,word,index)){
                    return true;
                }
            }
        }
        return false;
    }
    private static boolean getString(char[][] board,int row,int col, String word,int index){
        if(index == word.length()){
            return true;
        }
        if(row < 0 || row > board.length-1 || col < 0 || col > board[row].length-1 || visited[row][col] || word.charAt(index) != board[row][col]){
            return false;
        }
        visited[row][col] = true;
        index++;

        if(getString(board,row,col+1,word,index) || getString(board,row,col-1,word,index)
        || getString(board,row+1,col,word,index) || getString(board,row-1,col,word,index)){
            return true;
        }
        visited[row][col] = false;
        return false;
    }
}
