package code.pattern.two_pointers;

import java.util.List;

public class RemoveDuplicatesFromSortedList {
    public static int removeDuplicates(List<Integer> arr) {
        // WRITE YOUR BRILLIANT CODE HERE
        int leftIndex = 0;
        for(int rightIndex = 1; rightIndex < arr.size(); rightIndex++){
            if(arr.get(leftIndex) != arr.get(rightIndex)){
                arr.set(++leftIndex,arr.get(rightIndex));
            }
        }
        return leftIndex+1;
    }
}
