package func;

public class FirstBadVersion {
    public static void main(String[] args) {

    }
    public int firstBadVersion(int n) {
        int left = 1;
        while (left < n){
            int mid = left+(n-left)/2;
            if(isBadVersion(mid)){
               n =mid;
            }else {
                left = mid+1;
            }
        }
        return left;
    }
    boolean isBadVersion(int version){
        return false;
    }
}
