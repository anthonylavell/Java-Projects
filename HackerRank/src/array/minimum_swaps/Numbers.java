package array.minimum_swaps;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class Numbers {
    // Complete the minimumSwaps function below.
    static int minimumSwaps(int[] arr) {
        int result = 0;
        Map<Integer, Integer> mapOfSortedArrays= new HashMap<>();
        int[] tempArr = Arrays.stream(arr).sorted().toArray();
        for(int count = 0; count < arr.length; count++){
            mapOfSortedArrays.put(arr[count], count);
        }
        for(int count = 0; count < arr.length-1; count++){
            if(arr[count]!= tempArr[count]){
                int temp = arr[count];
                int index1 = mapOfSortedArrays.get(arr[count]);
                int index2 = mapOfSortedArrays.get(tempArr[count]);
                mapOfSortedArrays.put(tempArr[count],index1);
                mapOfSortedArrays.put(arr[count],index2);
                arr[count] = tempArr[count];
                arr[index2] = temp;
                result++;
            }
        }

        return result;
    }
}
