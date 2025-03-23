package array.client;

import array.minimum_bribes.Bribes;

public class BribeClient {
    public static void main(String[] args) {
        //int [] line = {2,5,1,4,3,8,7,6};
                     //1  2  3  4  5  6  7  8
        int [] line = {1, 2, 5, 3, 7, 8, 6, 4};
        //int [] line = {2,1,3,4,5};
        Bribes.minimumBribes(line);

    }
}
