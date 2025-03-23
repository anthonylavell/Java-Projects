package practice.array;

import java.util.Arrays;

public class TestSum {
    public static void main(String[] args){
        //-4,-1,-1,0,1,2
        //-4,-1,-1,0,1,2,2,2
        //int [] nums = {-1,0,1,2,-1,-4};
        //int [] nums = {3,0,-2,-1,1,2};
        //int [] nums = {-4,-2,1,-5,-4,-4,4,-2,0,4,0,-2,3,1,-5,0};
        //int [] nums = {-1,-1,-1,-1,2,2,2,2,1,-4};
        int [] nums = {3,2,4};
        int target = 6;
      //List<List<Integer>> twoList= ThreeSum.isThreeSum(nums);
      // System.out.println(twoList);
        System.out.println(Arrays.toString(TwoSum.twoSum(nums,target)) );

    }


}
