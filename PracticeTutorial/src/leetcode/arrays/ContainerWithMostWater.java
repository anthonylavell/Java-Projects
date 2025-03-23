package leetcode.arrays;

public class ContainerWithMostWater {
    public static void main(String[] args) {
        int [] height = {1, 8, 6, 2, 5, 4, 8, 3, 7};
        int [] height2 = {1, 1};
        System.out.println(maxArea(height2));
    }
    public static int maxArea(int[] height) {
        int total = 0;
        int startIndex = 0;
        int endIndex = height.length-1;
        while (startIndex<endIndex){
            int tempNum = (height[startIndex]<height[endIndex])?height[startIndex] : height[endIndex];
            int index = endIndex-startIndex;
            if(total<(index*tempNum)){
                total = (index*tempNum);
            }
            if(height[startIndex]<height[endIndex]){
                startIndex++;
            }else {
                endIndex--;
            }
        }
        return total;
    }
}
