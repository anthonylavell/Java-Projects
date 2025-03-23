package code_patterns.fastandslowpointers;

import java.util.HashMap;
import java.util.Map;

public class TwoSum {
    public int[] twoSum(int[] numbers, int target) {
        Map<Integer,Integer>hMap = new HashMap<>();
        for(int index = 0; index < numbers.length; index++){
            int key = target - numbers[index];
            if(hMap.containsKey(key)){
                return new int[] {hMap.get(key),index+1};
            }
            hMap.put(numbers[index],index+1);
        }
        return null;
    }
}
