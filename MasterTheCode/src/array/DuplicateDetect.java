package array;

public class DuplicateDetect {
    public static void main(String[] args) {
        //int [] nums = new int[] {1,1,1,3,3,4,3,2,4,2};
        //int [] nums = new int[] {1,2,4,4,5};
        int [] nums = new int[] {1,2,3,1,4};
        int [] nums2 = new int[] {1,2,3,1};
        int [] nums3 = new int[] {1000000000,1000000000,11};
        System.out.println(containsDuplicate(nums3));

    }
    public static boolean containsDuplicate(int[] nums) {
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;

        for(int num : nums) {
            if(num < min) {
                min = num;
            }
            if(num > max) {
                max = num;
            }
        }
        boolean [] visited = new boolean[max-min+1];
        for(int i = 0; i < nums.length; i++){
            int index = nums[i] - min;
            if(visited[index] == true){
                return true;
            }
            visited[index] = true;
        }
            return false;
        }

}
