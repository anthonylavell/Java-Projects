package comp_p.fantasic;

/*
 * Click `Run` to execute the snippet below!
 */

import java.util.Arrays;

/*
 * To execute Java, please define "static void main" on a class
 * named Solution.
 *
 * If you need more classes, simply define them inline.
 */

// Overview:
// Write a program in the requested language that will display an ASCII chart given the following data
// data = {(1,2), (2, 3), (3, 1), (4, 6), (5, 8)}.
// You should be able to print the surrounding components of the chart and then place an * where
// each data point is specified in the data set. You do not need to print the X and Y legends
// but that would be helpful. You are given the max x and max y but if you can calculate that
// it would be helpful.
//
//  Online auction graph display
//  x axis is time
//  y axis is price
//  Title item
//
//  Given a two-dimension array graph the price over time
//
//     +-----+-----+-----+-----+-----+-----+
//     +                             *     +
//     +                                   +
//     +                       *           +
//   $ +                                   +
//     +                                   +
//     +           *                       +
//     +     *                             +
//     +                 *                 +
//     +-----+-----+-----+-----+-----+-----+
//                   time
//
//   max_x = 5
//   max_y = 8
//   data = {{1,2}, {2, 3}, {3, 1}, {4, 6}, {5, 8}}

class FantasicChart{
    public static void main(String[] args) {
        int[][] datas = {{1,2}, {2, 3}, {3, 1}, {4, 6}, {5, 8}};
        int row = 10;
        int col = 7;
        char[][] graph = new char[row][col];
        for(int index = 0; index < graph.length; index++){
            if(index ==0 || index == 9){
                Arrays.fill(graph[index],'-');
            }
            graph[index][0] = '+';
            graph[index][6] = '+';
        }

        for(int[] data : datas){
            int r = data[1];
            int c = data[0];
            r = 8-r+1;
            graph[r][c] = '*';
            graph[9][c] = '+';
            graph[0][c] = '+';
        }
        for(char[] ch : graph ){
            System.out.println(Arrays.toString(ch));
        }
    }
}

