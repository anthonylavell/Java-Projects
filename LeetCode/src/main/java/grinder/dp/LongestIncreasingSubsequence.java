package grinder.dp;

import java.util.*;

public class LongestIncreasingSubsequence {
    public static void main(String[] args) {
        int [] numbers = {1,3,6,7,9,4,10,5,6};
        System.out.println(lengthOfLIS(numbers));
        Set<Integer> obstacles = new TreeSet<>();

    }
    public static int lengthOfLIS(int[] nums) {
        int n = nums.length;
        int[] dp = new int[n + 1];
        Arrays.fill(dp, Integer.MAX_VALUE);
        dp[0] = Integer.MIN_VALUE;

        for (int i = 0; i < n; i++) {
            int j = upperBound(dp, nums[i]);
            if (dp[j - 1] < nums[i] && nums[i] < dp[j]) {
                dp[j] = nums[i];
            }
        }

        int ans = 0;
        for (int i = 0; i <= n; i++) {
            if (dp[i] < Integer.MAX_VALUE) {
                ans = i;
            }
        }
        return ans;
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
