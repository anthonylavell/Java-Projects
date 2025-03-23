package code.pattern.sort;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class AscendingOrder {
    public static void main(String[] args) {
        /*List<Integer> unsortedList = new ArrayList<>(Arrays.asList(8, 10,1, 3, 4, 6, 9, 2, 7, 5));
        //List<Integer> unsortedList = new ArrayList<>(Arrays.asList(8, 1,5));
        List<Integer> sortedList = sortList(unsortedList);
        System.out.println(sortedList);
        System.out.println(unsortedList.subList(0,0).size());*/

        int [] nums = {5,2,3,1};
        getAscendingOrder3(nums,0, nums.length);
    }

    public static List<Integer> sortList(List<Integer> unsortedList) {
        return getAscendingOrder(unsortedList,0,unsortedList.size()) ;
    }

    private static List<Integer> getAscendingOrder(List<Integer> numbers,int start, int end) {
        int length = numbers.subList(start,end).size();
        if (length <= 1) {
            return numbers.subList(start,end);
        }
        int mid = (end+start)/2;
        List<Integer> leftArray = getAscendingOrder(numbers,start,mid);
        List<Integer> rightArray = getAscendingOrder(numbers,mid,end);
        int leftIndex = 0;
        int rightIndex = 0;

        List<Integer> tempNum = new ArrayList<>();
        while (leftIndex < leftArray.size() || rightIndex < rightArray.size()) {
            if (rightIndex >= rightArray.size() || (leftIndex < leftArray.size()) && leftArray.get(leftIndex) <= rightArray.get(rightIndex)) {
                tempNum.add(leftArray.get(leftIndex));
                leftIndex++;
            } else {
                tempNum.add(rightArray.get(rightIndex));
                rightIndex++;
            }
        }

        return tempNum;
    }

    private static List<Integer> getAscendingOrder2(List<Integer> numbers){
        if(numbers.size()<2){
            return numbers;
        }
        List<Integer> leftArray = new  ArrayList<>((numbers.size()/2) + numbers.size()%2);
        List<Integer> rightArray = new  ArrayList<>((numbers.size()/2));
        int leftIndex = 0;
        int rightIndex = numbers.size()-1;
        while (leftIndex <= rightIndex){
            if(leftIndex < rightIndex){
                rightArray.add(numbers.get(rightIndex));
                rightIndex--;
            }
                leftArray.add(numbers.get(leftIndex));
            leftIndex++;
        }

        leftArray = getAscendingOrder2(leftArray);
        rightArray = getAscendingOrder2(rightArray);
        leftIndex=0;
        rightIndex=0;
        List<Integer> tempNum = new ArrayList<>();
        while (leftIndex < leftArray.size() || rightIndex<rightArray.size()){
            if(rightIndex >= rightArray.size() || (leftIndex < leftArray.size()) && leftArray.get(leftIndex)<= rightArray.get(rightIndex)){
                tempNum.add(leftArray.get(leftIndex));
                leftIndex++;
            } else {
                tempNum.add(rightArray.get(rightIndex));
                rightIndex++;
            }
        }

        return tempNum;
    }

    private static int[] getAscendingOrder3(int[] numbers, int start, int end){
        if(end-start < 2){
            return  Arrays.copyOfRange(numbers,start,end);
        }
        int mid = (end+start)/2;
        int [] leftArray = getAscendingOrder3(numbers,start,mid);
        int [] rightArray = getAscendingOrder3(numbers,mid,end);
        int leftIndex=0;
        int rightIndex=0;
        int count = 0;
        int[] tempNum = new int[leftArray.length+rightArray.length];
        while (leftIndex < leftArray.length || rightIndex<rightArray.length){
            if(rightIndex >= rightArray.length || (leftIndex < leftArray.length) && leftArray[leftIndex]<= rightArray[rightIndex]){
                tempNum[count]=leftArray[leftIndex];
                leftIndex++;
            } else {
                tempNum[count] = rightArray[rightIndex];
                rightIndex++;
            }
            count++;
        }
        return tempNum;
    }

    private static int[] getAscendingOrder4(int[] numbers){
        if(numbers.length<2){
            return numbers;
        }
        int[] leftArray = new int[(numbers.length/2) + (numbers.length%2)];
        int[] rightArray = new int[(numbers.length/2)];
        int leftIndex = 0;
        int rightIndex = numbers.length-1;
        int count = 0;
        while (leftIndex <= rightIndex){
            if(leftIndex < rightIndex){
                rightArray[count] = numbers[rightIndex];
                rightIndex--;
            }
            leftArray[count]= numbers[leftIndex];
            leftIndex++;
            count++;
        }

        leftArray = getAscendingOrder4(leftArray);
        rightArray = getAscendingOrder4(rightArray);
        leftIndex=0;
        rightIndex=0;
        count = 0;
        int[] tempNum = new int[leftArray.length+rightArray.length];
        while (leftIndex < leftArray.length || rightIndex<rightArray.length){
            if(rightIndex >= rightArray.length || (leftIndex < leftArray.length) && leftArray[leftIndex]<= rightArray[rightIndex]){
                tempNum[count]=leftArray[leftIndex];
                leftIndex++;
            } else {
                tempNum[count] = rightArray[rightIndex];
                rightIndex++;
            }
            count++;
        }

        return tempNum;
    }
}
