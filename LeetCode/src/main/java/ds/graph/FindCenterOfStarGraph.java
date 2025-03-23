package ds.graph;

import java.util.HashSet;
import java.util.Set;

public class FindCenterOfStarGraph {
    public static void main(String[] args) {
        int [][]edges = {{1,2},{5,1},{1,3}};
        int midMatrix = edges.length/2;
        System.out.println(midMatrix);
    }

    public static int findCenter(int[][] edges) {
        Set<Integer> setOfIntegers = new HashSet<>();
        for(int[] edge : edges){
            if(!setOfIntegers.add(edge[0])){
               return edge[0];
            }
            if(!setOfIntegers.add(edge[1])){
               return edge[1];
            }
        }
        return -1;

    }
}
