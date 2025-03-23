package challenges.amazon_challenge.client;

import challenges.amazon_challenge.array.Sum;

import java.util.Arrays;

public class SumClient {
    public static void main(String[] args) {
        int target = 9;
        int [] nums = {2, 7, 11, 15};
        System.out.println(Arrays.toString(Sum.twoSum(nums,target)));
    }
}
