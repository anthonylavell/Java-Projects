package challenges.practice_challenge.sorting.bubble;

import java.util.Arrays;

public class TestBubbleSort {
    public static void main(String[] args) {
        //int [] sortNum = {2,65,34,2,1,7,8};
        int [] sortNum = {99,44,6,2,1,5,63,87,283,4,0};
        System.out.println(Arrays.toString(BubbleSort.sort(sortNum)) );

    }
}
