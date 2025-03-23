package code.pattern.binaryS;

public class SquareRootEstimation {
    public static int squareRoot(int n) {
        int foundSqrt = 1;
        int leftIndex = 1;
        int rightIndex = n;
        while (leftIndex <= rightIndex){
            int mid = leftIndex + (rightIndex-rightIndex) / 2;
            int avg = n / mid;
            if(mid == avg){
                return avg;
            }else if(mid > avg){
                foundSqrt = mid;
                rightIndex = mid -1;
            }else {
                leftIndex = mid +1;
            }
        }

        return foundSqrt - 1;
    }
}
