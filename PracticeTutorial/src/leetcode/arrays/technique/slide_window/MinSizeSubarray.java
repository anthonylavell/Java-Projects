package leetcode.arrays.technique.slide_window;

public class MinSizeSubarray {
    public static void main(String[] args) {
        int target = 7;
        int [] nums = {2,3,1,2,4,3};
        int target2 = 15;
        int [] nums2 = {1,2,3,4,5};
        System.out.println(minSubArrayLen(target2,nums2));
    }
    public static int minSubArrayLen(int target, int[] nums) {
        int sum = nums[0];
        int minNum = Integer.MAX_VALUE;
        int idleIndex = 0;
        int movingIndex = 0;
        while ((idleIndex < nums.length)) {
            if ((movingIndex >= nums.length - 1) && sum < target) {
                break;
            }
            if (sum >= target) {
                if (minNum > ((movingIndex - idleIndex) + 1)) {
                    minNum = (movingIndex - idleIndex) + 1;
                    if (minNum == 1) {
                        break;
                    }
                }
                sum -= nums[idleIndex];
                idleIndex++;
            } else {
                movingIndex++;
                sum += nums[movingIndex];
            }
        }
        return (minNum == Integer.MAX_VALUE) ? 0 : minNum;
    }

    public static int minSubArrayLen2(int target, int[] nums) {
        int sum =0;
        int minNum = Integer.MAX_VALUE;
        int idleIndex = 0;
        int movingIndex =0;
        while ((movingIndex < nums.length)){
            sum+=nums[movingIndex];
            while (sum >= target){
                if(minNum > ((movingIndex-idleIndex)+1)){
                    minNum = (movingIndex-idleIndex)+1;
                }
                sum-= nums[idleIndex];
                idleIndex++;
            }
            if(minNum==1){
                break;
            }
                movingIndex++;
        }
        return (minNum == Integer.MAX_VALUE) ? 0 : minNum;
    }
}
