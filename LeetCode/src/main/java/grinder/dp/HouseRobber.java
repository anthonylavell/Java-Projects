package grinder.dp;
/*
You are a professional robber planning to rob houses along a street.
Each house has a certain amount of money stashed, the only constraint
stopping you from robbing each of them is that adjacent houses have
security systems connected and it will automatically contact the police
if two adjacent houses were broken into on the same night.

Given an integer array nums representing the amount of money of each house,
return the maximum amount of money you can rob tonight without alerting the police.

Example 1:

Input: nums = [1,2,3,1]
Output: 4
Explanation: Rob house 1 (money = 1) and then rob house 3 (money = 3).
Total amount you can rob = 1 + 3 = 4.
Example 2:

Input: nums = [2,7,9,3,1]
Output: 12
Explanation: Rob house 1 (money = 2), rob house 3 (money = 9) and rob house 5 (money = 1).
Total amount you can rob = 2 + 9 + 1 = 12.

Constraints:

1 <= nums.length <= 100
0 <= nums[i] <= 400
 */

public class HouseRobber {
    public static int rob(int[] nums) {
        int [] money = new int[nums.length];
        int rightIdx = 2;
        int max = 0;
        for (int leftIdx = 0; leftIdx < nums.length; leftIdx++ ){
            int num = Math.max(nums[leftIdx],money[leftIdx]);
            money[leftIdx] = num;
            if (rightIdx < nums.length){
                money[rightIdx] = Math.max(money[rightIdx],nums[rightIdx] + num);
            }

            if (rightIdx +1 < nums.length){
                money[rightIdx +1] = Math.max(money[rightIdx+1],nums[rightIdx +1] + num);
            }
            rightIdx = (rightIdx < nums.length) ? rightIdx+1 : rightIdx;
            max = Math.max(max, money[leftIdx]);
        }
        return max;
    }


    public static void main(String[] args) {
        //int [] nums = {2,7,2,2,10};
        int [] nums = {1,1};
        System.out.println(rob(nums));
    }
}
