package arraysandstrings.array.two_dimensional;

public class WordSearch {
    public boolean exist(char[][] board, String word) {
        for(int row = 0; row < board.length; row++){
            boolean [][] visited = new boolean[board.length][board[row].length];
            for(int col = 0; col < board[row].length; col++){
                if(board[row][col] == word.charAt(0) && findWord(board,word,visited,0,row,col)){
                        return true;
                    }
            }
        }
        return false;
    }
    private boolean findWord(char[][] board, String word,boolean [][] visited,int index,int row,int col){
        if(index == word.length()){
            return true;
        }
        if(row < 0 || row > board.length-1 || col < 0 || col > board[row].length-1
                || visited[row][col] || word.charAt(index) != board[row][col]){
            return false;
        }
        index++;
        visited[row][col] = true;
       if( findWord(board,word,visited,index,row+1,col) || findWord(board,word,visited,index,row-1,col)
       || findWord(board,word,visited,index,row,col+1) || findWord(board,word,visited,index,row,col-1)){
           return true;
        }
        visited[row][col] = false;
        return false;
    }

    /*private boolean isFound(char[][] board, String word,boolean [][] visited,String foundStr,int row,int col){
        if(row < 0 || row > board.length-1 || col < 0 || col > board[row].length-1 || visited[row][col]){
            return false
        }
    }*/
}
