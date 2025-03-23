package sort;

import java.util.Arrays;

public class MergeSort {
    public static void main(String[] args) {
        int[] num = {6,5,4,8,7,1,2};
        System.out.println(Arrays.toString(merge(num)));;
    }

    public static int[] merge(int [] intArr){
        if(intArr.length ==1){
            return intArr;
        }
        int num = intArr.length;
        int[] left = Arrays.copyOfRange(intArr, 0, (num + 1)/2);
        int[] right = Arrays.copyOfRange(intArr, (num + 1)/2, num);
        intArr = sort(merge( left),merge( right));
        return intArr;
    }
    private static int[] sort(int [] left, int [] right){
        int [] tempArray = new int [left.length + right.length];
        int leftCounter = 0;
        int rightCounter = 0;
        for(int i = 0; i < tempArray.length; i++){
            if(rightCounter >= right.length ){
                tempArray[i] = left[leftCounter];
                leftCounter++;
            }else if(leftCounter >= left.length )  {
                tempArray[i] = right[rightCounter];
                rightCounter++;
            }else if(left[leftCounter] <= right[rightCounter]){
                tempArray[i] = left[leftCounter];
                leftCounter++;
            }else {
                tempArray[i] = right[rightCounter];
                rightCounter++;
            }
        }
        return tempArray;
    }
}
