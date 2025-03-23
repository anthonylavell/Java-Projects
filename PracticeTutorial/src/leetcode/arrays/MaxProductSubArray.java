/*Given an integer array nums, find a contiguous non-empty
 subarray within the array that has the largest product, and return the product.
 */
package leetcode.arrays;

public class MaxProductSubArray {
    public static void main(String[] args) {
        int [] nums = {2,3,-1,-4};
        int [] nums2 = {2,3,-2,4};
        int [] nums3 = {-2,0,-1};
        int [] nums4 = {-2};
        int [] nums5 = {2,-5,-2,-4,3};
        int [] nums6 = {2,-5,-2,-4,10};
        System.out.println(maxProduct(nums6));
    }

    public static int maxProduct(int[] nums) {
        int min = nums[0];
        int max = nums[0];
        int total = Integer.MIN_VALUE;
        for(int i = 1; i < nums.length; i++){
            if(total < max){
                total = max;
            }
            if(nums[i]== 0){
                max = 0;
                min = 0;
                continue;
            }
            int tempMax = max;
            max = Math.max(nums[i],(Math.max((tempMax*nums[i]),(min*nums[i]))));
            min = Math.min(nums[i],(Math.min((tempMax*nums[i]),(min*nums[i]))));
        }
        return (max > total) ? max :total;
    }
}
