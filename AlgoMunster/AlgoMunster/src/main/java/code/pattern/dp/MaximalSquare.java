package code.pattern.dp;

import java.util.List;

public class MaximalSquare {
    public static int maximalSquare(List<List<Integer>> matrix) {
        // WRITE YOUR BRILLIANT CODE HERE
        int square = 0;
        for(int row = 0; row < matrix.size(); row++){
            for (int col = 0; col < matrix.get(row).size(); col++){
                int subTotal = matrix.get(row).get(col);
                if(row > 0 && col > 0 && matrix.get(row).get(col) > 0){
                    int left = matrix.get(row).get(col-1);
                    int upLeft = matrix.get(row-1).get(col-1);
                    int up = matrix.get(row-1).get(col);
                    subTotal+= Math.min(Math.min(left,upLeft),up);
                }
                square = (subTotal > square) ? subTotal : square;
                if (matrix.get(row).get(col) < subTotal){
                    matrix.get(row).set(col,subTotal);
                }
            }
        }
        return square * square;
    }
}
