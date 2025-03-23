package practice.test;
import practice.array.Matrix;
import java.util.Arrays;
import static java.lang.System.*;

public class TestMatrix {
    public static void main(String[] arg){
       /* int [][] matrix = new int[][] { {0,1,2,0},
                                        {3,4,5,2},
                                        {1,3,1,5}
                                       };*/
        /*int [][] matrix = new int[][] { {0,0,0,0},
                                        {0,0,0,0},
                                        {0,0,0,0}
        };*/

        /*int [][] matrix = new int[][] { {0,1,2,0},
                {3,4,5,2},
                {1,3,1,5}
        };*/

      /*  int [][] matrix = new int[][] { {4,1,2,5},
                                        {3,0,5,2},
                                        {1,3,0,5}
        };*/

        int [][] matrix = new int[][] { {-1},
                {2},
                {3}
        };
        out.println(matrix.length);
        out.println(matrix[0].length);
        out.println(Arrays.deepToString(Matrix.setZero(matrix)));
    }
}
