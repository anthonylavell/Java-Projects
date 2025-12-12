package grinder.arrays.two_pointer;

import grinder.json.ThreeSumJson;
import org.json.JSONArray;
import org.json.JSONObject;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ThreeSum {
    public static List<List<Integer>> threeSum(int[] nums) {
        Arrays.sort(nums);
        List<List<Integer>> sum = new ArrayList<>();
        for (int index = 0; index < nums.length; index++){
            if (index==0 || nums[index] != nums[index-1]) {
                int left = index + 1;
                int right = nums.length - 1;
                while (left < right) {
                    int subTotal = nums[index] + nums[left] + nums[right];
                    if (subTotal < 0 ) {
                        left++;
                    } else {
                        if (subTotal == 0) {
                            sum.add(Arrays.asList(nums[index], nums[left], nums[right]));
                            while (left < right && nums[++left] == nums[left - 1]) { }
                        }
                        right--;
                    }
                }
            }
        }
        return sum;
    }

    public static void main(String[] args) {
        JSONObject jsonObject = new JSONObject(ThreeSumJson.getLeetCode());
        JSONObject leetCode = jsonObject.getJSONObject("data");
        JSONArray jsonArray = leetCode.getJSONArray("nums");
        int[] nums = new int[jsonArray.length()];
        for (int index = 0; index < nums.length; index++){
            nums[index] = jsonArray.getInt(index);
        }
        System.out.println(threeSum(nums));
    }
}
