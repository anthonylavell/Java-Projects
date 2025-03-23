package disney;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ThreeSums {
    public static void main(String[] args) {
        int[] nums = {-1,0,1,2,-1,-4};
        int[] nums2 = {0,0,0};
        int[] nums3 = {-1,0,1,2,-1,-4,-2,-3,3,0,4};
        List<List<Integer>> listOfIntegers = threeSum(nums3);
        System.out.println(listOfIntegers);
    }

    public static List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> listOfIntegers = new ArrayList<>();
        Arrays.sort(nums);
        for(int i = 0; i < nums.length-1; i++){
            if(i == 0 || nums[i]!=nums[(i-1)]) {
                int left = i + 1;
                int right = nums.length - 1;
                while (left < right && nums[right] > -1) {
                    int sum = nums[i] + nums[left] + nums[right];
                    if (sum > 0) {
                        right--;
                    } else if (sum < 0) {
                        left++;
                    } else {
                        listOfIntegers.add(Arrays.asList(nums[i], nums[left++], nums[right--]));
                        while (left < right && nums[left] == nums[left - 1]) {
                            left++;
                        }
                    }
                }
            }
        }
        int i = 0;
        return listOfIntegers;

    }
}
