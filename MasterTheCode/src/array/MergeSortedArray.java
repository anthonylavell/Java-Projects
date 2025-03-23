package array;

import java.util.Arrays;

public class MergeSortedArray {
    public static void main(String[] args) {
        /*int numArr [] = {0,2,4};
        int numArr2 [] = {1};

        System.out.println(Arrays.toString(mergeArray(numArr,numArr2)));*/
        int num1 [] = {0};
        int m = 0;
        int num2 [] = {1,2,3};
        int n = 1;
        System.out.println(Arrays.toString(num1));
        merge(num1,m,num2,n);
        System.out.println("Num1: "+Arrays.toString(num1));
    }
    public static int [] mergeArray(int numArr[], int numArr2[]){
        if(numArr.length<1){
            return numArr2;
        }else if(numArr2.length<2){
            return numArr;
        }
        int numArrCount = 0;
        int numArr2Count = 0;
        int totalNumArr [] = new int[numArr.length+numArr2.length];
        for(int i =0; i < totalNumArr.length; i++){
            if(numArrCount > numArr.length-1){
                totalNumArr[i] = numArr2[numArr2Count];
                numArr2Count++;
            }else if(numArr2Count > numArr2.length-1){
                totalNumArr[i] = numArr[numArrCount];
                numArrCount++;
            }else if(numArr[numArrCount] < numArr2[numArr2Count]){
                totalNumArr[i] = numArr[numArrCount];
                numArrCount++;
            }else {
                totalNumArr[i] = numArr2[numArr2Count];
                numArr2Count++;
            }
        }
        return totalNumArr;
    }
    public static void merge(int[] nums1, int m, int[] nums2, int n) {
        if(nums2.length<1){
            return;
        }
        int [] tempArray = new int[m+n];
        int firstArrayCont = 0;
        int secondArrayCont = 0;

        for(int i = 0; i < tempArray.length; i++){
            if( firstArrayCont>=m){
                tempArray[i] = nums2[secondArrayCont];
                secondArrayCont++;
            }else if( secondArrayCont>=n){
                tempArray[i] = nums1[firstArrayCont];
                firstArrayCont++;
            }else if( nums2[secondArrayCont]<nums1[firstArrayCont] ){
                tempArray[i] = nums2[secondArrayCont];
                secondArrayCont++;

            }else {
                tempArray[i] = nums1[firstArrayCont];
                firstArrayCont++;
            }
        }
        System.arraycopy(tempArray,0,nums1,0,tempArray.length);
    }
}
