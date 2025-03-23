package arraysandstrings.array;

import java.util.ArrayList;
import java.util.List;

public class FindAllDuplicatesArray {
    public static void main(String[] args) {
        int [] nums = {4,3,2,7,8,2,3,1};
        findDuplicates(nums);
    }

    public static List<Integer> findDuplicates(int[] nums) {
        List<Integer> listOfIntegers = new ArrayList<>();
        int highestNum = 0;
        for(int num : nums){
            if(highestNum < num){
                highestNum = num;
            }
        }
        int [] countInt = new int[++highestNum];
        for(int num : nums){
            countInt[num]++;
        }
        for(int i = 0; i < countInt.length; i++){
            if(countInt[i] > 1){
                listOfIntegers.add(i);
            }
        }
        return listOfIntegers;

    }
    public static List<Integer> findDuplicates2(int[] nums) {
        List<Integer> listOfIntegers = new ArrayList<>();
        int counter = 0;
        while (counter < nums.length){
            if(nums[counter] != 0 && nums[counter]-1 != counter){
                if(nums[counter] == nums[nums[counter]-1]){
                    listOfIntegers.add(nums[counter]);
                    nums[counter] = 0;
                }else {
                    int swap = nums[counter];
                    nums[counter] = nums[swap-1];
                    nums[swap-1] = swap;
                    continue;
                }
            }
            counter++;
        }
        return listOfIntegers;
    }
}
