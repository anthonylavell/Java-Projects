package grinder.dp.bottom_up;

public class MaximalSquare {
    public static void main(String[] args) {
        char [][] matrix ={{'1','0','1','0','0'},{'1','0','1','1','1'},{'1','1','1','1','1'},
                {'1','0','0','1','0'}};
        char [][] matrix2 ={{'0','1'},{'1','0'}};
        char [][] matrix3 ={{'1'}};
        System.out.println(maximalSquare(matrix3));


    }
    public static int maximalSquare(char[][] matrix) {
        int largest = 0;
        for (int row = 0; row < matrix.length; row++){
            for (int col = 0; col < matrix[row].length;col++){
                int subTotal = matrix[row][col]-'0';
                if(row > 0 && col > 0 && matrix[row][col] != '0'){
                    int left = matrix[row][col-1]-'0';
                    int upLeft = matrix[row-1][col-1]-'0';
                    int up = matrix[row-1][col]-'0';
                    subTotal+= Math.min(Math.min(left,upLeft),up);
                }
               if(subTotal > largest){
                   largest=subTotal;
               }
               matrix[row][col] = (char) (subTotal + '0');
            }
        }
        return largest*largest;
    }
}
