package code_patterns.binaryS;

public class FindMinimumInRotatedSortedArray {
    public static int findMinRotated(int[] nums) {
        int foundIndex = Integer.MAX_VALUE;
        int leftIndx = 0;
        int rightIndx = nums.length - 1;
        while (leftIndx <= rightIndx) {
            int mid = (leftIndx + rightIndx) / 2;
            int temp = nums[mid];
            if (leftIndx == rightIndx || temp <= nums[rightIndx] && temp <= nums[leftIndx]) {
                if(temp < foundIndex)
                    foundIndex = temp;
            }

            if (temp < nums[rightIndx]){
                rightIndx = mid - 1;
            }else {
                leftIndx = mid +1;
            }
        }
        return foundIndex;
    }
}
