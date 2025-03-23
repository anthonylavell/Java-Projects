package arraysandstrings.array;

public class ContainerWithMostWater {
    public static void main(String[] args) {

    }
    public static int maxArea(int[] height) {
        int max = 0;
        int left = 0;
        int right = height.length-1;
        while (left < right){
            int min = Math.min(height[left], height[right]);
            max = Math.max(max,min * (right-left));
            if(min == height[left]){
                left++;
            }else {
                right--;
            }
        }
        return max;
    }
}
