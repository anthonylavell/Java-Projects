package code_patterns.binaryS;

public class PeakIndexInAMountainArray {
    public static void main(String[] args) {
        int [] arr = {0,1,0};
        int foundNum = peakIndexInMountainArray(arr);
        System.out.println(foundNum);
    }
    public static int peakIndexInMountainArray(int[] arr) {
        int foundPeak = 0;
        int leftIndex = 0;
        int rightIndex = arr.length-1;
        while (leftIndex<=rightIndex){
            int mid = leftIndex + (rightIndex-leftIndex)/2;
            if(arr[mid] > arr[mid+1]){
                foundPeak = mid;
                rightIndex = mid -1;
            }else {
                leftIndex = mid +1;
            }
        }
        return foundPeak;
    }
}
