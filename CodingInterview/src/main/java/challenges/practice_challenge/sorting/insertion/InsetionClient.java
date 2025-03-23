package challenges.practice_challenge.sorting.insertion;

import java.util.Arrays;

public class InsetionClient {
    public static void main(String[] args) {
        //int [] sortNum = {99,44,6,2,1,5,63,87,283,4,0};
        //int [] sortNum = {25,47,3,19,8,18};
        int [] sortNum = {2,47,3,19,8,18};
        System.out.println(Arrays.toString(Insertion.sort(sortNum)));
    }
}
