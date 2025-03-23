package code.pattern.two_pointers;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ContainerWithMostWater {
    public static void main(String[] args) {
        List<Integer> arr = new ArrayList<>(Arrays.asList(1,8,6,2,5,4,7,3,2));
        System.out.println(arr);
    }

    public static int containerWithMostWater(List<Integer> arr) {
        // WRITE YOUR BRILLIANT CODE HERE
        int leftIndex = 0;
        int rightIndex = arr.size() -1;
        int total = Integer.MIN_VALUE;
        while (leftIndex < rightIndex){
            int tempNum = (Math.min(arr.get(leftIndex), arr.get(rightIndex))) * (rightIndex - leftIndex);
            total = Math.max(total,tempNum);
            if(arr.get(leftIndex)< arr.get(rightIndex)) {
                leftIndex++;
            }else {
                rightIndex--;
            }
        }
        return total;
    }
}
