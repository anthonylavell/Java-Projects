package arraysandstrings.array;

public class MaxConsecutiveOnesIII {
    public static void main(String[] args) {

    }

    public static int longestOnes(int[] nums, int k) {
        int left = 0;
        int right = 0;
        int[] keepTrack = new int[2];
        int total = 0;
        while (right < nums.length){
            int rightNum = nums[right];
            if(rightNum == 1){
                keepTrack[1]++;
            }
            while (((right-left) +1 -  keepTrack[1]) > k){
                int leftNum = nums[left];
                if(leftNum == 1){
                    keepTrack[1]--;
                }
                left++;
            }
            total = Math.max(total,(right-left)+1);
            right++;
        }
        return total;
    }
}
