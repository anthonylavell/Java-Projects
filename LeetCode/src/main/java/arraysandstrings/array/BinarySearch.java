package arraysandstrings.array;

public class BinarySearch {
    public static void main(String[] args) {
        int [] nums = {-1,0,3,5,9,12};
        int target = 9;
        System.out.println(search(nums,target));
    }

    public static int search(int[] nums, int target) {
        int leftIndex = 0;
        int rightIndex = nums.length-1;
        while (leftIndex<=rightIndex){
            int midIndex = (leftIndex+rightIndex)/2;
            if(nums[midIndex] == target){
                return midIndex;
            } else if (nums[midIndex] < target) {
                leftIndex = midIndex +1;
            }else {
                rightIndex = midIndex-1;
            }
        }

        return -1;
    }
    /*public static int search(int[] nums, int target) {
        int leftIndex = 0;
        int rightIndex = nums.length-1;
        int foundIndex = -1;
        while (leftIndex <= rightIndex){
            int middleIndex = (rightIndex+leftIndex)/2;
            if(nums[middleIndex] == target){
                foundIndex = middleIndex;
                break;
            } else if (nums[middleIndex] > target) {
                rightIndex = middleIndex-1;
            }else {
                leftIndex = middleIndex +1;
            }

        }
        return foundIndex;
    }*/
}
