package leetcode.arrays;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class TwoArrays {
    public static void main(String[] args) {
        int [] nums1 = {1,2,2,1};
        int [] nums2 = {2,2};

        int [] nums5 = {4,9,5};
        int [] nums6 = {9,4,9,8,4};
        int [] resultArray = intersect(nums5,nums6);
        System.out.println("resultArray = " + Arrays.toString(resultArray));
    }
    public static int[] intersect(int[] nums1, int[] nums2) {
        int [] resultArray = new int[0];
        Map<Integer,Integer> mapOfIntegers = new HashMap<>();
        for(int num: nums1){
            if(!mapOfIntegers.containsKey(num)){
                mapOfIntegers.put(num,0);
            }
            mapOfIntegers.put(num,(mapOfIntegers.get(num)+1));
        }
        for(int num : nums2){
            if(mapOfIntegers.containsKey(num) && mapOfIntegers.get(num) > 0){
                resultArray = Arrays.copyOf(resultArray,(resultArray.length+1));
                resultArray[resultArray.length-1] = num;
                mapOfIntegers.put(num,(mapOfIntegers.get(num)-1));
            }
        }

        return resultArray;

    }
}
