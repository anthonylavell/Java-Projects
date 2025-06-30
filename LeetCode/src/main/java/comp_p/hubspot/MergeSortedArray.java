package comp_p.hubspot;

public class MergeSortedArray {
    public static void main(String[] args) {
        int [] nums1 = {1,2,3,0,0,0};
        int m = 3;
        int [] nums2 = {2,5,6};
        int n = 3;
        merge(nums1,m,nums2,n);

    }
    public static void merge(int[] nums1, int leftLen , int[] nums2, int rightLen) {
        int count = nums1.length-1;
        leftLen--;
        rightLen--;
        while (leftLen >=0 || rightLen >=0){
            if (leftLen < 0 || ((rightLen >= 0) && nums2[rightLen] >= nums1[leftLen] )){
                nums1[count--] = nums2[rightLen--];
            }else {
                nums1[count--] = nums1[leftLen--];
            }
        }
    }
}
