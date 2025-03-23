package arraysandstrings.array;

public class SearchRotatedSortedArray {
    public static void main(String[] args) {
        //int[] nums = {2,3,4,5,6,7,8,9,1};
        //int[] nums = {1};
        //int[] nums = {4,5,6,7,8,1,2,3};
        int[] nums = {2,3,4,5,6,7,8,9,1};
        int target = 9; // 1 8 0 4 9
        search(nums,target);
    }
    public static int search(int[] nums, int target) {
        int start = 0;
        int end =  nums.length-1;
        int found = (foundSearch(start,end,nums,target));
        return found;
    }
    private static int foundSearch(int start, int end, int[] nums, int target){
        while (start <= end){
            int midIndex = start + (end-start)/2;
            if(nums[midIndex]==target){
                return midIndex;
            }else if(nums[start]<= nums[midIndex]){
                if(target>=nums[start] && target<=nums[midIndex]){
                    end = midIndex-1;
                }else {
                    start = midIndex+1;
                }
            }else {
                if(target <= nums[end] && target >= nums[midIndex]){
                    start = midIndex +1;
                }else {
                    end = midIndex - 1;
                }
            }
        }
        return -1;
    }
}
