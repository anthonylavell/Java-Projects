/*
Imagine that you are going fishing at the local pond.
A bait can only catch a fish if the bait's size is strictly
smaller than the fish's size. Once a fish is caught, it is
removed from the pond and cannot be caught again. However,
each bait can be used up to three times before depletion.

Given two arrays, fish and baits, where fish[i] corresponds to the
size of the ith fish in the pond and baits[j] corresponds to the
size of the jth bait, your task is to return the maximum number of
fish you can catch from the pond with the given baits.

To compute the answer, you need to use each bait to its possible extent,
going from the largest bait to the smallest bait. Use each bait to catch
the largest fish remaining in the pond and move to the next bait if the
current bait was used three times or if it is not strictly smaller than the
largest remaining fish. When you run out of bait, return the number of caught fish.
 */

package capital_one;

import java.util.Arrays;

public class FishingGame {
    public static void main(String[] args) {
        // Example test arrays.
        int[] fish = {5, 3, 4, 2};
        int[] baits = { 3};

        int result = maxFishCaught(fish, baits);
        System.out.println("Maximum number of fish caught: " + result);
    }

    public static int maxFishCaught(int [] fish, int [] baits) {
        int caught = 0;
        int fishIndex =fish.length-1;
        Arrays.sort(fish);
        Arrays.sort(baits);
        for (int baitIndex = baits.length-1; baitIndex >=0; baitIndex--){
            int useBait = 3;
            while (fishIndex >=0 && useBait-- >0){
                if(baits[baitIndex] >= fish[fishIndex]){
                    break;
                }
                caught++;
                fishIndex--;
            }
        }
        return caught;
    }
}
