package code_patterns.fastandslowpointers;

public class MoveZeroes {
    public static void main(String[] args) {
        int [] nums = {73348,66106,-85359,53996,18849,-6590,-53381,-86613,-41065,83457,0};
        moveZeroes(nums);
    }
    public static void moveZeroes(int[] nums) {
        int leftIndex = 0;
        for (int rightIndex = 0; rightIndex < nums.length; rightIndex++){
            if(nums[rightIndex] != 0){
                if(nums[leftIndex] == 0){
                    nums[leftIndex] = nums[rightIndex];
                    nums[rightIndex] = 0;
                }
                leftIndex++;
            }
        }
    }
}
