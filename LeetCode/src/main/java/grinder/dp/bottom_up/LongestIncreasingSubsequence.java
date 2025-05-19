/*
Given an integer array nums, return the length of the longest strictly increasing subsequence.



Example 1:

Input: nums = [10,9,2,5,3,7,101,18]
Output: 4
Explanation: The longest increasing subsequence is [2,3,7,101], therefore the length is 4.
Example 2:

Input: nums = [0,1,0,3,2,3]
Output: 4
Example 3:

Input: nums = [7,7,7,7,7,7,7]
Output: 1
 */
package grinder.dp.bottom_up;

import java.util.*;

public class LongestIncreasingSubsequence {
    public static void main(String[] args) {
        int [] numbers = {1,3,6,7,9,4,10,5,6};
        System.out.println(lengthOfLIS(numbers));
        Set<Integer> obstacles = new TreeSet<>();

    }
    public static int lengthOfLIS(int[] nums) {
        int total = 0;
        int maxVal = Integer.MAX_VALUE;
        int [] dp = new int[nums.length+1];
        Arrays.fill(dp,maxVal);
        dp[0] = -maxVal;
        for (int num : nums) {
            for (int col = 1; col < dp.length; col++) {
                if (dp[col - 1] < num && num < dp[col]) {
                    dp[col] = num;
                }
            }
        }
        for (int index = 0; index < dp.length; index++){
            if (dp[index] < maxVal )
                total = index;
        }
        return total;
    }

    public static int upperBound(int[] dp, int target) {
        int n = dp.length;
        int lo = 0, hi = n;
        while (lo < hi) {
            int mid = lo + (hi - lo) / 2;
            if (dp[mid] > target) {
                hi = mid;
            } else {
                lo = mid + 1;
            }
        }
        return lo;
    }

    public static int lengthOfLIS2(int[] nums) {
        Map<Integer,Integer> map = new HashMap<>();
        int highest = 0;
        for (int num : nums) {
            if (!map.containsKey(num)) {
                map.put(num, 1);
            }
            for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
                if (num > entry.getKey()) {
                    int temp = entry.getValue() + 1;
                    if (map.get(num) < temp) {
                        map.put(num, temp);
                    }
                }
            }
            highest = Math.max(map.get(num), highest);
        }
        return highest;
    }
}
