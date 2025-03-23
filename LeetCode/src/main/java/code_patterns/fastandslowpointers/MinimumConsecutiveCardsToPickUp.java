package code_patterns.fastandslowpointers;

import java.util.HashMap;
import java.util.Map;

public class MinimumConsecutiveCardsToPickUp {
    public static void main(String[] args) {
        int[] cards = {3,4,5,3,5,4,7};
        System.out.println(minimumCardPickup(cards));
    }

    public static int minimumCardPickup(int[] cards) {
        Map<Integer,Integer>num = new HashMap<>();
        int sum = Integer.MAX_VALUE;
        for (int rightIndx = 0; rightIndx < cards.length;rightIndx++){
            if ((num.get(cards[rightIndx]) != null  )){
                    sum = Math.min(sum,(rightIndx - num.get(cards[rightIndx])+1));
            }
           num.put(cards[rightIndx], rightIndx);
        }
        return (sum == Integer.MAX_VALUE) ? -1 : sum;
    }
}
