package code.pattern.binaryS;

import java.util.List;

public class BinarySearch {
    public static int binarySearch(List<Integer> arr, int target) {
        int leftIndx = 0;
        int rightIndx = arr.size()-1;
       while (leftIndx <= rightIndx){
           int mid = (rightIndx+leftIndx)/2;
           int temp = arr.get(mid);
           if(temp == target){
               return mid;
           }else if(temp < target){
               leftIndx = mid +1;
           }else {
               rightIndx = mid -1;
           }

       }
        return -1;
    }
}
