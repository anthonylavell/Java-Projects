package sort;

import java.util.Arrays;

public class InsertionSort {
    public static void main(String[] args) {
        int [] intArr = {8,5,3,2,0,4};
        //Arrays.stream(activate(intArr)).forEach(System.out::println);
        System.out.println("Arrays.toString(newArr) = " + Arrays.toString(activate(intArr)));
    }
    public static int [] activate(int [] numArr){
        for(int i = 0; i < numArr.length-1; i++){
                for (int x = i; x >= 0; x--) {
                    if(numArr[x] <= numArr[(x+1)]) {
                        break;
                    }
                    int tempNum = numArr[(x + 1)];
                    numArr[(x + 1)] = numArr[x];
                    numArr[x] = tempNum;

            }
        }
        return numArr;

    }
}
