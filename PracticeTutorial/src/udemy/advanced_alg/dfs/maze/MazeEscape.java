package udemy.advanced_alg.dfs.maze;

public class MazeEscape {
    private int startRow;
    private int startCol;
    private int[][] maze;
    private boolean[][] visited;

    public MazeEscape(int[][] maze,int startRow, int startCol) {
        this.startRow = startRow;
        this.startCol = startCol;
        this.maze = maze;
        this.visited = new boolean[maze.length][maze.length];
    }

    public void findWay(){
        if(dfs(startRow, startCol)){
            System.out.println("Solution Exists");
        }else {
            System.out.println("No Solution Exists");
        }
    }

    private boolean isFeasible(int row, int col){
        if(row < 0 || row > maze.length-1){
            return false;
        }
        if(col < 0 || col > maze[row].length-1){
            return false;
        }
        if(maze[row][col] == 1 || visited[row][col]){
            return false;
        }
        return true;
    }

    private boolean dfs(int row, int col){
        if(row == maze.length-1 && col == maze.length-1){
            return true;
        }
        if(isFeasible(row,col)){
            visited[row][col] = true;
            if(dfs(row+1,col)){
                return true;
            }
            if (dfs(row-1,col)){
                return true;
            }
            if (dfs(row,col+1)){
                return true;
            }
            if (dfs(row,col-1)){
                return true;
            }

            visited[row][col] = false;
            return false;
        }
        return false;
    }
}
