package code.pattern.two_pointers;

import java.util.List;

public class MoveZeroes {
    public static void moveZeros(List<Integer> nums) {
        // WRITE YOUR BRILLIANT CODE HERE
        int leftIndex = 0;
        for (int rightIndex = 0; rightIndex < nums.size(); rightIndex++) {
            if (nums.get(rightIndex) != 0) {
                if (nums.get(leftIndex) == 0) {
                    nums.set(leftIndex,nums.get(rightIndex));
                    nums.set(rightIndex,0);
                }
                leftIndex++;
            }
        }
    }
}
