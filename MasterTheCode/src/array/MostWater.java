package array;

public class MostWater {
    public static void main(String[] args) {
        int [] height = {1,8,6,2,5,4,8,3,7};//[1,8,6,2,5,4,8,3,7] {3,4,3} [4,3,2,1,4] {1,2}
        System.out.println("area = " + getContain(height));
    }
    public static int getContain(int [] height){
        int leftIndex = 0;
        int rightIndex = height.length-1;
        int area =0;
        while (leftIndex< rightIndex){
            if(height[leftIndex] == 0){
                leftIndex++;
            }
            if(height[rightIndex] == 0){
                rightIndex--;
            }
            int tempNum = Math.min(height[leftIndex], height[rightIndex]) * (rightIndex-leftIndex);
            if(tempNum>area){
                area = tempNum;
            }
            if(height[leftIndex]<height[rightIndex]){
                leftIndex++;
            }else {
                rightIndex--;
            }
        }
       return area;
    }
}
