package arraysandstrings.array;

public class Triplet {
    public boolean increasingTriplet(int[] nums) {
        if(nums.length > 2) {
            int minVal = Integer.MAX_VALUE;
            int maxVal = Integer.MAX_VALUE;
            for (int counter = 0; counter < nums.length; counter++) {
                if (minVal >= nums[counter]) {
                    minVal = nums[counter];
                } else if (maxVal >= nums[counter]) {
                    maxVal = nums[counter];
                } else {
                    return true;
                }

            }
        }
        return false;
    }
}
