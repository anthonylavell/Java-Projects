package grinder.arrays;

public class MissingNumber {
    public static void main(String[] args) {
        int [] nums = {0,1};
        System.out.println(missingNumber(nums));
    }

    public static int missingNumber(int[] nums) {
        int currentIndex = 0;
        while (currentIndex < nums.length){
            if(nums[currentIndex]> -1 && nums[currentIndex] < nums.length-1 && nums[currentIndex] != currentIndex){
                int temp = nums[currentIndex];
                nums[currentIndex] = nums[temp];
                nums[temp] = temp;
            }else{
                currentIndex++;
            }
        }

        for(int index = 1; index < nums.length+1; index++){
            if(index > nums.length-1 || nums[index]!=index){
               return index;
            }
        }
        return -1;
    }

    public static int missingNumber2(int[] nums) {
        int[] resultArray = new int[nums.length+1];
        for (int num: nums){
            resultArray[num]++;
        }
        for (int index =0; index < resultArray.length; index++){
            if(resultArray[index] < 1){
                return index;
            }
        }
        return -1;
    }
}
