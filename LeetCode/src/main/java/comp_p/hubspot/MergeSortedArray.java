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
    public static void merge(int[] nums1, int m , int[] nums2, int n) {
        m--;
        n--;
        for (int index = nums1.length-1; index >=0; index--){
            nums1[index] =(n < 0) || (m >= 0 && nums1[m] > nums2[n])
                    ? nums1[m--] : nums2[n--];
        }
    }
}
