package arraysandstrings.array;

public class MissingNumber {
    public static void main(String[] args) {
        int [] nums = {9,6,4,2,3,5,7,0,1};
        missingNumber(nums);

    }
    public static int missingNumber(int[] nums) {
        int missingNum = nums.length;
        int counter = 0;
        while (counter < nums.length ){
            if(nums[counter] < nums.length && counter != nums[counter]){
                int swapNum = nums[counter];
                nums[counter] = nums[swapNum];
                nums[swapNum] = swapNum;
                continue;
            }
            counter++;
        }
        for(int i = 0; i < nums.length+1; i++){
            if(i > nums.length-1 || i != nums[i]){
                missingNum = i;
                break;
            }
        }
        return missingNum;
    }
}
