package challenges.amazon_challenge.array;

import lombok.extern.slf4j.Slf4j;

import java.util.HashMap;
import java.util.Map;

@Slf4j
public class Sum {
    public static int[] twoSum(int[] nums, int target) {
        int [] sumArr = new int[2];
        Map<Integer,Integer> keepTrackSet = new HashMap<>();
        for(int counter =0; counter < nums.length; counter++){
            if(keepTrackSet.containsKey(nums[counter])){
                sumArr[0]= keepTrackSet.get(nums[counter]);
                sumArr[1]=counter;
                return sumArr;
            }
            keepTrackSet.put((target-nums[counter]),counter);
        }
        return sumArr;
    }
}
