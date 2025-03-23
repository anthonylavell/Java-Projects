package array;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class IntersectionOfTwoArrays {
    public static void main(String[] args) {
        //int [] nums1 = {4,9,5};
        //int [] nums1 = {1,2,2,1}; //[1,2,2,1]

        //int [] nums2 = new int [] {9,4,9,8,4};
        //int [] nums2 = new int [] {2,2};//[2,2]


        int [] nums1 = {4,3,9,3,1,9,7,6,9,7}; //[4,3,9,3,1,9,7,6,9,7]

        int [] nums2 = new int [] {5,0,8};//[5,0,8]

        System.out.println(Arrays.toString(intersect(nums1,nums2)));

    }
    public static int[] intersect(int[] nums1, int[] nums2) {
        if (nums1.length < nums2.length){
            return helpIntersect(nums1,nums2);
        }else{
            return helpIntersect(nums2,nums1);
        }

    }

    private static int [] helpIntersect(int[] nums1, int[] nums2 ) {
        int [] totalArr = new int [0];

        Map<Integer, Integer> mapOfNumbers = new HashMap<>();
        for(int num : nums1){
            if(!mapOfNumbers.containsKey(num)){
                mapOfNumbers.put(num,0);
            }
            mapOfNumbers.put(num, mapOfNumbers.get(num)+1);
        }
        for(int num : nums2){
            if(mapOfNumbers.containsKey(num) && mapOfNumbers.get(num) > 0){
                mapOfNumbers.put(num,mapOfNumbers.get(num)-1);
                    int[] copy = Arrays.copyOf(totalArr, (totalArr.length+1));
                    copy[totalArr.length] = num;
                    totalArr= copy;


            }
        }
        return totalArr;
    }


}
