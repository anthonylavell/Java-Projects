package comp_p.hubspot;

import java.util.Arrays;

public class MergeSortedArray {
    public static void main(String[] args) {
        int [] nums1 = {1,2,3,0,0,0};
        int m = 3;
        int [] nums2 = {2,5,6};
        int n = 3;
        merge(nums1,m,nums2,n);
        System.out.println(Arrays.toString(nums1));

    }
    public static void merge(int[] nums1, int leftLen , int[] nums2, int rightLen) {
        int len = (leftLen--) + (rightLen--);
        for (int count = len - 1; count >=0; count--)
            nums1[count] = (rightLen < 0 || leftLen >= 0 && nums1[leftLen] >= nums2[rightLen]) ? nums1[leftLen--] : nums2[rightLen--];
    }
}
