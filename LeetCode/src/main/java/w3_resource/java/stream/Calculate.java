package w3_resource.java.stream;

import java.util.*;

public class Calculate {
    public static int getSum(List<Integer>intList){
        return intList.stream().mapToInt(Integer::intValue).sum();
    }
    public static double getAverage(List<Integer>intList){
        double average = intList.stream().mapToDouble(Integer::doubleValue).average().orElse(0.0);
        return average;
    }

    public static int getEvenAverage(List<Integer>intList) {
        return intList.stream().filter(num -> num % 2 == 0).mapToInt(Integer::intValue).sum();
    }
    public static int getOddAverage(List<Integer>intList){
        return intList.stream().filter(num->num%2==1).mapToInt(Integer::intValue).sum();
    }

    public static boolean containItem(List<String>listOfStr,String word){
        return listOfStr.stream().anyMatch(str->str.contains(word));
    }

    public static List<String> upperCaseString(List<String>listOfStr){
        return listOfStr.stream().map(String::toUpperCase).toList();
    }

    public static List<String> lowerCaseString(List<String>listOfStr){
        return listOfStr.stream().map(String::toLowerCase).toList();
    }

    public static List<Character> removeDupChar(List<Character> listOfStr){

        return listOfStr.stream().distinct().toList();
    }

    public static List<Integer> removeDupNum(List<Integer>listOfNumber){

        return listOfNumber.stream().distinct().toList();
    }

    public static List<Integer> findDuplicates(int[] nums) {
        Set<Integer>setOfInts = new HashSet<>(nums.length);
        return Arrays.stream(nums).boxed().filter(num->!setOfInts.add(num)).toList();
    }

    public static int getCalculateSum(int[]nums){
        return Arrays.stream(nums).boxed().mapToInt(Integer::intValue).sum();
    }
    public static void main(String[] args) {
        List <Integer> numbers = List.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
        List<String> listOfStr = List.of("anthony","ward","lavell");
        List<Character> listOfDup = List.of('l','l','a','n','a');
        int []  nums = {4,3,2,7,8,2,3,1};
        Set<Integer> set = new HashSet<>();
        List<Integer> integers = new ArrayList<>(set);
       // System.out.println(listOfStr);
        //System.out.println(upperCaseString(listOfStr));
        /*System.out.println(getEvenAverage(numbers));
        System.out.println(getOddAverage(numbers));
        System.out.println(removeDupChar(listOfDup));
        System.out.println(getSum(numbers));
        System.out.println(containItem(listOfStr,"ward2"));
        System.out.println(findDuplicates(nums));*/
        List<Integer> listOfNums = Arrays.asList(1, 2, 3, 4, 5);
        int[]nums2 = {1, 2, 3, 4, 5};
        System.out.println(getCalculateSum(nums2));
    }
}
