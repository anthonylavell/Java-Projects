package comp_p.hubspot;

import java.util.Arrays;

public class SortAnArray {
    public static void main(String[] args) {
        int [] numbers = {5,2,0,1,0,4};
        int [] numbers2 = {4,5,1,2,7,6};

        System.out.println(Arrays.toString(sortArray(numbers)));
    }
    public static int[] sortArray(int[] numbers) {
        merge(numbers,0, numbers.length-1);
       return numbers;
    }

    private static void merge(int[] numbers, int left, int right){
       if (left >=right){
           return;
       }
       int mid = (right+left)/2;
       merge(numbers,left,mid);
       merge(numbers,mid+1,right);
       mergeSort(numbers,left,mid,right);
    }

    private static void mergeSort(int[] numbers, int low,int mid, int high){
       int[]lArr = Arrays.copyOfRange(numbers,low,mid+1);
       int[]rArr = Arrays.copyOfRange(numbers,mid+1,high+1);
       int leftSize = lArr.length;
       int rightSize = rArr.length;
       int leftIndx = 0;
       int rightIndx = 0;
       int index = low;
       while (leftIndx < leftSize || rightIndx < rightSize){
           if (rightIndx >= rightSize || (leftIndx < leftSize) && lArr[leftIndx] < rArr[rightIndx]){
               numbers[index] = lArr[leftIndx++];
           }else {
               numbers[index] = rArr[rightIndx++];
           }
           index++;
       }

    }
}
