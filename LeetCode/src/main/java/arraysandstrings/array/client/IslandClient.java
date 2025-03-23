package arraysandstrings.array.client;

import arraysandstrings.array.two_dimensional.Island;

public class IslandClient {
    public static void main(String[] args) {
       /* char[][] grid = {{'1','1','1','1','0'},
                           {'1','1','0','1','0'},
                           {'1','1','0','0','0'},
                           {'0','0','0','0','0'}
        };*/

       /* char[][] grid = {{'1','1','1','1','0'},
                           {'1','1','0','1','0'},
                           {'1','1','0','0','1'},
                           {'0','0','0','0','0'}
        };*/
       /* char[][] grid = {{'0','1','0'},
                           {'1','1','1'},
                           {'1','1','1'}
        };*/

       /* char[][] grid = {{'0','0','1'},
                           {'1','1','1'},
                           {'1','0','1'}
        };*/

       /* char[][] grid = {{'0','1','0'},
                           {'0','0','1'},
                           {'1','0','1'},
                           {'1','1','1'}
        };*/

        // char[][] grid = null;
        char[][] grid = {{'1','1','1'},
                         {'0','1','0'},
                         {'1','1','1'}
        };
        System.out.println("Islands: " + Island.numIslands(grid));

        /*System.out.println(grid.length);
        System.out.println(grid[0].length);*/

    }
}

