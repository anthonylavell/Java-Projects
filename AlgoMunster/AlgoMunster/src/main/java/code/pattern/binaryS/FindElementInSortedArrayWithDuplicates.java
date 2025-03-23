package code.pattern.binaryS;

import java.util.List;

public class FindElementInSortedArrayWithDuplicates {
    public static int findFirstOccurrence(List<Integer> arr, int target) {
        int foundIndex = -1;
        int leftIndx = 0;
        int rightIndx = arr.size() - 1;
        while (leftIndx <= rightIndx) {
            int mid = (leftIndx + rightIndx) / 2;
            int temp = arr.get(mid);
            if (temp <= target) {
                if(temp== target){
                    foundIndex = mid;
                }
                rightIndx = mid - 1;
            } else {
                leftIndx = mid + 1;
            }
        }
        return foundIndex;
    }
}
