package practice.array;

import java.util.Arrays;

public class Matrix {
    public static int[][] setZero(int[][] matrix){
        boolean firstRow = false;
        for(int col = 0; col < matrix[0].length; col++){
            if(matrix[0][col] == 0 ){
                firstRow = true;
                break;
            }
        }

            for (int row = 1; row < matrix.length; row++) {
                boolean setRowToZero = false;
                for (int col = 0; col < matrix[row].length; col++) {
                        if(matrix[row][col] == 0){
                            setRowToZero = true;
                            int counter = row-1;
                            while (counter >= 0) {
                                matrix[counter][col] = 0;
                                counter--;
                            }
                        }else if(matrix[0][col] == 0) {
                            matrix[row][col] = 0;
                        }
                }
                if(setRowToZero == true){
                    Arrays.fill(matrix[row], 0);
                }
            }
           if(firstRow){
               Arrays.fill(matrix[0], 0);
           }



        return matrix;

    }
}
