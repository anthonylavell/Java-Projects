package arraysandstrings.array.client;

import arraysandstrings.array.Matrix;

import java.util.Arrays;

public class TestMatrix {

    public static void main(String[] args) {
       /* int [][] matrix =  {
                {1,12,13,}, {2,23,24}, {3,34,35},{4,45,46}

        };*/

        int [][] matrix =  {
                {1,1,1}, {1,0,1}, {1,1,1}

        };

        Matrix setMatrix = new Matrix();
        setMatrix.setZero(matrix);
        System.out.println(Arrays.deepToString(matrix));

    }
}
