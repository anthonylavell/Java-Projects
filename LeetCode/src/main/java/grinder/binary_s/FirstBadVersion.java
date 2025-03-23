package grinder.binary_s;

public class FirstBadVersion {
    public static int firstBadVersion(int n) {
        int leftIndex = 1;
        while (leftIndex < n){
            int mid = leftIndex + ((n-leftIndex) / 2);
            if(isBadVersion(mid)){
                n = mid;
            }else {
                leftIndex = mid + 1;
            }
        }
        return leftIndex;
    }
    public static boolean isBadVersion(int n){
        return true;
    }
}
