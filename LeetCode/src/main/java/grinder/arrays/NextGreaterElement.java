package grinder.arrays;

import java.util.Arrays;

public class NextGreaterElement {
    public static void main(String[] args) {
        int [] nums1 = {4,1,2};
        int[] nums2 = {1,3,4,2};
        System.out.println(Arrays.toString(nextGreaterElement(nums1,nums2)));
    }

    public static int[] nextGreaterElement(int[] nums1, int[] nums2) {
        int [] mapOfIndex = new int[10001];
        int[] greaterArray = new int[nums1.length];
        for(int index = 0; index < nums2.length; index++){
            mapOfIndex[nums2[index]] = index;
        }
        for (int count = 0; count < nums1.length; count++){
            int num = nums1[count];
            int index = mapOfIndex[num];
            int tempNum = -1;
            while (++index < nums2.length){
                if(num < nums2[index]){
                    tempNum = nums2[index];
                    break;
                }
            }
            greaterArray[count] = tempNum;
        }
        return greaterArray;
    }
}
