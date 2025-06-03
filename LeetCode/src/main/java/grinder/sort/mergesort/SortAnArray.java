package grinder.sort.mergesort;

import java.util.Arrays;

public class SortAnArray {
    public static void main(String[] args) {
        int [] numbers = {5,2,0,1,0,4};

        System.out.println(Arrays.toString(sortArray(numbers)));
    }
    public static int[] sortArray(int[] numbers) {
        merge(numbers,0, numbers.length-1);
        return numbers;
    }

    private static void merge(int[] numbers, int left, int right){
        if (left < right){
            int mid = (right+left)/2;
            merge(numbers,left,mid);
            merge(numbers,mid+1,right);
            mergeSort(numbers,left,mid,right);
        }
    }

    private static void mergeSort(int[] numbers, int low,int mid, int high){
        int[] leftArray = Arrays.copyOfRange(numbers,low,mid+1);
        int[] rightArray = Arrays.copyOfRange(numbers,mid+1,(high+1));
        int leftIndex = 0;
        int rightIndex = 0;
        int count = low;
        while (leftIndex < leftArray.length && rightIndex < rightArray.length){
            if (leftArray[leftIndex] < rightArray[rightIndex]){
                numbers[count++] = leftArray[leftIndex++];
            }else {
                numbers[count++] = rightArray[rightIndex++];
            }
        }
        while (leftIndex < leftArray.length){
            numbers[count++] = leftArray[leftIndex++];
        }
        while (rightIndex < rightArray.length){
            numbers[count++] = rightArray[rightIndex++];
        }
    }
}
