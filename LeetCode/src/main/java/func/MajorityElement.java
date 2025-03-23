package func;

import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class MajorityElement {
    public static int element(int[] nums) {
        Map<Integer, Long> freq =
                Arrays.stream(nums)
                        .boxed()
                        .collect(Collectors.groupingBy(Function.identity(),
                                Collectors.counting()));

        System.out.println(freq);
       Integer maxKey = Collections.max(freq.entrySet(), Map.Entry.comparingByValue()).getKey();
        System.out.println(maxKey);
        return maxKey;
    }

    public static int element2(int[] nums) {
        Integer key =0;
        Map<Integer, Integer> numsToMap = new HashMap<>();
        for(int num : nums){

            if(!numsToMap.containsKey(num)){
                numsToMap.put(num,0);
            }
            numsToMap.put(num, numsToMap.get(num)+1);
            if(key == 0){
                key = num;
            }else if(numsToMap.get(num) > numsToMap.get(key)) {
                key = num;
            }

        }
        return key;
    }
}
