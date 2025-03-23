package arraysandstrings.array.client;

import java.util.HashMap;
import java.util.Map;

public class TestSum {
    public static void main(String[] args) {
       int [] arrOfNums = {2,7,11,15};
        int [] arrOfNums2 = {4,5,6,15,25,30};
        Map<Integer,Integer> hashMap = new HashMap<>();
        hashMap.put(1,10);
        hashMap.put(2,5);
        hashMap.put(3,6);
        System.out.println(hashMap.get(3));
        hashMap.put(3,15);
        System.out.println(hashMap.get(3));
        /*Sum sum = new Sum();
        System.out.println(sum.threeSum(arrOfNums));*/
        //System.out.println(Arrays.toString(Sum.twoSum(arrOfNums,9)));
    }
}
