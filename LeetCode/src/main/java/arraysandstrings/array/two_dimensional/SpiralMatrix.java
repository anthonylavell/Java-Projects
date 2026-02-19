package arraysandstrings.array.two_dimensional;

import java.util.ArrayList;
import java.util.List;

public class SpiralMatrix {
    public List<Integer> spiralOrder(int[][] matrix) {
        int left = 0;
        int right = matrix[0].length-1;
        int top =0;
        int bottom = matrix.length -1;
        List<Integer> order =new ArrayList<>();
        while (left <=right && top <= bottom){
            for (int col = left; col<=right; col++){
                order.add(matrix[top][col]);
            }
            top++;
            for (int row = top; row <= bottom; row++ ){
                order.add(matrix[row][right]);
            }
            right--;
            if (top <= bottom) {
                for (int col = right; col >= left; col--) {
                    order.add(matrix[bottom][col]);
                }
            }
            bottom--;
            if (left <= right) {
                for (int row = bottom; row >= top; row--) {
                    order.add(matrix[row][left]);
                }
            }
            left++;
        }
        return order;
    }


        public static void main(String[] args) {
            int[][] matrix = {{1,2,3,4},{5,6,7,8},{9,10,11,12}};
            int[][] matrix2 = {
                    {1,2,3,4},
                    {5,6,7,8},
                    {9,10,11,12},
                    {13,14,15,16},
                    {17,18,19,20},
                    {21,22,23,24}
            };
    }

}
