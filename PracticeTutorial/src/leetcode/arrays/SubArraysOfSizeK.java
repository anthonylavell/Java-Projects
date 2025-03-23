package leetcode.arrays;

public class SubArraysOfSizeK {
    public static void main(String[] args) {
        int[] arr = {2,2,2,2,5,5,5,8};
        int k = 3;
        int threshold = 4;

        int [] arr2 = {11,13,17,23,29,31,7,5,2,3};
        int k2 = 3;
        int threshold2 = 5;
        System.out.println(numOfSubarrays(arr2,k2,threshold2));
    }
    public static int numOfSubarrays(int[] arr, int k, int threshold) {
        int total = 0;
        int runningTotal =0;
        for(int i = 0; i <arr.length; i++){
            runningTotal+=arr[i];
            if(i >= k-1){
                total = ((runningTotal/k) >= threshold) ? total+1 : total;
                runningTotal-= arr[i-(k-1)];
            }
        }
        return total;
    }
}
