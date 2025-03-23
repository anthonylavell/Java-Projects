package math;

public class SquareRootEstimation {
    public static void main(String[] args) {
        int sqrt = 8;
        int result = mySqrt(sqrt);
        System.out.println(result);
    }

    public static int mySqrt(int n) {
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
