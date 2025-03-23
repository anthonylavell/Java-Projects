package leetcode.arrays.two_dimensional;

import java.util.Arrays;

public class Reshape {
    public static void main(String[] args) {

        //int[][] mat = {{1,2,10},{3,4,11},{5,6,12},{8,9,13}};
        int[][] mat = {{1,2,10},{3,4,11},{5,6,12},{8,9,13}};
        int[][] temp = matrixReshape(mat,6,2);
        System.out.println("temp.length = " + temp.length);
        System.out.println("Temp: "+ Arrays.deepToString(temp));
        System.out.println("mat: "+ mat.length);

    }
    public static int[][] matrixReshape(int[][] mat, int r, int c) {
        if((mat.length*mat[0].length) != (r*c)){
            return mat;
        }
        int[][] reshapeArr = new int[r][c];
        int matRow = 0;
        int matCol = 0;
        for(int row = 0; row < reshapeArr.length; row++){
            for (int col = 0; col < reshapeArr[row].length; col++){
                if(matCol >=mat[matRow].length){
                    matCol = 0;
                    matRow++;
                }
                reshapeArr[row][col] = mat[matRow][matCol];
                matCol++;
            }
        }
        return reshapeArr;
    }
}
