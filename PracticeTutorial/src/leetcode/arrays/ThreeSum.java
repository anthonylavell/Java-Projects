package leetcode.arrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ThreeSum {
    public static void main(String[] args) {
        int [] nums = {-1,0,1,2,-1,-4};
        int [] nums2 = {-1,0,1,2,-1,-4,-2};
        int [] nums3 = {0,1,1};
        int [] nums4 = {0,0,0,0};
        int [] nums5 = {-2,0,1,1,2};
        //System.out.println(nums[5]+nums[4]);
        System.out.println(threeSum(nums5));
    }

    public static List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> listOfIntegers = new ArrayList<>();
        Arrays.sort(nums);
        int i = 0;
        int j = i + 1;
        int k = nums.length - 1;
        while (i < nums.length - 2) {
            if(nums[i] > 0 || nums[nums.length-1] < 0){
                break;
            }
            if (j >= k) {
                i++;
                if (nums[i] == nums[i - 1]) {
                    continue;
                }
                j = i + 1;
                k = nums.length - 1;
            } else if ((nums[i] + nums[j] + nums[k]) == 0) {
                List<Integer> tempList = new ArrayList<>(Arrays.asList(nums[i], nums[j], nums[k]));
                    listOfIntegers.add(tempList);
                j++;
                while (j<k && nums[j]==nums[j-1]){
                    j++;
                }
                k--;
                while (j<k && nums[k]==nums[k+1]){
                    k--;
                }

            } else if ((nums[i] + nums[j] + nums[k]) > 0) {
                k--;
                while (j<k && nums[k]==nums[k+1]){
                    k--;
                }
            } else {
                j++;
                while (j<k && nums[j]==nums[j-1]){
                    j++;
                }
            }

        }
        return listOfIntegers;
    }
}
