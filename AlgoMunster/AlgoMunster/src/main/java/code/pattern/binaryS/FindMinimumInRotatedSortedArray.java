package code.pattern.binaryS;

import java.util.List;

public class FindMinimumInRotatedSortedArray {
    public static void main(String[] args) {

    }

    public static int findMinRotated(List<Integer> arr) {
        int leftIndx = 0;
        int rightIndx = arr.size() - 1;
        int foundIndex = rightIndx;
        while (leftIndx <= rightIndx) {
            int mid = (leftIndx + rightIndx) / 2;
            int temp = arr.get(mid);
            if (leftIndx == rightIndx || temp <= arr.get(rightIndx) && temp <= arr.get(leftIndx)) {
                if(temp < arr.get(foundIndex))
                    foundIndex = mid;
            }
            if (temp < arr.get(rightIndx)){
                rightIndx = mid - 1;
            }else {
                leftIndx = mid +1;
            }
        }
        return foundIndex;
    }

}
