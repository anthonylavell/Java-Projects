package grinder.arrays;

public class SearchInRotatedSortedArray {
    public static void main(String[] args) {
        int [] nums = {6,7,1,2,3,4,5};
        int target = 6;
        System.out.println(search(nums,target));
    }
    public static int search(int[] nums, int target) {
        int left = 0;
        int right = nums.length-1;
        while (left <= right){
            int mid = left + (right-left)/2;
            if (nums[mid] == target){
                return mid;
            }else if (target > nums[mid]){
                if (target > nums[right] &&  nums[mid] < nums[left]){
                    right = mid -1;
                } else {
                    left = mid +1;
                }
            } else{
                if (target <= nums[right] && nums[mid] > nums[right]){
                    left = mid +1;
                }else {
                    right = mid - 1;
                }
            }
        }
        return -1;
    }
}
