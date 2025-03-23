package sort;

import java.util.Arrays;

public class BubbleSort {
    public static void main(String[] args) {
        int [] intArr = {1,2,4,3};
        //Arrays.stream(activate(intArr)).forEach(System.out::println);
        System.out.println("Arrays.toString(newArr) = " + Arrays.toString(activate(intArr)));

    }
    public static int[] activate(int [] intArr){
        for(int i =0; i < intArr.length; i++){
            for (int x = 0; x < intArr.length-(i+1); x++){
                if(intArr[x]>intArr[x+1]){
                    int tempNum = intArr[x+1];
                    intArr[x+1]= intArr[x];
                    intArr[x] = tempNum;
                }
            }
        }
        return intArr;
    }
}
