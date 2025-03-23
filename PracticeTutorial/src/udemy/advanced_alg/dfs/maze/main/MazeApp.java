package udemy.advanced_alg.dfs.maze.main;

import udemy.advanced_alg.dfs.maze.MazeEscape;

public class MazeApp {
    public static void main(String[] args) {
        int[][] map = {
                {1,1,1,1,1,1},
                {2,1,1,1,0,1},
                {0,0,0,1,0,1},
                {0,0,0,1,0,0}
        };
        MazeEscape maze = new MazeEscape(map,1,0);
        maze.findWay();
    }
}
