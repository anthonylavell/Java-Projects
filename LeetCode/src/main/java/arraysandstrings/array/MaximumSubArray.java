/*
Given an integer array nums, find the subarray with the largest sum,
and return its sum.
Example 1:

Input: nums = [-2,1,-3,4,-1,2,1,-5,4]
Output: 6
Explanation: The subarray [4,-1,2,1] has the largest sum 6.
Example 2:

Input: nums = [1]
Output: 1
Explanation: The subarray [1] has the largest sum 1.
Example 3:

Input: nums = [5,4,-1,7,8]
Output: 23
Explanation: The subarray [5,4,-1,7,8] has the largest sum 23.

Constraints:
1 <= nums.length <= 105
-104 <= nums[i] <= 104


Follow up: If you have figured out the O(n) solution, try coding another
solution using the divide and conquer approach, which is more subtle.
 */
package arraysandstrings.array;

public class MaximumSubArray {
    public static int maxSubArray(int[] nums) {
        int total = nums[0];
        int subTotal = nums[0];
        for (int right = 1; right < nums.length; right++){
            if (subTotal+nums[right] < 0 || subTotal+nums[right] < nums[right]){
                subTotal = 0;
            }
            subTotal+=nums[right];
            total = Math.max(total,subTotal);
        }

        return total;
    }

    public static void main(String[] args) {

    }
}
