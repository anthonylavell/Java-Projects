package code.pattern.binaryS;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class PeakIndexInAMountainArray {
    public static void main(String[] args) {
        //List<Integer> arr = new ArrayList<>(Arrays.asList(0,2,1,0));
        List<Integer> arr = new ArrayList<>(Arrays.asList(0,10,3,2,1,0));
        int foundNum = peakIndexInMountainArray(arr);
        System.out.println(foundNum);
    }
    public static int peakIndexInMountainArray(List<Integer> arr) {
        int foundPeak = 0;
        int leftIndex = 0;
        int rightIndex = arr.size()-1;
        while (leftIndex<=rightIndex){
            int mid = (rightIndex+leftIndex)/2;
            if(leftIndex == rightIndex || (mid -1) < 0 || arr.get(mid) > arr.get(mid-1)){
                if(arr.get(mid) > arr.get(foundPeak)){
                    foundPeak = mid;
                }
                leftIndex = mid +1;
            }else {
                rightIndex = mid -1;
            }
        }
        return foundPeak;
    }
}
