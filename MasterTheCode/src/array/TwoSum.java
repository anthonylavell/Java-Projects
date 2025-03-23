package array;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class TwoSum {
    public static void main(String[] args) {
        //int [] numbers = new int[] {2,7,11,15};
        int [] numbers = new int[]{3,2,4};
        int target = 6;
        //System.out.println(Arrays.toString(twoSum(numbers,target)));
        System.out.println(Arrays.toString(twoSumUnSort(numbers,target)));
    }
    public static int[] twoSum(int[] numbers, int target) {
        int endIndex = numbers.length-1;
        int startIndex = 0;
        while (startIndex <= endIndex) {
        if((target-numbers[startIndex]) == numbers[endIndex]){
            return new int[]{startIndex+1,endIndex+1};
        }else if((target-numbers[startIndex])> numbers[endIndex]){
                startIndex++;
        }else {
            endIndex--;
        }

        }
        return null;
    }
    public static int[] twoSumUnSort(int[] numbers, int target) {
        Map<Integer,Integer>mapOfIntegers = new HashMap<>();
        for(int i = 0; i < numbers.length; i++){
            if(mapOfIntegers.containsKey(target-numbers[i])){
                return new int[]{mapOfIntegers.get((target-numbers[i])),i};
            }
            mapOfIntegers.put(numbers[i],i);
        }

        return null;
    }
}
