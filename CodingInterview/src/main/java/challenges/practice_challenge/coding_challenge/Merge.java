package challenges.practice_challenge.coding_challenge;

import java.util.Arrays;

public class Merge {
    public static void main(String[] args) {
        int [] arr1 = {0,3};
        int [] arr2 = {4,6};
        System.out.println(Arrays.toString(Merge.twoArrays(arr1, arr2)));

    }

    public static Integer [] twoArrays(int [] arr1, int [] arr2){
        Integer [] tempArr = new Integer[(arr2.length+arr1.length)];
        int firstArray = 0;
        int secondArray = 0;
        int count = 0;
        while(firstArray < arr1.length && secondArray < arr2.length) {
            if (arr1[firstArray] < arr2[secondArray]) {
                tempArr[count] = arr1[firstArray++] ;
            } else {
                tempArr[count] = arr2[secondArray++];
            }
            count++;
        }
        while(firstArray < arr1.length) {
            tempArr[count] = arr1[firstArray++];
            count++;
        }

        while(secondArray < arr2.length) {
            tempArr[count] = arr2[secondArray++];
            count++;
        }
        return tempArr;
    }
}
