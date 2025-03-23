package leetcode.arrays.two_dimensional.main;

import leetcode.arrays.two_dimensional.Interval;

import java.util.Arrays;

public class IntervalMain {
    public static void main(String[] args) {
       /* int[][] intervals = {
                {1,3},
                {2,6},
                {8,10},
                {15,18}
        };*/
       /* int[][] intervals = {
                {}
        };*/
       /* int[][] intervals = {
                {1,4},
                {5,5},
                {0,4}
        };*/
        /*int[][] intervals = {
                {1,4},
                {0,1}
        };*/
        int[][] intervals = {
                {1,4},
                {0,0}
        };
       /* int[][] intervals = {
                {1,4},
                {0,1},
                {5,6}
        };*/
       /* int[][] intervals = {
                {1,4},
                {0,0},
                {5,6}
        };*/

        /*int[][] intervals = {
                {2,3},
                {1,4},
                {5,6},
                {7,8}
        };*/
       /* int[][] intervals = {
                {2,3},
                {0,4},
                {1,5},
                {5,6},
                {7,8}
        };*/
       /* int[][] intervals = {
                {2,3},
                {4,5},
                {6,7},
                {8,9},
                {1,10}
        };*/
        /*int[][] intervals = {
                {0,0},
                {1,2},
                {5,5},
                {2,4},
                {3,3},
                {5,6},
                {5,6},
                {4,6},
                {0,0},
                {1,2},
                {0,2},
                {4,5}
        };*/
        System.out.println(Arrays.deepToString(Interval.merge(intervals)));
    }
}
