package leetcode.arrays.two_dimensional;

public class Matrix {
    public static void main(String[] args) {
        int[][] matrix = {{1, 3, 5, 7}, {10, 11, 16, 20}, {23, 30, 34, 60}, {61, 62, 63, 64}, {65, 66, 67, 68}, {69, 70, 71, 72}, {73, 74, 75, 76}};
        int target = 65;
        System.out.println(searchMatrix(matrix, target));
    }

    public static boolean searchMatrix(int[][] matrix, int target) {
        int start = 0;
        int end = matrix.length - 1;
        int findRow = (end+start) / 2;
        while (start < end) {
            if (target == matrix[findRow][matrix[findRow].length - 1]) {
                return true;
            } else if (target < matrix[findRow][matrix[findRow].length - 1]) {
                end = findRow;
            } else {
                findRow++;
                start = findRow;
            }
            findRow = (end + start) / 2;
        }
        start=0;
        end = matrix[findRow].length-1;
        int findElement = (end+start) / 2;
        while (start<=end){
            if(target == matrix[findRow][findElement]){
                return true;
            }else if(target < matrix[findRow][findElement]){
                end = findElement-1;
            }else {
                start = findElement+1;
            }
            findElement = (end+start) / 2;
        }
        return false;
    }
}
