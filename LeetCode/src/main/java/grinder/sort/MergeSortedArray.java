package grinder.sort;

import java.util.Arrays;

public class MergeSortedArray {
    public static void main(String[] args) {
        int [] nums1 = {1,2,3,0,0,0};
        int m = 3;
        int [] nums2 = {2,5,6};
        int n = 3;
        merge(nums1,m,nums2,n);

    }
    public static void merge(int[] nums1, int leftLen , int[] nums2, int rightLen) {
        int[] tempArr = Arrays.copyOfRange(nums1,0,leftLen);
        int count = 0;
        int rightCount = 0;
        int leftCount = 0;
        while (leftCount < leftLen  || rightCount < rightLen){
            if (rightCount >= rightLen || (leftCount < leftLen) && tempArr[leftCount] < nums2[rightCount]){
                nums1[count++] = tempArr[leftCount++];
            }else {
                nums1[count++] = nums2[rightCount++];
            }
        }
        int i = 0;
    }
}
