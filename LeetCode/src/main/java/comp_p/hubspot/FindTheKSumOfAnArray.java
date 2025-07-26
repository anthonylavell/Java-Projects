package comp_p.hubspot;

import javafx.util.Pair;

import java.util.Arrays;
import java.util.PriorityQueue;
import java.util.Queue;

public class FindTheKSumOfAnArray {
    public static void main(String[] args) {
        int [] nums = {2,4,-2};
        int k = 5;
        System.out.println(kSum(nums,k));
    }

    public static long kSum(int[] nums, int k) {
        long sum = 0;
        Queue<long[]> queue = new PriorityQueue<>((a,b) -> Long.compare(b[0],a[0]));
        for (int num : nums){
            sum+=Math.max(0,num);
        }
        for (int i = 0; i < nums.length; i++) {
            nums[i] = Math.abs(nums[i]);
        }
        Arrays.sort(nums);
        long result = sum;
        queue.offer(new long[] {(sum - nums[0]),0});
        while (--k > 0) {
            long[] tempLong = queue.poll();
            result = tempLong[0];
            int index =(int) tempLong[1];
            if (index < nums.length - 1) {
                queue.offer(new long[] {(result + (nums[index] - nums[index + 1])), index + 1});
                queue.offer(new long[] {(result - nums[index + 1]), index + 1});
            }
        }
        return result;
    }

    public long kSum2(int[] nums, int k) {
        long sum = 0;
        Queue<Pair<Long, Integer>> pq = new PriorityQueue<>((a, b) -> Long.compare(b.getKey(), a.getKey()));
        for (int num : nums){
            sum+=Math.max(0,num);
        }
        for (int i = 0; i < nums.length; i++) {
            nums[i] = Math.abs(nums[i]);
        }
        Arrays.sort(nums);
        long result = sum;
        pq.offer(new Pair<>(sum - nums[0], 0));
        while (--k > 0) {
            Pair<Long, Integer> pair = pq.poll();
            result = pair.getKey();
            int index = pair.getValue();
            if (index < nums.length - 1) {
                pq.offer(new Pair<>(result + nums[index] - nums[index + 1], index + 1));
                pq.offer(new Pair<>(result - nums[index + 1], index + 1));
            }
        }
        return result;
    }
}
