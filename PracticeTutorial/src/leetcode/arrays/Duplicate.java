package leetcode.arrays;

import java.util.HashSet;
import java.util.Set;

public class Duplicate {
    public static void main(String[] args) {
        int [] arrOfNum = {1,2,3,4};
        containsDuplicate(arrOfNum);

    }
    public static boolean containsDuplicate(int[] nums) {
        if(nums.length>1 && nums[0] == nums[1]){
            return true;
        }
        int maxNum = Integer.MIN_VALUE;
        int minNum = Integer.MAX_VALUE;
        for(int num : nums){
            if(num > maxNum ){
                maxNum = num;
            }
            if(num < minNum){
                minNum = num;
            }
        }
        boolean [] arr = new boolean[(maxNum-minNum)+1];
        for(int i = 0; i < nums.length; i++){
            if(arr[(nums[i]-minNum)] == true){
                return true;
            }
            arr[(nums[i]-minNum)] = true;
        }
        return false;
    }
    public static boolean containsDuplicate2(int[] nums) {
        Set<Integer> setOfIntegers = new HashSet<>();
        int numOfElements = 1;
        for(int num:nums){
            setOfIntegers.add(num);
            if(setOfIntegers.size()!=numOfElements){
                return true;
            }
            numOfElements++;
        }
        return false;
    }
}
