package code_patterns.fastandslowpointers;

public class ContainerWithMostWater {
    public static void main(String[] args) {
        int [] height = {1,8,6,2,5,4,7,3,2};
        System.out.println(height);
    }

    public static int maxArea(int[] height) {
        int leftIndex = 0;
        int rightIndex = height.length -1;
        int total = Integer.MIN_VALUE;
        while (leftIndex < rightIndex){
            int tempNum = 0;
            int range = (rightIndex - leftIndex);
            if(height[leftIndex]< height[rightIndex]) {
                tempNum = height[leftIndex];
                leftIndex++;
            }else {
                tempNum = height[rightIndex];
                rightIndex--;
            }
            tempNum *= range;
            if(total < tempNum){
                total = tempNum;
            }
        }
        return total;
    }
}
