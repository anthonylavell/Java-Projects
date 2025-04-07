package grinder.dp;

import java.util.Arrays;
import java.util.List;

public class Triangle {
    public static void main(String[] args) {
        List<List<Integer>> triangle = Arrays.asList(
                Arrays.asList(2),
                Arrays.asList(3,4),
                Arrays.asList(6,5,7),
                Arrays.asList(4,1,8,3)
        );
        List<List<Integer>> triangle2 = Arrays.asList(
                Arrays.asList(-1),Arrays.asList(2,3),Arrays.asList(1,-1,-3)
        );

        List<List<Integer>> triangle3 = Arrays.asList(
                Arrays.asList(-1),Arrays.asList(3,2),Arrays.asList(1,-2,-1)
        );
        System.out.println(minimumTotal(triangle3));

    }

    public static int minimumTotal(List<List<Integer>> triangle) {
        int[] keepTrack = new int[triangle.get(triangle.size()-1).size()];
        for(int row = triangle.size()-1; row >= 0; row--){
            for (int col = 0; col < triangle.get(row).size();col++){
                if(row == triangle.size()-1){
                    keepTrack[col]=triangle.get(row).get(col);
                    continue;
                }
                keepTrack[col]=(Math.min(keepTrack[col],keepTrack[col+1]))+triangle.get(row).get(col);
            }
        }
        return keepTrack[0];
    }

}
