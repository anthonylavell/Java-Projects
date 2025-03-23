package code.pattern.binaryS;

import java.util.List;

public class Boundary {

    public static int findBoundary(List<Boolean> arr) {
        int foundIndex = -1;
        int leftIndx = 0;
        int rightIndx = arr.size()-1;
        while (leftIndx <= rightIndx ){
            int mid = (leftIndx+rightIndx)/2;
            boolean torF = arr.get(mid);
            if(torF == true){
                foundIndex = mid;
                rightIndx = mid-1;
            } else {
                leftIndx = mid +1;
            }
        }
        return foundIndex;
    }
}
