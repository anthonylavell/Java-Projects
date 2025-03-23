package code.pattern.two_pointers.prefix_sum;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class ProductOfArrayExceptSelf {
    public static void main(String[] args) {
        List<Integer> nums = new ArrayList<>(Arrays.asList(-1,1,0,-3,3));
        System.out.println(productOfArrayExceptSelf(nums));
    }

    public static List<Integer> productOfArrayExceptSelf(List<Integer> nums) {
        List<Integer> subTotal = new ArrayList<>();
        int count = 1;
        //PreFix
        for(int num : nums){
            subTotal.add(count);
            count*=num;
        }

        count = 1;
        //Suffix
        for(int index = nums.size()-1; index >= 0 ; index--){
            subTotal.set(index,subTotal.get(index) * count);
            count*=nums.get(index);
        }
        return subTotal;
    }
}
