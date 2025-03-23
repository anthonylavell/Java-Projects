package sort;

import java.util.Arrays;

public class SelectionSort {
    public static void main(String[] args) {
        int [] intArr = {8,5,3,2,0,4};
        //Arrays.stream(activate(intArr)).forEach(System.out::println);
        System.out.println("Arrays.toString(newArr) = " + Arrays.toString(activate(intArr)));
    }
    public static int [] activate(int [] numArr){
        for(int i = 0; i < numArr.length-1; i++){
            int smallestNumberPos = i;
            for(int x = i+1; x < numArr.length; x++){
                if(numArr[smallestNumberPos] > numArr[x]){
                    smallestNumberPos = x;
                }

            }
            //if(numArr[smallestNumberPos]!= numArr[i]){
                int tempNum = numArr[i];
                numArr[i] = numArr[smallestNumberPos];
                numArr[smallestNumberPos] = tempNum;
           // }
        }
        return numArr;

    }
}
