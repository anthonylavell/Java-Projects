package arraysandstrings.array;

public class FruitIntoBaskets {
    public static void main(String[] args) {
        int [] fruits = {1,2,3,2,2};
        totalFruit(fruits);

    }
    public static int totalFruit(int[] fruits) {
        int first = 1;
        int second = 0;
        int total = 0;
        int leftIndex =0;
        int prev = Integer.MIN_VALUE;
        for(int rightIndex = 1; rightIndex < fruits.length; rightIndex++){
            if(fruits[rightIndex-1] != fruits[rightIndex]){
                if(fruits[rightIndex] == prev) {
                    int temp = second;
                    second = first;
                    first = temp;
                }else {
                    total = Math.max(total, (first + second));
                    second = (rightIndex - leftIndex);
                    first = 0;
                }
                leftIndex = rightIndex;
                prev = fruits[rightIndex-1];
            }
            first++;
        }
        return Math.max(total, (first + second));
    }
}
