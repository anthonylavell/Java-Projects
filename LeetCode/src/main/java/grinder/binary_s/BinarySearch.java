package grinder.binary_s;

public class BinarySearch {
    public static void main(String[] args) {

    }
    public static int search(int[] nums, int target) {
        int leftIndex = 0;
        int rightIndex = nums.length-1;
        while (leftIndex<=rightIndex){
            int mid = leftIndex+(rightIndex-leftIndex)/2;
            if(nums[mid] == target){
                return mid;
            } else if (nums[mid] < target) {
                leftIndex = mid +1;
            }else {
                rightIndex = mid -1;
            }
        }
        return -1;
    }
}
