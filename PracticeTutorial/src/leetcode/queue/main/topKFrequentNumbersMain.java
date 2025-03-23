package leetcode.queue.main;

import leetcode.queue.topKFrequentNumbers;

public class topKFrequentNumbersMain {
    public static void main(String[] args) {
        //int [] nums = {1,2,4,3,3,6,5};
        int [] nums = {3,2,3,1,2,4,5,5,6};
        int k =4;
        System.out.println(topKFrequentNumbers.FrequentNumbers(nums,k));
    }
}
