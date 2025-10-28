package grinder.dp;

public class NumMatrix {
    private int[][] pre;

    public static void main(String[] args) {
        int[][] matrix = { {1, 2, 3},{4, 5, 6} };
        NumMatrix numMatrix = new NumMatrix(matrix);
    }

    public NumMatrix(int[][] matrix) {
        setPre(matrix);

    }

    public int sumRegion(int row1, int col1, int row2, int col2) {
        int sum = pre[row2+1][col2+1] - pre[row1][col2+1] - pre[row2+1][col1]
                + pre[row1][col1];
        return sum;
    }

    private void setPre(int[][] matrix){
        this.pre = new int[matrix.length+1][matrix[0].length+1];
        for (int row = 0; row < matrix.length; row++){
            for (int col = 0; col < matrix[row].length; col++){
                pre[row+1][col+1] = matrix[row][col] + pre[row][col+1] + pre[row+1][col]
                        - pre[row][col];
            }
        }
    }
}
