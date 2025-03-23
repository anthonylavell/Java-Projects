package leetcode.integer;

public class FirstBadVersion {
    private static boolean [] arr = null;
    public static void main(String[] args) {
        int n = 25;
        int foundIndex = 24;
        System.out.println("firstBadVersion = " + firstBadVersion(n, foundIndex));
    }
    public static int firstBadVersion(int n, int foundIndex) {
        getArrayOfBoolean(n, foundIndex-1);
        return firstBadVersion(n);

    }

    private static int firstBadVersion(int n) {
        int startIndex = 0;
        int endIndex = n-1;
        while (startIndex<endIndex){
            int middle = (startIndex+endIndex)/2;
            if(isBadVersion(middle)){
                endIndex = middle;
            }else{
                startIndex = middle+1;
            }
        }
        return startIndex+1;
    }
    private static boolean isBadVersion(int version){
        return arr[version];
    }
    private static boolean [] getArrayOfBoolean(int n, int foundIndex){
        arr = new boolean[n];
        boolean sign = false;
        for(int num = 0; num < n; num++){
            if(num == foundIndex){
                sign = true;
            }
            arr[num] = sign;
        }
        return arr;
    }
}
