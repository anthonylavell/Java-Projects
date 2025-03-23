package practice.array;

import java.util.*;

public class ThreeSum {
    public static List<List<Integer>> isThreeSum (int [] nums){
        Arrays.sort(nums);
        Set<List<Integer>>setOfList = new HashSet<>();
        int index =0;
        int leftPos = index+1;
        int rightPos = nums.length-1;
        while (index < nums.length-2){
            if(index >0 && nums[index] == nums[index-1]){
                index++;
                leftPos = index+1;
                rightPos = nums.length-1;
            }
            if(leftPos < rightPos && (-(nums[index] + nums[rightPos]) <= nums[rightPos])){
                Integer b = nums[leftPos];
                Integer c = nums[rightPos];
                Integer target = -(b+c);
                if(nums[index] == target){
                    setOfList.add(new ArrayList<>(Arrays.asList(target,b,c)));
                    leftPos++;
                    while (nums[leftPos]== nums[leftPos-1] && leftPos < rightPos)
                        leftPos++;
                    rightPos--;
                    while (nums[rightPos]== nums[rightPos+1] && leftPos < rightPos)
                        rightPos--;
                } else if(nums[index] < target){
                    leftPos++;
                    while (nums[leftPos]== nums[leftPos-1] && leftPos < rightPos)
                        leftPos++;

                }else {
                    rightPos--;
                    while (nums[rightPos]== nums[rightPos+1] && leftPos < rightPos)
                    rightPos--;
                }
            }else {
                index++;
                leftPos = index+1;
                rightPos = nums.length-1;
            }

        }
        return new ArrayList<>(setOfList);
    }

}
