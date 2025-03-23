package code.pattern.two_pointers;

import java.util.*;

public class MinimumConsecutiveCardsToPickUp {
    public static void main(String[] args) {
        List<Integer> cards = new ArrayList<>(Arrays.asList(3,4,5,3,5,4,7));
        System.out.println(leastConsecutiveCardsToMatch(cards));
    }

    public static int leastConsecutiveCardsToMatch(List<Integer> cards) {
        // WRITE YOUR BRILLIANT CODE HERE
        Map<Integer,Integer> num = new HashMap<>();
        int sum = Integer.MAX_VALUE;
        for (int rightIndx = 0; rightIndx < cards.size();rightIndx++){
            if ((num.get(cards.get(rightIndx)) != null  )){
                sum = Math.min(sum,(rightIndx - num.get(cards.get(rightIndx))+1));
            }
            num.put(cards.get(rightIndx), rightIndx);
        }
        return (sum == Integer.MAX_VALUE) ? -1 : sum;
    }
}
