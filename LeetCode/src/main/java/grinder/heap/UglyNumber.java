package grinder.heap;

import java.util.HashSet;
import java.util.PriorityQueue;
import java.util.Set;

public class UglyNumber {
    public static void main(String[] args) {
        System.out.println(isUgly(14));
    }

    public static boolean isUgly(int n) {
        int [] primes = {2,3,5};
        int count = 0;
        while (count < primes.length&&n>0){
            if (n==1 ){
                return true;
            }else if(n%primes[count]==0){
                n/=primes[count];
            }else {
                count++;
            }
        }
        return false;
    }
    public static int nthUglyNumber(int n) {
        // WRITE YOUR BRILLIANT CODE HERE
        int [] primes = {2,3,5};
        PriorityQueue<Integer> queue = new PriorityQueue<>();
        Set<Integer>track = new HashSet<>();
        track.add(1);
        queue.add(1);
        int count = 0;
        while (!queue.isEmpty() && count++ < n-1 ){
            int num = queue.poll();
            for (int prime: primes){
                int val = num*prime;
                if (!track.contains(val)){
                    queue.add(val);
                    track.add(val);

                }

            }
        }
        return queue.poll();
    }

}
