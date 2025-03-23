package code_patterns.fastandslowpointers;

public class RemoveDuplicatesFromSortedArray {
    public static void main(String[] args) {
        int [] nums = {0,0,1,1,1,2,2,3,3,4};
        System.out.println(removeDuplicates(nums));
    }
    public static int removeDuplicates(int[] nums) {
        int leftIndex = 0;
        for(int rightIndex = 1; rightIndex < nums.length; rightIndex++){
            if(nums[leftIndex] != nums[rightIndex]){
                nums[++leftIndex]= nums[rightIndex];
            }
        }
        return leftIndex+1;
    }
}
